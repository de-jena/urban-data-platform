<script setup lang="ts">


import {type Component, computed, onMounted, ref, watch} from "vue";
//@ts-ignore


import ComposerVue from "@/modelUiBuilder/impl/components/composer/ComposerVue.vue";
import Splitter from "primevue/splitter";
import SplitterPanel from "primevue/splitterpanel";
import {useResource} from "@/modelUiBuilder/impl/composeable/Resource";
import {
  EClass,
  EClassifier, EDataType,
  EList,
  EObject,
  EPackage,
  EPackageExt,
  EReference,
  isEClass,
  isEDataType, isEPackage,
  URI
} from "@/ecore";

import {Dimensions, MarkerType, NodeDragEvent, Position, useVueFlow, VueFlow, XYPosition} from '@vue-flow/core'
import { Background } from '@vue-flow/background';
import { Controls } from '@vue-flow/controls';
import { MiniMap } from '@vue-flow/minimap';
import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import PackageV from "@/components/Flow/PackageV.vue";
import ScrollPanel from 'primevue/scrollpanel';
import ClassV from "@/components/Flow/ClassV.vue";
import {useRouter} from "vue-router";

import type {Node} from '@vue-flow/core';
import {MODELING_PARAM} from "@/router";
import MenubarV from "@/components/MenubarV.vue";
import Tree from "@/components/Tree.vue";
import {useDataTypeHolder} from "@/modelUiBuilder/impl/composeable/DataTypeHolder";
import config from "@/config/config";
const model = ref<EObject|undefined>(undefined);
const instanceHolder = useInstanceHolder();
const router = useRouter();
const {onConnect,addEdges,onNodeDragStop,getNodes} = useVueFlow()
const PositionHolder = ref<Map<String,XYPosition>>(new Map<String,XYPosition>());
const DimensionsHolder = ref<Map<String,any>>(new Map<String,any>());
onMounted(async ()=> {
  const {loadResource,store,getResource} = useResource()
  const {setDataTypes} = useDataTypeHolder()

  await loadResource(new URI(config.ECORE_PATH));
  Array.from(getResource(config.ECORE_PATH)?.eAllContents()??[]).forEach(obj=>{
    if (isEDataType(<EClassifier>obj)){
      const dt = obj as EDataType;
      setDataTypes(dt.name,dt);
    }
  })


});
watch(router.currentRoute,()=>{

  const {instanceid} = (router.currentRoute.value.params);
  model.value = useInstanceHolder().getInstance(instanceid as string)

})



const nodes = computed({
get:() =>{
  let ret:any = [];

  instanceHolder.instances.value.forEach((instance,key)=>{
    const pos = (PositionHolder.value.get(key))?PositionHolder.value.get(key):{ x: 20, y: 20 };
    const dim = (DimensionsHolder.value.get(key))?DimensionsHolder.value.get(key):{ width: '200px',height:'200px'};

    if('EPackage' == instance.eClass().name){

      const name = instance.eGet(instance.eClass().getEStructuralFeatureFromName('name'));
      const nsURI = instance.eGet(instance.eClass().getEStructuralFeatureFromName('nsURI'));
      const nsPrefix = instance.eGet(instance.eClass().getEStructuralFeatureFromName('nsPrefix'));

      ret.push({
        id: key,
        label: 'EPackage: ' + name +' ('+ nsURI+')',
        data: {  toolbarPosition: Position.Top,instance:instance},
        position: /*{ x: 100, y: 100 },*/pos,
        type: 'package',

        style: { backgroundColor: 'rgba(226,231,229,0.5)',...dim},
      })
    }
    if('EClass' == instance.eClass().name){

      const ePaclageId = instance.eClass().getEStructuralFeatureFromName('ePackage');
      console.log(instance.eGet(ePaclageId))
      const parent = instanceHolder.identify(instance.eGet(ePaclageId))
      console.warn(key+' --> '+parent);
      ret.push({
        id: key,
        label: 'EClass',
        data: {  toolbarPosition: Position.Top,instance:instance},
        position: /*{ x: 100, y: 100 },//*/pos,
        type: 'class',
        parentNode:parent,
        expandParent: true,
        style: {width: '200px'},//*/dim,
      })
    }

  })
  return ret
},
set:(val:Array<Node<any>>)=>{
  /*const map = new Map<String,XYPosition>();
  const map2 = new Map<String,any>();

  getNodes.value.map(e=>{
    map.set(e.id,e.computedPosition);
    map2.set(e.id,{height:e.dimensions.height+'px',width:e.dimensions.width+'px'});
  })

  PositionHolder.value = map;
  DimensionsHolder.value = map2;
*/
}
});
onNodeDragStop((param:NodeDragEvent)=>{
  console.log(param.node)
  const map = new Map<String,XYPosition>();
  const map2 = new Map<String,any>();

  getNodes.value.map(e=>{
    //map.set(e.id,e.position);
    PositionHolder.value.set(e.id ,e.position as XYPosition);
    DimensionsHolder.value.set(e.id,{height:e.dimensions.height+'px',width:e.dimensions.width+'px'});
  })

  //PositionHolder.value.set(param.node.id ,param.node.position as XYPosition);
  //DimensionsHolder.value.set(param.node.id,{height:param.node.dimensions.height+'px',width:param.node.dimensions.width+'px'});
  //DimensionsHolder.value = map2;

  //PositionHolder.value.set(param.node.id,param.node.position);
})

