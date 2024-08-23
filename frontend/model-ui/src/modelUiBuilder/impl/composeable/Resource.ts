import {ComponentRegistry} from "@/modelUiBuilder/impl/ComponentRegistry";
import {StringComponent} from "@/modelUiBuilder/impl/components/string/StringComponent";
import {DateTimeComponent} from "@/modelUiBuilder/impl/components/datetime/DateTimeComponent";

import {ref} from "vue";
import Resources from "@/modelUiBuilder/impl/Resources";
import {EResource, URI} from "@/ecore";

const store = ref<Resources[]> ([])

export function useResource() {

    const loadResource = async (url:URI)=>{

             const rs = new Resources()
             await rs.loadResource(url);
             store.value.push(rs)
    }
    const getResource=(resUri:string):EResource|undefined =>{
        return (store.value.find(e=>e.res?.eURI.toString() == resUri))?.res
    }
    return { loadResource,store,getResource }
}
