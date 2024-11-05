<script setup lang="ts">
import {computed, ref} from "vue";

import Button from "primevue/button";
import {useResource} from "@/modelUiBuilder/impl/composeable/Resource";

import router, {INSTANCE_PAGE, MODELING_PARAM, NEW_INSTANCE_PAGE} from "@/router";
import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import {isEPackage} from "@/ecore/EPackageExt";
import {
  EClass,
  EClassifier,
  EDataType,
  EPackage,
  EResource,
  isEDataType,
  URI,
  EPackageImpl,
  EcorePackageImpl, EcoreFactory
} from "@/ecore";
import {isEClass} from "@/ecore/EClassExt";
import ShortUniqueId from "short-unique-id";
import {useDataTypeHolder} from "@/modelUiBuilder/impl/composeable/DataTypeHolder";
import Tree from 'primevue/tree';
import {useRoute} from "vue-router";
import config from "@/config/config";


const uid = new ShortUniqueId({ length: 10 });

const items = ref([
  {
    separator: true
  },

  {
    label: 'no items',
    items: []
  }

]);
const {store,efc} = useResource()
const {instances,identify,getInstance} = useInstanceHolder();
const {setDataTypes} = useDataTypeHolder();
const route = useRoute();

const nodes = computed(()=>{

  let tree:any = [];
  let all:any = [];
  const _findinTree=(parent:any,item:string)=>{
    for(let r of parent){
      if (r.key === item){
        return r;
      }else {
        let ret:any =  _findinTree(r.children,item);
        if(ret) return ret;
      }
    }
    return undefined;
  };
  const _findParentAndAppend=(item:string)=>{
    let inst =  getInstance(item);

    if(inst){
      let name = '';
      let type = inst.eClass().name;
      try{
         name = inst.eGet(inst.eClass().getEStructuralFeatureFromName('name'));
      }
      catch (e){
        console.log(e);
      }


      const parentid = identify(getInstance(item)!.eContainer());
      if(parentid){
        const parent:any = _findinTree(tree,parentid!)
        if(parent){

          parent.children!.push({key:item,label:name||item,type:type,children:[]})
        }else{
          return item;
        }
      }
      else{
        tree.push({key:item,label:name||item,type:type,children:[]})
        return undefined;
      }
    }
    return undefined;
  };

  Array.from(instances.value.keys()).forEach((key)=>{
    //const id = identify(instance);
    all.push(key);
  });

  while (all.length!=0){
    const item = all.shift();
    const ret = _findParentAndAppend(item);
    if(ret) all.push(ret);
  }
  return tree;

})



const addEPackage = ()=>{
  const resUri = config.ECORE_PATH;

 // const className = 'EPackage';
  //const res = useResource().getResource(resUri);


  //let uris = new URI(resUri+'#//'+className);
  //const eClass = res?.eResourceSet().getEObject(uris,false) as EClass;


  //const instanceInternal:EPackage =eClass?.ePackage.eFactoryInstance.create(eClass);
  //instanceInternal.nsURI = 'http://de.test.epackage/test.ecore'
 // const ePack = eClass.getEStructuralFeatureFromName('ePackage');

  const apackage =  efc.createEPackage()
  console.log(apackage)

  const id =uid.rnd();
  useInstanceHolder().setInstance(id,apackage);


  //const p2 = useInstanceHolder().getInstance(id);
  //console.log(p2)
  //console.log(p2==apackage)
    //if (instances.eClass().name == 'EPackage') {
  router.push({name:MODELING_PARAM,params:{instanceid:id}})
}

const selectedKey = computed({
  get:()=>{
      if(route.params.instanceid){
        const obj:any = {}
        obj[(route.params.instanceid as string)]=true
        return obj;
      }else{
        return undefined;
      }
  },
  set:(id:any)=>{
    console.log(Object.keys(id)[0]);
    router.push({name:MODELING_PARAM,params:{instanceid:Object.keys(id)[0]}});
  }
})
</script>

<template>
  <div class="sidebar margin">
    <div style="height:25px"></div>
    <button @click="addEPackage">+ EPackage</button>
    <Tree :value="nodes" :filter="true" filterMode="lenient" v-model:selectionKeys="selectedKey" selectionMode="single" class="w-full md:w-[30rem]">

      <template #nodeicon="slotProps:any">
          <div class="icon" :class="slotProps.node.type">{{(slotProps.node.type=='EAnnotation')?'@':slotProps.node.type.substring(1,2)}}</div>
      </template>
    </Tree>
  </div>
</template>

<style>
.margin{

  margin: 15px;

}
.font-semibold{
  margin: 15px;
  font-weight: bold;
}
</style>
<style scoped lang="scss">
@import "@/scss/theme-blue.scss";

 .icon{
   border-radius: 9px;
   border: 1px solid transparent;
   height: 15px;
   width: 15px;
   font-size: 10px;
   background: transparent;
   color: #fff;
   display: flex;
   flex-direction: row;
   align-content: center;
   justify-content: center;
   align-items: center;
   &.EClass{
     color: $class;
     border: 1px solid $class;
   }
   &.EPackage{
     color: $package;
     border: 1px solid $package;
   }
   &.EAttribute{
     color: $attritbute;
     border: 1px solid $attritbute;
   }
   &.EReference{
     color: $reference;
     border: 1px solid $reference;
   }
   &.EDataType{
     color: $dataType;
     border: 1px solid $dataType;
   }
   &.EOperation{
     color: $operation;
     border: 1px solid  $operation;
   }
   &.EAnnotation{
      color: $annotation;
     border: 1px solid $annotation;
   }
 }
.p-tree-node-selected{
  .icon{
    color: #fff;
    border: 1px solid #fff;
  }
}
</style>