const edges = computed(()=>{
  let iedges:any = []
  instanceHolder.instances.value.forEach((instance,key)=>{

    if('EClass' == instance.eClass().name){


   const superTypeClassFeature = instance.eClass().getEStructuralFeatureFromName('eSuperTypes');
   const list = instance.eGet(superTypeClassFeature) as EList<EClass>;
   for (const entry of list){
     const id = instanceHolder.identify(entry);
     iedges.push({id:`${key}_${id}`,
       source:key,
       sourceHandle:key,
       target:id,
       markerEnd:MarkerType.ArrowClosed,
       type:'step'})
   }

      const referenceClassFeature = instance.eClass().getEStructuralFeatureFromName('eReferences');
      const list2 = instance.eGet(referenceClassFeature) as EList<EReference>;
      for (const entry of list2){

        const eReferenceType = entry.eGet(entry.eClass().getEStructuralFeatureFromName('eReferenceType'));
        const name = entry.eGet(entry.eClass().getEStructuralFeatureFromName('name'));
        let upperBound = -1;
        let lowerBound= 0;
        try{
            lowerBound = entry.eGet(entry.eClass().getEStructuralFeatureFromName('lowerBound'));
            upperBound = entry.eGet(entry.eClass().getEStructuralFeatureFromName('upperBound'));
        }catch (e){
          console.log(e);
        }


        const id = instanceHolder.identify(eReferenceType);
        let obj:any =
            {id:`${key}_${id}_${name}`
              ,source: key,
              target:id,
              sourceHandle:name,
              targetHandle:'target' ,
              type:'step',
              label:`[${lowerBound}:${upperBound}]` ,
              style: { stroke: 'orange','stroke-dasharray':"5,10,5" }};
        iedges.push(obj)
      }
    }

  })
  return iedges
})

const selectInstrance = (ev:any)=>{
  router.push({name:MODELING_PARAM,params:{instanceid:ev.node.id}});
}
onConnect((params)=>{
  const source = instanceHolder.getInstance(params.source);
  const target = instanceHolder.getInstance(params.target);

  const superTypeFeature = source?.eClass().getEStructuralFeatureFromName('eSuperTypes');
  if(superTypeFeature){
    const list = source?.eGet(superTypeFeature!) as EList<any>;
    list.add(target);
  }
})


</script>
<template>
  <Tree class="appmenu"></Tree>
  <div class="iflexed">

    <MenubarV></MenubarV>



  <Splitter style="height: 100%" layout="vertical" class="margin">
    <SplitterPanel class="flex items-center justify-center">
      <VueFlow v-model:nodes="nodes"  :edges="edges"  elevate-edges-on-select >

          <template #node-package="props">
            <PackageV :id="props.id" :data="props.data" :label="props.label"  @nodeClick="selectInstrance" />
          </template>
        <template #node-class="props">
          <ClassV :id="props.id" :data="props.data" :label="props.label"  @nodeClick="selectInstrance" class="vClass"/>
        </template>

        <MiniMap />

        <Controls />

        <Background />
      </VueFlow>
    </SplitterPanel>
    <SplitterPanel class="flex items-center justify-center relative">
      <ScrollPanel  class="full_abs">
        <ComposerVue v-model="model" v-if="model">

        </ComposerVue>
      </ScrollPanel>
    </SplitterPanel>
  </Splitter>

  </div>

</template>
<style lang="scss">
@import 'https://cdn.jsdelivr.net/npm/@vue-flow/core@1.39.0/dist/style.css';
@import 'https://cdn.jsdelivr.net/npm/@vue-flow/core@1.39.0/dist/theme-default.css';
@import 'https://cdn.jsdelivr.net/npm/@vue-flow/controls@latest/dist/style.css';
@import 'https://cdn.jsdelivr.net/npm/@vue-flow/minimap@latest/dist/style.css';
@import 'https://cdn.jsdelivr.net/npm/@vue-flow/node-resizer@latest/dist/style.css';
@import '@/scss/theme-blue.scss';
.vue-flow__node-toolbar {
  display: flex;
  gap: 0.5rem;
  align-items: center;
  background-color: #2d3748;
  padding: 8px;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.5);
}

.vue-flow__node-toolbar button {
  background: #4a5568;
  color: white;
  border: none;
  padding: 0.5rem 1rem;
  border-radius: 8px;
  cursor: pointer;
}

.vue-flow__node-toolbar button.selected {
  background-color: hsla(160, 100%, 37%, 0.2);
}

.vue-flow__node-toolbar button:hover {

  background-color: hsla(160, 100%, 37%, 0.5);
}

.vue-flow__node-menu {
  padding: 16px 24px;
  border-radius: 8px;
  box-shadow: 0 0 10px rgba(0, 0, 0, 0.2);
}

.vue-flow__node-menu.selected {
  box-shadow: 0 0 0 2px hsla(160, 100%, 37%, 0.2)
}
.full_abs{
  position:absolute;
  left:0;
  right:0;
  top:0;
  bottom:0;
}
.relative{
  position:relative;
}
.vClass{
  height:auto;
  border-radius: 6px;
  padding: 5px;
}
.active {
  border: 1px dashed $base-color;
  border-radius: 7px;
}
.iflexed{
  display: grid;
  grid-template-rows: 110px 1fr;
  /* height: 100%; */
  position: absolute;
  right: 0;
  left: 340px;
  top: 0;
  bottom: 0;

}
</style>
