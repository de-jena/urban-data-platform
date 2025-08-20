# Humidity Sensor Rules Implementation

### The Model 

We considered the `SolidosTeros21` chirpstack provider. In the corresponding EMF model, this provider has a service `sensor` which contains two resources, `potentialWater1` and `potentialWater2`, that we assumed being in `kPa`.

We then generalize our rules, to accept providers with a similar structure but with an arbitrary number of resources, such as `potentialWater*`, with `*` being a number. 

### Rule 1 - Definition

Starting from the measured value of the *soil water tension* (also called as *suction tension* or *matrix potential*), we have to convert it in hectopascals (`hPa`). This quantity can be given in:

+ in meters of water column (mWS) 
+ in Pascal (Pa)
+ kPa

so the conversion has to be made accordingly.

### Rule 1 - Implementation

This rule triggers every time a provider named `chirpstack-<something>`, with a service called "sensor" and a resource named `potentialWater<some-number>` is updated.

The corresponding action loops over the selected providers and resources in order to find the ones that actually triggered the rule. The criterion is based on the `$timestamp` of the updated resources. Once found the resources that have been updated, the corresponding derived quantity is calculated and updated through the provider/service/resource `chirpstack-<something>-derived/derivedQuantities/potentialWaterHPa<some-number>`.



### Rule 2 - Definition

Starting from the value of the *soil water tension* in `hPa`, we should calculate another quantity (`pf-Wert`), through the formula:

```math
\log(|(\psi)|)
```

This quantity is known as `pf-Wert` and its definition can be found [here](https://de.wikipedia.org/wiki/PF-Wert). 

### Rule 2 - Implementation

This rule triggers every time a provider named `chirpstack-<something>-derived`, with a service called `derivedQuantities` and a resource named `potentialWaterHPa<some-number>` is updated.

The corresponding action loops over the selected providers and resources in order to find the ones that actually triggered the rule. The criterion is based on the `$timestamp` of the updated resources. Once found the resources that have been updated, the corresponding `chirpstack-<something>-derived/derivedQuantities/pfWert<some-number>` is updated with the value of the `pfWert`, starting from the `potentialWaterHPa`.



### Rule 3 - Definition

We have to compute the average value among the different `pf-Wert` coming from different sensors of the same device

### Rule 3 - Implementation

This rule triggers every time a provider named `chirpstack-<something>-derived`, with a service called `derivedQuantities` and a resource named `pfWert<some-number>` is updated.

The corresponding action loops over the selected provider and, based on the `$timestamp` of the `pfWert` resources, it finds the provider that actually triggered the rule. Then it computes, for that provider, the average among all its `pfWert` resources and updates the corresponding `chirpstack-<something>-derived/derivedQuantities/pfWertAvg` resource.



### Rule 4 - Definition

Based on the averaged value computed in Rule 3, we have to compute an additional quantity, whose value is a color code.

``` java
if(avg < 1.8) return "Blau";
if(avg <= 3.) return "Grün";
if(avg <= 3.6) return "Gelb";
return "Rot";
```

### Rule 4 - Implementation

This rule triggers every time a provider named `chirpstack-<something>-derived`, with a service called `derivedQuantities` and a resource named `pfWertAvg` is updated.

The corresponding action loops over the selected provider and, based on the `$timestamp` of the `pfWertAvg` resources, it finds the provider that actually triggered the rule. Then it updates the corresponding `color` resource of the same provider, based on the aforementioned formula. 



