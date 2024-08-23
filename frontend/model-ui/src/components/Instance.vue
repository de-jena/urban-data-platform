<script setup lang="ts">
import {onMounted, ref, watch} from "vue";
import {useRoute, useRouter} from "vue-router";
  import ComposerVue from "@/modelUiBuilder/impl/components/composer/ComposerVue.vue";
import {useResource} from "@/modelUiBuilder/impl/composeable/Resource";

  const router = useRouter();
  const route = useRoute();
  const {store} = useResource()
  const instance = ref<EObject|undefined>(undefined);
import {useInstanceHolder} from "@/modelUiBuilder/impl/composeable/InstanceHolder";
import {EObject, URI} from "@/ecore";
import AppMenu from "@/components/AppMenu.vue";
import MenubarV from "@/components/MenubarV.vue";
import config from "@/config/config";

  onMounted(async ()=>{
    const {loadResource,store} = useResource()
    await loadResource(new URI(config.ECORE_PATH));
    loadup();
  });
  watch(route,()=>{
    loadup();
  })
  const loadup = ()=>{
  const {instanceid} = (router.currentRoute.value.params);
  console.log(store.value);
  instance.value = useInstanceHolder().getInstance(instanceid as string);
}



</script>

<template>
  <AppMenu class="appmenu"></AppMenu>
  <div class="flex">
    <MenubarV></MenubarV>

  <ComposerVue v-model="instance" v-if="instance"></ComposerVue>
  </div>
</template>

<style scoped lang="scss">
.flex{
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
