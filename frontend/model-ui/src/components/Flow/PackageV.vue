<script  lang="ts" setup>
import {Handle, Position, useVueFlow} from '@vue-flow/core'
import { NodeToolbar } from '@vue-flow/node-toolbar'
import {EClass, EObject, URI, EPackage, BasicEObjectList, EClassImpl, EcorePackageImpl, EcoreFactory} from "@/ecore";
import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import {useResource} from "@/modelUiBuilder/impl/composeable/Resource";
import ShortUniqueId from "short-unique-id";
import {MODELING_PARAM} from "@/router";
import {useRouter} from "vue-router";
import config from "@/config/config";
import {toRaw} from "vue";



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


  const efc:EcoreFactory = useResource().ecorePackage.eFactoryInstance;
  const pack = toRaw(props.data.instance);
  const aclass =  efc.createEClassFromContainer(pack)
  const id =uid.rnd();
  useInstanceHolder().setInstance(id,aclass);
  router.push({name:MODELING_PARAM,params:{instanceid:id}})
}
const addEAnnotation = ()=>{

  const efc:EcoreFactory = useResource().ecorePackage.eFactoryInstance;
  const pack = toRaw(props.data.instance);
  const aeanno =  efc.createEAnnotationFromContainer(pack)
  const id =uid.rnd();
  useInstanceHolder().setInstance(id,aeanno);
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
