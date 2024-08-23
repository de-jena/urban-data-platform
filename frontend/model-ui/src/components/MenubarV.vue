<script setup lang="ts">
import { ref } from "vue";
import Menubar from "primevue/menubar";
import Badge from "primevue/badge";
import InputText from "primevue/inputtext";
import Avatar from "primevue/avatar";
import Breadcrumb from "primevue/breadcrumb";
const items = ref([

]);
const home = ref({
  icon: 'pi pi-home'
});
const itemsb = ref([
  { label: 'Modeling' },

]);
</script>

<template>
  <Menubar :model="items" class="margin">
    <template #start>
      <Breadcrumb :home="home" :model="itemsb" />
    </template>

    <template #end>
      <div class="flex items-center gap-2">
        <InputText placeholder="Search" type="text" class="w-32 sm:w-auto" />
      </div>
    </template>
  </Menubar>
</template>

<style scoped>

</style>
