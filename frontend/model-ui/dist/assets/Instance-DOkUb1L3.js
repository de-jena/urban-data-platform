import{B as Y,a1 as V,aa as S,D as m,ab as $,O as ee,m as d,a3 as te,a4 as Z,o as s,c,e as p,a5 as A,a as C,p as P,b as z,f as I,K as x,U,z as k,y as w,ac as ne,g as E,F as O,r as F,X as ie,d as W,j,k as H,u as B,a7 as se,ad as oe,l as ae,i as re,$ as le,a2 as ue}from"./index-MuAwnn3t.js";import{O as ce,m as de,s as q,S as me,u as _,k as pe,c as fe,C as he,l as be,_ as ve}from"./MenubarV.vue_vue_type_script_setup_true_lang-B465Jlzk.js";import{b as ye,i as ge,a as Ie,U as G,u as M}from"./Resource-BjR7S1bV.js";var ke=function(e){var n=e.dt;return`
.p-menu {
    background: `.concat(n("menu.background"),`;
    color: `).concat(n("menu.color"),`;
    border: 1px solid `).concat(n("menu.border.color"),`;
    border-radius: `).concat(n("menu.border.radius"),`;
    min-width: 12.5rem;
}

.p-menu-list {
    margin: 0;
    padding: `).concat(n("menu.list.padding"),`;
    outline: 0 none;
    list-style: none;
    display: flex;
    flex-direction: column;
    gap: `).concat(n("menu.list.gap"),`;
}

.p-menu-item-content {
    transition: background `).concat(n("menu.transition.duration"),", color ").concat(n("menu.transition.duration"),`;
    border-radius: `).concat(n("menu.item.border.radius"),`;
    color: `).concat(n("menu.item.color"),`;
}

.p-menu-item-link {
    cursor: pointer;
    display: flex;
    align-items: center;
    text-decoration: none;
    overflow: hidden;
    position: relative;
    color: inherit;
    padding: `).concat(n("menu.item.padding"),`;
    gap: `).concat(n("menu.item.gap"),`;
    user-select: none;
    outline: 0 none;
}

.p-menu-item-label {
    line-height: 1;
}

.p-menu-item-icon {
    color: `).concat(n("menu.item.icon.color"),`;
}

.p-menu-item.p-focus .p-menu-item-content {
    color: `).concat(n("menu.item.focus.color"),`;
    background: `).concat(n("menu.item.focus.background"),`;
}

.p-menu-item.p-focus .p-menu-item-icon {
    color: `).concat(n("menu.item.icon.focus.color"),`;
}

.p-menu-item:not(.p-disabled) .p-menu-item-content:hover {
    color: `).concat(n("menu.item.focus.color"),`;
    background: `).concat(n("menu.item.focus.background"),`;
}

.p-menu-item:not(.p-disabled) .p-menu-item-content:hover .p-menu-item-icon {
    color: `).concat(n("menu.item.icon.focus.color"),`;
}

.p-menu-overlay {
    box-shadow: `).concat(n("menu.shadow"),`;
}

.p-menu-submenu-label {
    background: `).concat(n("menu.submenu.label.background"),`;
    padding: `).concat(n("menu.submenu.label.padding"),`;
    color: `).concat(n("menu.submenu.label.color"),`;
    font-weight: `).concat(n("menu.submenu.label.font.weight"),`;
}

.p-menu-separator {
    border-top: 1px solid `).concat(n("menu.separator.border.color"),`;
}
`)},Le={root:function(e){var n=e.props;return["p-menu p-component",{"p-menu-overlay":n.popup}]},start:"p-menu-start",list:"p-menu-list",submenuLabel:"p-menu-submenu-label",separator:"p-menu-separator",end:"p-menu-end",item:function(e){var n=e.instance;return["p-menu-item",{"p-focus":n.id===n.focusedOptionId,"p-disabled":n.disabled()}]},itemContent:"p-menu-item-content",itemLink:"p-menu-item-link",itemIcon:"p-menu-item-icon",itemLabel:"p-menu-item-label"},Oe=Y.extend({name:"menu",theme:ke,classes:Le}),xe={name:"BaseMenu",extends:q,props:{popup:{type:Boolean,default:!1},model:{type:Array,default:null},appendTo:{type:[String,Object],default:"body"},autoZIndex:{type:Boolean,default:!0},baseZIndex:{type:Number,default:0},tabindex:{type:Number,default:0},ariaLabel:{type:String,default:null},ariaLabelledby:{type:String,default:null}},style:Oe,provide:function(){return{$pcMenu:this,$parentInstance:this}}},X={name:"Menuitem",hostName:"Menu",extends:q,inheritAttrs:!1,emits:["item-click","item-mousemove"],props:{item:null,templates:null,id:null,focusedOptionId:null,index:null},methods:{getItemProp:function(e,n){return e&&e.item?ee.getItemValue(e.item[n]):void 0},getPTOptions:function(e){return this.ptm(e,{context:{item:this.item,index:this.index,focused:this.isItemFocused(),disabled:this.disabled()}})},isItemFocused:function(){return this.focusedOptionId===this.id},onItemClick:function(e){var n=this.getItemProp(this.item,"command");n&&n({originalEvent:e,item:this.item.item}),this.$emit("item-click",{originalEvent:e,item:this.item,id:this.id})},onItemMouseMove:function(e){this.$emit("item-mousemove",{originalEvent:e,item:this.item,id:this.id})},visible:function(){return typeof this.item.visible=="function"?this.item.visible():this.item.visible!==!1},disabled:function(){return typeof this.item.disabled=="function"?this.item.disabled():this.item.disabled},label:function(){return typeof this.item.label=="function"?this.item.label():this.item.label},getMenuItemProps:function(e){return{action:d({class:this.cx("itemLink"),tabindex:"-1","aria-hidden":!0},this.getPTOptions("itemLink")),icon:d({class:[this.cx("itemIcon"),e.icon]},this.getPTOptions("itemIcon")),label:d({class:this.cx("itemLabel")},this.getPTOptions("itemLabel"))}}},directives:{ripple:te}},Ce=["id","aria-label","aria-disabled","data-p-focused","data-p-disabled"],we=["href","target"];function Se(t,e,n,o,r,i){var b=Z("ripple");return i.visible()?(s(),c("li",d({key:0,id:n.id,class:[t.cx("item"),n.item.class],role:"menuitem",style:n.item.style,"aria-label":i.label(),"aria-disabled":i.disabled()},i.getPTOptions("item"),{"data-p-focused":i.isItemFocused(),"data-p-disabled":i.disabled()||!1}),[p("div",d({class:t.cx("itemContent"),onClick:e[0]||(e[0]=function(v){return i.onItemClick(v)}),onMousemove:e[1]||(e[1]=function(v){return i.onItemMouseMove(v)})},i.getPTOptions("itemContent")),[n.templates.item?n.templates.item?(s(),C(z(n.templates.item),{key:1,item:n.item,label:i.label(),props:i.getMenuItemProps(n.item)},null,8,["item","label","props"])):I("",!0):A((s(),c("a",d({key:0,href:n.item.url,class:t.cx("itemLink"),target:n.item.target,tabindex:"-1","aria-hidden":"true"},i.getPTOptions("itemLink")),[n.templates.itemicon?(s(),C(z(n.templates.itemicon),{key:0,item:n.item,class:P(t.cx("itemIcon"))},null,8,["item","class"])):n.item.icon?(s(),c("span",d({key:1,class:[t.cx("itemIcon"),n.item.icon]},i.getPTOptions("itemIcon")),null,16)):I("",!0),p("span",d({class:t.cx("itemLabel")},i.getPTOptions("itemLabel")),x(i.label()),17)],16,we)),[[b]])],16)],16,Ce)):I("",!0)}X.render=Se;function N(t){return _e(t)||Pe(t)||Ae(t)||Ee()}function Ee(){throw new TypeError(`Invalid attempt to spread non-iterable instance.
In order to be iterable, non-array objects must have a [Symbol.iterator]() method.`)}function Ae(t,e){if(t){if(typeof t=="string")return T(t,e);var n={}.toString.call(t).slice(8,-1);return n==="Object"&&t.constructor&&(n=t.constructor.name),n==="Map"||n==="Set"?Array.from(t):n==="Arguments"||/^(?:Ui|I)nt(?:8|16|32)(?:Clamped)?Array$/.test(n)?T(t,e):void 0}}function Pe(t){if(typeof Symbol<"u"&&t[Symbol.iterator]!=null||t["@@iterator"]!=null)return Array.from(t)}function _e(t){if(Array.isArray(t))return T(t)}function T(t,e){(e==null||e>t.length)&&(e=t.length);for(var n=0,o=Array(e);n<e;n++)o[n]=t[n];return o}var R={name:"Menu",extends:xe,inheritAttrs:!1,emits:["show","hide","focus","blur"],data:function(){return{id:this.$attrs.id,overlayVisible:!1,focused:!1,focusedOptionIndex:-1,selectedOptionIndex:-1}},watch:{"$attrs.id":function(e){this.id=e||V()}},target:null,outsideClickListener:null,scrollHandler:null,resizeListener:null,container:null,list:null,mounted:function(){this.id=this.id||V(),this.popup||(this.bindResizeListener(),this.bindOutsideClickListener())},beforeUnmount:function(){this.unbindResizeListener(),this.unbindOutsideClickListener(),this.scrollHandler&&(this.scrollHandler.destroy(),this.scrollHandler=null),this.target=null,this.container&&this.autoZIndex&&S.clear(this.container),this.container=null},methods:{itemClick:function(e){var n=e.item;this.disabled(n)||(n.command&&n.command(e),this.overlayVisible&&this.hide(),!this.popup&&this.focusedOptionIndex!==e.id&&(this.focusedOptionIndex=e.id))},itemMouseMove:function(e){this.focused&&(this.focusedOptionIndex=e.id)},onListFocus:function(e){this.focused=!0,!this.popup&&this.changeFocusedOptionIndex(0),this.$emit("focus",e)},onListBlur:function(e){this.focused=!1,this.focusedOptionIndex=-1,this.$emit("blur",e)},onListKeyDown:function(e){switch(e.code){case"ArrowDown":this.onArrowDownKey(e);break;case"ArrowUp":this.onArrowUpKey(e);break;case"Home":this.onHomeKey(e);break;case"End":this.onEndKey(e);break;case"Enter":case"NumpadEnter":this.onEnterKey(e);break;case"Space":this.onSpaceKey(e);break;case"Escape":this.popup&&(m.focus(this.target),this.hide());case"Tab":this.overlayVisible&&this.hide();break}},onArrowDownKey:function(e){var n=this.findNextOptionIndex(this.focusedOptionIndex);this.changeFocusedOptionIndex(n),e.preventDefault()},onArrowUpKey:function(e){if(e.altKey&&this.popup)m.focus(this.target),this.hide(),e.preventDefault();else{var n=this.findPrevOptionIndex(this.focusedOptionIndex);this.changeFocusedOptionIndex(n),e.preventDefault()}},onHomeKey:function(e){this.changeFocusedOptionIndex(0),e.preventDefault()},onEndKey:function(e){this.changeFocusedOptionIndex(m.find(this.container,'li[data-pc-section="item"][data-p-disabled="false"]').length-1),e.preventDefault()},onEnterKey:function(e){var n=m.findSingle(this.list,'li[id="'.concat("".concat(this.focusedOptionIndex),'"]')),o=n&&m.findSingle(n,'a[data-pc-section="itemlink"]');this.popup&&m.focus(this.target),o?o.click():n&&n.click(),e.preventDefault()},onSpaceKey:function(e){this.onEnterKey(e)},findNextOptionIndex:function(e){var n=m.find(this.container,'li[data-pc-section="item"][data-p-disabled="false"]'),o=N(n).findIndex(function(r){return r.id===e});return o>-1?o+1:0},findPrevOptionIndex:function(e){var n=m.find(this.container,'li[data-pc-section="item"][data-p-disabled="false"]'),o=N(n).findIndex(function(r){return r.id===e});return o>-1?o-1:0},changeFocusedOptionIndex:function(e){var n=m.find(this.container,'li[data-pc-section="item"][data-p-disabled="false"]'),o=e>=n.length?n.length-1:e<0?0:e;o>-1&&(this.focusedOptionIndex=n[o].getAttribute("id"))},toggle:function(e){this.overlayVisible?this.hide():this.show(e)},show:function(e){this.overlayVisible=!0,this.target=e.currentTarget},hide:function(){this.overlayVisible=!1,this.target=null},onEnter:function(e){m.addStyles(e,{position:"absolute",top:"0",left:"0"}),this.alignOverlay(),this.bindOutsideClickListener(),this.bindResizeListener(),this.bindScrollListener(),this.autoZIndex&&S.set("menu",e,this.baseZIndex+this.$primevue.config.zIndex.menu),this.popup&&m.focus(this.list),this.$emit("show")},onLeave:function(){this.unbindOutsideClickListener(),this.unbindResizeListener(),this.unbindScrollListener(),this.$emit("hide")},onAfterLeave:function(e){this.autoZIndex&&S.clear(e)},alignOverlay:function(){m.absolutePosition(this.container,this.target);var e=m.getOuterWidth(this.target);e>m.getOuterWidth(this.container)&&(this.container.style.minWidth=m.getOuterWidth(this.target)+"px")},bindOutsideClickListener:function(){var e=this;this.outsideClickListener||(this.outsideClickListener=function(n){var o=e.container&&!e.container.contains(n.target),r=!(e.target&&(e.target===n.target||e.target.contains(n.target)));e.overlayVisible&&o&&r?e.hide():!e.popup&&o&&r&&(e.focusedOptionIndex=-1)},document.addEventListener("click",this.outsideClickListener))},unbindOutsideClickListener:function(){this.outsideClickListener&&(document.removeEventListener("click",this.outsideClickListener),this.outsideClickListener=null)},bindScrollListener:function(){var e=this;this.scrollHandler||(this.scrollHandler=new $(this.target,function(){e.overlayVisible&&e.hide()})),this.scrollHandler.bindScrollListener()},unbindScrollListener:function(){this.scrollHandler&&this.scrollHandler.unbindScrollListener()},bindResizeListener:function(){var e=this;this.resizeListener||(this.resizeListener=function(){e.overlayVisible&&!m.isTouchDevice()&&e.hide()},window.addEventListener("resize",this.resizeListener))},unbindResizeListener:function(){this.resizeListener&&(window.removeEventListener("resize",this.resizeListener),this.resizeListener=null)},visible:function(e){return typeof e.visible=="function"?e.visible():e.visible!==!1},disabled:function(e){return typeof e.disabled=="function"?e.disabled():e.disabled},label:function(e){return typeof e.label=="function"?e.label():e.label},onOverlayClick:function(e){ce.emit("overlay-click",{originalEvent:e,target:this.target})},containerRef:function(e){this.container=e},listRef:function(e){this.list=e}},computed:{focusedOptionId:function(){return this.focusedOptionIndex!==-1?this.focusedOptionIndex:null}},components:{PVMenuitem:X,Portal:de}},Me=["id"],Te=["id","tabindex","aria-activedescendant","aria-label","aria-labelledby"],Re=["id"];function Ke(t,e,n,o,r,i){var b=U("PVMenuitem"),v=U("Portal");return s(),C(v,{appendTo:t.appendTo,disabled:!t.popup},{default:k(function(){return[w(ne,d({name:"p-connected-overlay",onEnter:i.onEnter,onLeave:i.onLeave,onAfterLeave:i.onAfterLeave},t.ptm("transition")),{default:k(function(){return[!t.popup||r.overlayVisible?(s(),c("div",d({key:0,ref:i.containerRef,id:r.id,class:t.cx("root"),onClick:e[3]||(e[3]=function(){return i.onOverlayClick&&i.onOverlayClick.apply(i,arguments)})},t.ptmi("root")),[t.$slots.start?(s(),c("div",d({key:0,class:t.cx("start")},t.ptm("start")),[E(t.$slots,"start")],16)):I("",!0),p("ul",d({ref:i.listRef,id:r.id+"_list",class:t.cx("list"),role:"menu",tabindex:t.tabindex,"aria-activedescendant":r.focused?i.focusedOptionId:void 0,"aria-label":t.ariaLabel,"aria-labelledby":t.ariaLabelledby,onFocus:e[0]||(e[0]=function(){return i.onListFocus&&i.onListFocus.apply(i,arguments)}),onBlur:e[1]||(e[1]=function(){return i.onListBlur&&i.onListBlur.apply(i,arguments)}),onKeydown:e[2]||(e[2]=function(){return i.onListKeyDown&&i.onListKeyDown.apply(i,arguments)})},t.ptm("list")),[(s(!0),c(O,null,F(t.model,function(l,a){return s(),c(O,{key:i.label(l)+a.toString()},[l.items&&i.visible(l)&&!l.separator?(s(),c(O,{key:0},[l.items?(s(),c("li",d({key:0,id:r.id+"_"+a,class:[t.cx("submenuLabel"),l.class],role:"none",ref_for:!0},t.ptm("submenuLabel")),[E(t.$slots,t.$slots.submenulabel?"submenulabel":"submenuheader",{item:l},function(){return[ie(x(i.label(l)),1)]})],16,Re)):I("",!0),(s(!0),c(O,null,F(l.items,function(f,y){return s(),c(O,{key:f.label+a+"_"+y},[i.visible(f)&&!f.separator?(s(),C(b,{key:0,id:r.id+"_"+a+"_"+y,item:f,templates:t.$slots,focusedOptionId:i.focusedOptionId,unstyled:t.unstyled,onItemClick:i.itemClick,onItemMousemove:i.itemMouseMove,pt:t.pt},null,8,["id","item","templates","focusedOptionId","unstyled","onItemClick","onItemMousemove","pt"])):i.visible(f)&&f.separator?(s(),c("li",d({key:"separator"+a+y,class:[t.cx("separator"),l.class],style:f.style,role:"separator",ref_for:!0},t.ptm("separator")),null,16)):I("",!0)],64)}),128))],64)):i.visible(l)&&l.separator?(s(),c("li",d({key:"separator"+a.toString(),class:[t.cx("separator"),l.class],style:l.style,role:"separator",ref_for:!0},t.ptm("separator")),null,16)):(s(),C(b,{key:i.label(l)+a.toString(),id:r.id+"_"+a,item:l,index:a,templates:t.$slots,focusedOptionId:i.focusedOptionId,unstyled:t.unstyled,onItemClick:i.itemClick,onItemMousemove:i.itemMouseMove,pt:t.pt},null,8,["id","item","index","templates","focusedOptionId","unstyled","onItemClick","onItemMousemove","pt"]))],64)}),128))],16,Te),t.$slots.end?(s(),c("div",d({key:1,class:t.cx("end")},t.ptm("end")),[E(t.$slots,"end")],16)):I("",!0)],16,Me)):I("",!0)]}),_:3},16,["onEnter","onLeave","onAfterLeave"])]}),_:3},8,["appendTo","disabled"])}R.render=Ke;const De={class:"sidebar margin"},Ve=p("span",{class:"inline-flex items-center gap-1 px-2 py-2"},[p("span",{class:"text-xl font-semibold"}," Classes")],-1),ze={class:"text-primary font-bold"},Ue=["onClick"],Fe=p("span",{class:"ml-auto border border-surface rounded bg-emphasis text-muted-color text-xs p-1"},"+",-1),He=p("div",{style:{height:"25px"}},null,-1),Be=p("span",{class:"inline-flex items-center gap-1 px-2 py-2"},[p("span",{class:"text-xl font-semibold"}," Instances")],-1),Ne={class:"text-primary font-bold"},Ze=["onClick"],We=W({__name:"AppMenu",setup(t){const e=new me({length:10});j([{separator:!0},{label:"no items",items:[]}]);const{store:n}=M(),{instances:o}=_(),{setDataTypes:r}=pe(),i=H(()=>{let a=[{separator:!0}];if(n.value.length>0){const f=n.value[0].res;f.eContents().toArray().forEach(y=>{if(ye(y)){const u=y;let g=[];for(const h of u.eAllContents()){if(ge(h)){const L=h;g.push({label:h.name.toString(),icon:"pi pi-sparkles",eClass:L.name,ePackage:L.ePackage.nsURI,res:f.eURI})}if(Ie(h)){const L=h;r(L.name,L)}}g.length>0&&a.push({label:`${u.name}  (${u.nsURI})`,icon:"pi pi-box",items:g})}})}return a}),b=H(()=>Array.from(o.value.entries()).map(a=>({icon:"pi pi-box",label:a[0]+" ("+a[1].eClass().name+")",id:a[0]}))),v=a=>{var K;const f=a.res;a.ePackage;const y=a.eClass,u=(K=n.value.find(Q=>{var D;return((D=Q.res)==null?void 0:D.eURI.toString())==f}))==null?void 0:K.res;let g=new G(f+"#//"+y);const h=u==null?void 0:u.eResourceSet().getEObject(g,!1),L=h==null?void 0:h.ePackage.eFactoryInstance.create(h),J=e.rnd();_().setInstance(J,L)},l=a=>{se.push({name:oe,params:{instanceid:a.id}})};return(a,f)=>{const y=Z("ripple");return s(),c("div",De,[w(B(R),{model:i.value,class:"md:w-60"},{start:k(()=>[Ve]),submenulabel:k(({item:u})=>[p("span",ze,x(u.label),1)]),item:k(({item:u,props:g})=>[A((s(),c("a",d({class:"flex items-center"},g.action,{onClick:h=>v(u)}),[p("span",{class:P(u.icon)},null,2),p("span",null,x(u.label),1),Fe],16,Ue)),[[y]])]),_:1},8,["model"]),He,w(B(R),{model:b.value,class:"md:w-60"},{start:k(()=>[Be]),submenulabel:k(({item:u})=>[p("span",Ne,x(u),1)]),item:k(({item:u,props:g})=>[A((s(),c("a",d({class:"flex items-center"},g.action,{onClick:h=>l(u)}),[p("span",{class:P(u.icon)},null,2),p("span",null,x(u.label),1)],16,Ze)),[[y]])]),_:1},8,["model"])])}}}),je={class:"flex"},qe=W({__name:"Instance",setup(t){const e=le(),n=ue(),{store:o}=M(),r=j(void 0);ae(async()=>{const{loadResource:b,store:v}=M();await b(new G(fe.ECORE_PATH)),i()}),re(n,()=>{i()});const i=()=>{const{instanceid:b}=e.currentRoute.value.params;console.log(o.value),r.value=_().getInstance(b)};return(b,v)=>(s(),c(O,null,[w(We,{class:"appmenu"}),p("div",je,[w(be),r.value?(s(),C(he,{key:0,modelValue:r.value,"onUpdate:modelValue":v[0]||(v[0]=l=>r.value=l)},null,8,["modelValue"])):I("",!0)])],64))}}),Qe=ve(qe,[["__scopeId","data-v-1d6e0f24"]]);export{Qe as default};