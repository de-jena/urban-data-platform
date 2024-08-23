
import {ref} from "vue";
import type {EClass, EObject} from "@/ecore";
import {EcoreUtils} from "@/ecore";


const instances = ref<Map<string,EObject>>(new Map())

export function useInstanceHolder() {

    const getInstance=(id:string)=>{
        return instances.value.get(id);
    }
    const setInstance=(id:string,eObj:EObject)=>{


        return instances.value.set(id,eObj);

    }
    const findInstancesByClass=(eClass:EClass)=>{
        const foundinstances:Map<string,EObject> = new Map();
        for (const instance of instances.value.entries()){

                if (EcoreUtils.equals(instance[1].eClass(), eClass)) {
                    foundinstances.set(instance[0], instance[1]);
                    continue;
                }
                if (eClass.isSuperTypeOf(instance[1].eClass())) {
                    foundinstances.set(instance[0], instance[1]);
                }

        }
        return foundinstances;
    }
    const identify=(eObj:EObject)=>{
        for (const instance of instances.value.entries()){
            /*if(EcoreUtils.equals(eObj,instance[1])){
                return instance[0];
            }*/
            if(eObj == instance[1]){
                return instance[0];
            }
        }
    }

    return{
        instances,
        getInstance,
        setInstance,
        findInstancesByClass,
        identify

    }
}
