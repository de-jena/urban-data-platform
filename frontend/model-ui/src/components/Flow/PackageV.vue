<script  lang="ts" setup>
import {Handle, Position, useVueFlow} from '@vue-flow/core'
import { NodeToolbar } from '@vue-flow/node-toolbar'
import {EClass, EObject, URI} from "@/ecore";
import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import {useResource} from "@/modelUiBuilder/impl/composeable/Resource";
import ShortUniqueId from "short-unique-id";
import {MODELING_PARAM} from "@/router";
import {useRouter} from "vue-router";
import config from "@/config/config";



interface NodeData {
  toolbarVisible: boolean
  toolbarPosition: Position
  instance:EObject;
}

interface Props {
  data: NodeData
  label: string
  id:string
}

const props = defineProps<Props>();
const emits =defineEmits(['nodeClick'])
const uid = new ShortUniqueId({ length: 10 });
const router = useRouter();
const {getInstance} = useInstanceHolder();
const {

  onNodeClick,

} = useVueFlow()

const {store} = useResource();
onNodeClick((event) => {
  emits('nodeClick',event)
})

const addEClass = ()=>{
  const resUri = config.ECORE_PATH;
  const className = 'EClass';
  const res = (store.value.find(e=>e.res?.eURI.toString() == resUri))?.res


  let uris = new URI(resUri+'#//'+className);
  const eClass = res?.eResourceSet().getEObject(uris,false) as EClass;

  const instanceInternal =eClass?.ePackage.eFactoryInstance.create(eClass);
  const ePack = eClass.getEStructuralFeatureFromName('ePackage');
  instanceInternal?.eSet(ePack,props.data.instance);
  //eClass.ePackage.eFactoryInstance.createFromString(eClass.instanceTypeName.)

  const id =uid.rnd();
  useInstanceHolder().setInstance(id,instanceInternal);
  router.push({name:MODELING_PARAM,params:{instanceid:id}})
}
const addEAnnotation = ()=>{
  const resUri = config.ECORE_PATH;
  const className = 'EAnnotation';
  const res = (store.value.find(e=>e.res?.eURI.toString() == resUri))?.res


  let uris = new URI(resUri+'#//'+className);
  const eClass = res?.eResourceSet().getEObject(uris,false) as EClass;

  const instanceInternal =eClass?.ePackage.eFactoryInstance.create(eClass);
  const apackage = getInstance(props.id);
  const annolist = apackage?.eGet(apackage?.eClass().getEStructuralFeatureFromName('eAnnotations'));
  annolist.add(instanceInternal)

  //eClass.ePackage.eFactoryInstance.createFromString(eClass.instanceTypeName.)

  const id =uid.rnd();
  useInstanceHolder().setInstance(id,instanceInternal);
  router.push({name:MODELING_PARAM,params:{instanceid:id}})
}
</script>

<template>
  <div>
  <NodeToolbar :is-visible="data.toolbarVisible" :position="data.toolbarPosition">

    <button @click="addEAnnotation">+ EAnnotation</button>
    <button @click="addEClass">+ EClass</button>
    <button>+ EDataType</button>
    <!--<button>+ EEnum</button>
    <button>+ EPackage</button>-->

  </NodeToolbar>

  <div>
    {{ label }}
    {{props.id}}
  </div>
  </div>


</template>
