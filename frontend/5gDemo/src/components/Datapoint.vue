<!--
  Copyright (c) 2023 Contributors to the  Eclipse Foundation.

  This program and the accompanying materials are made
  available under the terms of the Eclipse Public License 2.0
  which is available at https://www.eclipse.org/legal/epl-2.0/

  SPDX-License-Identifier: EPL-2.0

  Contributors: Markus Hochstein
-->

<template>
  <div class="datapoint" v-if="isBool" :class="{'is_set':data,'unset':!data}">
        <span v-if="data">!</span>
  </div>
  <div class="datapoint" v-else>
    {{data}} {{unit}}
  </div>
</template>
<script lang="ts">

import {Component, Prop, Vue, Watch} from "vue-property-decorator";

@Component
export default class Datapoint extends Vue{
  private data = ''
  @Prop({default:()=>''}) readonly unit:any
  @Prop() readonly id:any
  @Prop() readonly isBool!:boolean;
  mounted(){
    /*setInterval(()=>{
      console.log(this.obs)
    },1000)*/
  }
  @Watch('$sstore.obs.state.obs') handler(data:any){
    //console.log(this.$sstore.obs.state.obs[this.id]);
    if(this.$sstore.obs.state.obs && this.$sstore.obs.state.obs[this.id] && this.$sstore.obs.state.obs[this.id].result){

      this.data = this.$sstore.obs.state.obs[this.id].result;
      console.log(this.data);
    }else{
      this.data = '';
    }
  }

}

</script>
<style lang="scss" scoped>
.datapoint{
  white-space: nowrap;
}
</style>
