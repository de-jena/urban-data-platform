import type {ResourcesI} from "@/modelUiBuilder/api/Resources";
import {type EResource, EResourceSetImpl, URI} from "@/ecore";





export default class Resources implements ResourcesI{
    public rs:EResourceSetImpl|undefined;
    public res:EResource|undefined;

    async loadResource(uri: URI): Promise<void> {
        this.rs = new EResourceSetImpl();
        const res = this.rs.createResource(uri);
        const data = await fetch(uri.toString());
        const dataAsText = await data.text();
        res.loadFromString(dataAsText)
        this.res = res;
    }
    async export(){
        console.log(this.res?.saveToString())
    }


}
