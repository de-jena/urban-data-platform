<script setup lang="ts">
import {computed, ref, watch} from "vue";
import PickList from 'primevue/picklist';
import Button from "primevue/button";

import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import {BasicEList, BasicEObjectList, EClassifier, type EObject, type EReference, isEDataType} from "@/ecore";
import {useDataTypeHolder} from "@/modelUiBuilder/impl/composeable/DataTypeHolder";



const props = defineProps<{feature:EReference}>()
const inst = defineModel<EObject>();

const instancesHolder = useInstanceHolder();
const dataTypeHolder = useDataTypeHolder();
const avialableList = computed(()=>{
  //props.feature.eReferenceType

  const intnaces = instancesHolder.findInstancesByClass(props.feature.eReferenceType);
  let ret:Array<{id:string,instance:EObject,name:string}> = [];
  intnaces.forEach((value, key, map)=>{
    if(!Array.from(listofRefs.value.values()).map(e=>e.id).includes(key)){
      const name = value.eGet(value.eClass().getEStructuralFeatureFromName('name'));
      ret.push({id:key,instance:value,name:name})
    }

  })
  if(props.feature.eType.name == 'EDataType' || props.feature.eType.name == 'EClassifier'){
    Array.from(dataTypeHolder.datatypes.value.values()).forEach(dt=>{
      ret.push({id:dt.name,instance:dt,name:dt.name})
    })
  }
  return ret;
})
const listofRefs = computed(()=>{
  let map:Array<{id:string,instance:EObject,name:string}> = []

  if(props.feature.upperBound==1){
    const i:EClassifier = inst.value?.eGet(props.feature)
    if(i){
      if(isEDataType(i)){
        map.push({id: i.name??'unknown', instance: i,name:i.name})
      }
      else {
        const name = i.eGet(i.eClass().getEStructuralFeatureFromName('name'));
        map.push({id: instancesHolder.identify(i)??'unknown', instance: i,name:name})
      }

    }

  }else{
    const listofInstances:BasicEObjectList<any> = inst.value?.eGet(props.feature)
    if(listofInstances) {
      const arr = listofInstances.toArray();
      map = arr.map((i: any) => {
        if(isEDataType(i)){
          return {id: i.name??'unknown', instance: i,name:i.name}
        }
        else {
          const name = i.eGet(i.eClass().getEStructuralFeatureFromName('name'));
          return {id: instancesHolder.identify(i)??'unknown', instance: i,name:name}
        }
      })
    }
  }


  return map;
})
const list = ref([avialableList.value,listofRefs.value]);



const set = (val:any)=>{
  const list:BasicEObjectList<EObject> = inst.value!.eGet(props.feature)
  const instances = val[1].map((e:{id:string,instance:EObject})=> e.instance)
  if(props.feature.upperBound==1){
    const ref =  inst.value?.eGet(props.feature);
    inst.value?.eSet(props.feature,instances[0]);
  }else{

    const bel = new BasicEList(instances);
    //console.log(list)
    /*for (let i = 0; i<list.toArray().length;i++){
      list.removeAt(i)
    }*/
   //  list.clear();
    //list.removeAt(0)


    //list.clear()
   // let set = new Set();
   //let arr = val[1].map((e:{id:string,instance:EObject})=>e.instance);

   //console.log(instances)
    //list.insertAll(0,instances);
    /*instances.forEach((e:EObject)=> {
      console.log(e);

      list.add(e);
    });*/
   //   set.add(e);
    //});

    //  list.add(e);
//
 //   })

    //console.log(props.feature);
    //console.log(list.toArray().length);
    inst.value?.eSet(props.feature, bel);

  }
}
const remove = (re)=>{
  //console.log(re.items);
}



</script>

<template>
  <div class="input">

    <label :for="props.feature.name">{{props.feature.name}}({{props.feature.eType.name}})</label>
    <br>
    <Button label="+" />
      <PickList v-model="list" @update:modelValue="set" @move-to-source="remove" dataKey="id" breakpoint="1400px" :showSourceControls="false" :showTargetControls="false">

        <template #option="{ option  }">
          {{ option.name||option.id}}
        </template>

      </PickList>

  </div>
</template>

<style scoped>

</style>
