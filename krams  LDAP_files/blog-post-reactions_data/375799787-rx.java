(function (){ var g="",aa="\n",k=" ",ba='"',ca='", ',da='","groups":["reactions"]},"labels":[',ea='","groups":["reactions"]},{"url": "',fa='"}],"applicationId":34}',ga="%s",ha="(",ia="(\\d*)(\\D*)",ja=")",ka="*",m=".",la="//www.blogger.com/reviews/json/aggregates",ma="//www.blogger.com/reviews/json/token",na="//www.blogger.com/reviews/json/write",oa="0",pa=": ",qa="@",ra="An object listener must have handleEvent method.",sa="Assertion failed",ta="Content-Type",ua="Event target is not initialized. Did you call the superclass (goog.events.EventTarget) constructor?",
va="GET",wa="Listener can not be null.",xa="MSXML2.XMLHTTP",ya="MSXML2.XMLHTTP.3.0",za="MSXML2.XMLHTTP.6.0",Aa="Microsoft.XMLHTTP",n="POST",Ba="[object Array]",Ca="[object Function]",Da="[object Window]",Ea="]",Fa=']}],"applicationId":34}&token=',Ga="_",Ha="a",Ia="abort",Ja="application/x-www-form-urlencoded;charset=utf-8",p="array",Ka="call",La="click",q="complete",Ma="content-type",Na="downloadprogress",Oa="error",Pa="event",r="function",Qa="g",Ra="goog.net.EventType.PROGRESS is of the same type as raw XHR progress.",
Sa="infinite loop",Ta="innerText",Ua="keypress",Va="mouseout",Wa="mouseover",Xa="native code",Ya="null",t="number",u="object",Za="on",$a="onprogress",ab="progress",bb="ready",cb="readystatechange",db='req={"annotations": [ {"replaceAllLabels":true,"entity": {"url": "',eb='req={"applicationId":34}',fb='req={"entities":[{"url": "',gb="rx-checked",hb="rx-count",ib="rx-holder",jb="rx-label",kb="rx-option",lb="rx-unchecked",mb="span",nb="splice",ob="string",pb="success",qb="timeout",rb="uploadprogress",
sb="var ",tb="window",ub="withCredentials",v,vb=vb||{},w=this,wb=function(a,b,c){a=a.split(m);c=c||w;a[0]in c||!c.execScript||c.execScript(sb+a[0]);for(var d;a.length&&(d=a.shift());)a.length||void 0===b?c=c[d]?c[d]:c[d]={}:c[d]=b},xb=function(){},x=function(a){var b=typeof a;if(b==u)if(a){if(a instanceof Array)return p;if(a instanceof Object)return b;var c=Object.prototype.toString.call(a);if(c==Da)return u;if(c==Ba||typeof a.length==t&&"undefined"!=typeof a.splice&&"undefined"!=typeof a.propertyIsEnumerable&&
!a.propertyIsEnumerable(nb))return p;if(c==Ca||"undefined"!=typeof a.call&&"undefined"!=typeof a.propertyIsEnumerable&&!a.propertyIsEnumerable(Ka))return r}else return Ya;else if(b==r&&"undefined"==typeof a.call)return u;return b},y=function(a){var b=x(a);return b==p||b==u&&typeof a.length==t},z=function(a){return typeof a==ob},yb=function(a,b,c){return a.call.apply(a.bind,arguments)},zb=function(a,b,c){if(!a)throw Error();if(2<arguments.length){var d=Array.prototype.slice.call(arguments,2);return function(){var c=
Array.prototype.slice.call(arguments);Array.prototype.unshift.apply(c,d);return a.apply(b,c)}}return function(){return a.apply(b,arguments)}},A=function(a,b,c){A=Function.prototype.bind&&-1!=Function.prototype.bind.toString().indexOf(Xa)?yb:zb;return A.apply(null,arguments)},Ab=function(a,b){var c=Array.prototype.slice.call(arguments,1);return function(){var b=c.slice();b.push.apply(b,arguments);return a.apply(this,b)}},B=function(a,b){function c(){}c.prototype=b.prototype;a.superClass_=b.prototype;
a.prototype=new c;a.base=function(a,c,f){for(var h=Array(arguments.length-2),l=2;l<arguments.length;l++)h[l-2]=arguments[l];return b.prototype[c].apply(a,h)}};var C=function(a){if(Error.captureStackTrace)Error.captureStackTrace(this,C);else{var b=Error().stack;b&&(this.stack=b)}a&&(this.message=String(a))};B(C,Error);var Bb=function(a,b){for(var c=a.split(ga),d=g,e=Array.prototype.slice.call(arguments,1);e.length&&1<c.length;)d+=c.shift()+e.shift();return d+c.join(ga)},Cb=String.prototype.trim?function(a){return a.trim()}:function(a){return a.replace(/^[\s\xa0]+|[\s\xa0]+$/g,g)},Db=function(a,b){return a<b?-1:a>b?1:0};var Eb=function(a,b){b.unshift(a);C.call(this,Bb.apply(null,b));b.shift()};B(Eb,C);var D=function(a,b,c){if(!a){var d=Array.prototype.slice.call(arguments,2),e=sa;if(b)var e=e+(pa+b),f=d;throw new Eb(g+e,f||[]);}return a};var Fb=function(a){Fb[k](a);return a};Fb[k]=xb;var Gb=Array.prototype.indexOf?function(a,b,c){D(null!=a.length);return Array.prototype.indexOf.call(a,b,c)}:function(a,b,c){c=null==c?0:0>c?Math.max(0,a.length+c):c;if(z(a))return z(b)&&1==b.length?a.indexOf(b,c):-1;for(;c<a.length;c++)if(c in a&&a[c]===b)return c;return-1},Hb=Array.prototype.forEach?function(a,b,c){D(null!=a.length);Array.prototype.forEach.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=z(a)?a.split(g):a,f=0;f<d;f++)f in e&&b.call(c,e[f],f,a)},Ib=Array.prototype.filter?function(a,
b,c){D(null!=a.length);return Array.prototype.filter.call(a,b,c)}:function(a,b,c){for(var d=a.length,e=[],f=0,h=z(a)?a.split(g):a,l=0;l<d;l++)if(l in h){var H=h[l];b.call(c,H,l,a)&&(e[f++]=H)}return e},Jb=function(a,b,c){a:{for(var d=a.length,e=z(a)?a.split(g):a,f=0;f<d;f++)if(f in e&&b.call(c,e[f],f,a)){b=f;break a}b=-1}return 0>b?null:z(a)?a.charAt(b):a[b]},E=function(a,b){return 0<=Gb(a,b)},Lb=function(a,b){var c=Gb(a,b),d;(d=0<=c)&&Kb(a,c);return d},Kb=function(a,b){D(null!=a.length);return 1==
Array.prototype.splice.call(a,b,1).length},Mb=function(a,b,c){D(null!=a.length);return 2>=arguments.length?Array.prototype.slice.call(a,b):Array.prototype.slice.call(a,b,c)};var Nb=function(a){var b=[],c=0,d;for(d in a)b[c++]=a[d];return b},Ob=function(a){var b=[],c=0,d;for(d in a)b[c++]=d;return b},Pb=function(a,b){return null!==a&&b in a},Qb="constructor hasOwnProperty isPrototypeOf propertyIsEnumerable toLocaleString toString valueOf".split(" "),Rb=function(a,b){for(var c,d,e=1;e<arguments.length;e++){d=arguments[e];for(c in d)a[c]=d[c];for(var f=0;f<Qb.length;f++)c=Qb[f],Object.prototype.hasOwnProperty.call(d,c)&&(a[c]=d[c])}};var F;a:{var Sb=w.navigator;if(Sb){var Tb=Sb.userAgent;if(Tb){F=Tb;break a}}F=g};var Ub=-1!=F.indexOf("Opera")||-1!=F.indexOf("OPR"),G=-1!=F.indexOf("Trident")||-1!=F.indexOf("MSIE"),Vb=-1!=F.indexOf("Edge"),I=-1!=F.indexOf("Gecko")&&!(-1!=F.toLowerCase().indexOf("webkit")&&-1==F.indexOf("Edge"))&&!(-1!=F.indexOf("Trident")||-1!=F.indexOf("MSIE"))&&-1==F.indexOf("Edge"),J=-1!=F.toLowerCase().indexOf("webkit")&&-1==F.indexOf("Edge"),Wb=function(){var a=F;if(I)return/rv\:([^\);]+)(\)|;)/.exec(a);if(Vb)return/Edge\/([\d\.]+)/.exec(a);if(G)return/\b(?:MSIE|rv)[: ]([^\);]+)(\)|;)/.exec(a);
if(J)return/WebKit\/(\S+)/.exec(a)},Xb=function(){var a=w.document;return a?a.documentMode:void 0},Yb=function(){if(Ub&&w.opera){var a;var b=w.opera.version;try{a=b()}catch(c){a=b}return a}a=g;(b=Wb())&&(a=b?b[1]:g);return G&&(b=Xb(),b>parseFloat(a))?String(b):a}(),Zb={},M=function(a){var b;if(!(b=Zb[a])){b=0;for(var c=Cb(String(Yb)).split(m),d=Cb(String(a)).split(m),e=Math.max(c.length,d.length),f=0;0==b&&f<e;f++){var h=c[f]||g,l=d[f]||g,H=RegExp(ia,Qa),Ec=RegExp(ia,Qa);do{var K=H.exec(h)||[g,g,
g],L=Ec.exec(l)||[g,g,g];if(0==K[0].length&&0==L[0].length)break;b=Db(0==K[1].length?0:parseInt(K[1],10),0==L[1].length?0:parseInt(L[1],10))||Db(0==K[2].length,0==L[2].length)||Db(K[2],L[2])}while(0==b)}b=Zb[a]=0<=b}return b},$b=w.document,ac=$b&&G?Xb()||("CSS1Compat"==$b.compatMode?parseInt(Yb,10):5):void 0;var bc=!G||9<=ac,cc=G&&!M("9");!J||M("528");I&&M("1.9b")||G&&M("8")||Ub&&M("9.5")||J&&M("528");I&&!M("8")||G&&M("9");var N=function(){this.disposed_=this.disposed_;this.onDisposeCallbacks_=this.onDisposeCallbacks_};N.prototype.disposed_=!1;N.prototype.dispose=function(){this.disposed_||(this.disposed_=!0,this.disposeInternal())};N.prototype.disposeInternal=function(){if(this.onDisposeCallbacks_)for(;this.onDisposeCallbacks_.length;)this.onDisposeCallbacks_.shift()()};var O=function(a,b){this.type=a;this.currentTarget=this.target=b;this.defaultPrevented=this.propagationStopped_=!1;this.returnValue_=!0};O.prototype.preventDefault=function(){this.defaultPrevented=!0;this.returnValue_=!1};var P=function(a,b){O.call(this,a?a.type:g);this.relatedTarget=this.currentTarget=this.target=null;this.charCode=this.keyCode=this.button=this.screenY=this.screenX=this.clientY=this.clientX=this.offsetY=this.offsetX=0;this.metaKey=this.shiftKey=this.altKey=this.ctrlKey=!1;this.event_=this.state=null;a&&this.init(a,b)};B(P,O);
P.prototype.init=function(a,b){var c=this.type=a.type,d=a.changedTouches?a.changedTouches[0]:null;this.target=a.target||a.srcElement;this.currentTarget=b;var e=a.relatedTarget;if(e){if(I){var f;a:{try{Fb(e.nodeName);f=!0;break a}catch(h){}f=!1}f||(e=null)}}else c==Wa?e=a.fromElement:c==Va&&(e=a.toElement);this.relatedTarget=e;null===d?(this.offsetX=J||void 0!==a.offsetX?a.offsetX:a.layerX,this.offsetY=J||void 0!==a.offsetY?a.offsetY:a.layerY,this.clientX=void 0!==a.clientX?a.clientX:a.pageX,this.clientY=
void 0!==a.clientY?a.clientY:a.pageY,this.screenX=a.screenX||0,this.screenY=a.screenY||0):(this.clientX=void 0!==d.clientX?d.clientX:d.pageX,this.clientY=void 0!==d.clientY?d.clientY:d.pageY,this.screenX=d.screenX||0,this.screenY=d.screenY||0);this.button=a.button;this.keyCode=a.keyCode||0;this.charCode=a.charCode||(c==Ua?a.keyCode:0);this.ctrlKey=a.ctrlKey;this.altKey=a.altKey;this.shiftKey=a.shiftKey;this.metaKey=a.metaKey;this.state=a.state;this.event_=a;a.defaultPrevented&&this.preventDefault()};
P.prototype.preventDefault=function(){P.superClass_.preventDefault.call(this);var a=this.event_;if(a.preventDefault)a.preventDefault();else if(a.returnValue=!1,cc)try{if(a.ctrlKey||112<=a.keyCode&&123>=a.keyCode)a.keyCode=-1}catch(b){}};var dc="closure_listenable_"+(1E6*Math.random()|0),Q=function(a){return!(!a||!a[dc])},ec=0;var fc=function(a,b,c,d,e,f){this.listener=a;this.proxy=b;this.src=c;this.type=d;this.capture=!!e;this.handler=f;this.key=++ec;this.removed=this.callOnce=!1};fc.prototype.markAsRemoved=function(){this.removed=!0;this.handler=this.src=this.proxy=this.listener=null};var R=function(a){this.src=a;this.listeners={};this.typeCount_=0};v=R.prototype;v.add=function(a,b,c,d,e){var f=a.toString();a=this.listeners[f];a||(a=this.listeners[f]=[],this.typeCount_++);var h=gc(a,b,d,e);-1<h?(b=a[h],c||(b.callOnce=!1)):(b=new fc(b,null,this.src,f,!!d,e),b.callOnce=c,a.push(b));return b};
v.remove=function(a,b,c,d){a=a.toString();if(!(a in this.listeners))return!1;var e=this.listeners[a];b=gc(e,b,c,d);return-1<b?(e[b].markAsRemoved(),Kb(e,b),0==e.length&&(delete this.listeners[a],this.typeCount_--),!0):!1};v.removeByKey=function(a){var b=a.type;if(!(b in this.listeners))return!1;var c=Lb(this.listeners[b],a);c&&(a.markAsRemoved(),0==this.listeners[b].length&&(delete this.listeners[b],this.typeCount_--));return c};
v.removeAll=function(a){a=a&&a.toString();var b=0,c;for(c in this.listeners)if(!a||c==a){for(var d=this.listeners[c],e=0;e<d.length;e++)++b,d[e].markAsRemoved();delete this.listeners[c];this.typeCount_--}return b};v.getListener=function(a,b,c,d){a=this.listeners[a.toString()];var e=-1;a&&(e=gc(a,b,c,d));return-1<e?a[e]:null};var gc=function(a,b,c,d){for(var e=0;e<a.length;++e){var f=a[e];if(!f.removed&&f.listener==b&&f.capture==!!c&&f.handler==d)return e}return-1};var hc="closure_lm_"+(1E6*Math.random()|0),ic={},jc=0,kc=function(a,b,c,d,e){if(x(b)==p){for(var f=0;f<b.length;f++)kc(a,b[f],c,d,e);return null}c=lc(c);return Q(a)?a.listen(b,c,d,e):mc(a,b,c,!1,d,e)},mc=function(a,b,c,d,e,f){if(!b)throw Error("Invalid event type");var h=!!e,l=S(a);l||(a[hc]=l=new R(a));c=l.add(b,c,d,e,f);if(c.proxy)return c;d=nc();c.proxy=d;d.src=a;d.listener=c;if(a.addEventListener)a.addEventListener(b.toString(),d,h);else if(a.attachEvent)a.attachEvent(oc(b.toString()),d);else throw Error("addEventListener and attachEvent are unavailable.");
jc++;return c},nc=function(){var a=pc,b=bc?function(c){return a.call(b.src,b.listener,c)}:function(c){c=a.call(b.src,b.listener,c);if(!c)return c};return b},qc=function(a,b,c,d,e){if(x(b)==p){for(var f=0;f<b.length;f++)qc(a,b[f],c,d,e);return null}c=lc(c);return Q(a)?a.listenOnce(b,c,d,e):mc(a,b,c,!0,d,e)},rc=function(a,b,c,d,e){if(x(b)==p){for(var f=0;f<b.length;f++)rc(a,b[f],c,d,e);return null}c=lc(c);if(Q(a))return a.unlisten(b,c,d,e);if(!a)return!1;if(a=S(a))if(b=a.getListener(b,c,!!d,e))return sc(b);
return!1},sc=function(a){if(typeof a==t||!a||a.removed)return!1;var b=a.src;if(Q(b))return b.unlistenByKey(a);var c=a.type,d=a.proxy;b.removeEventListener?b.removeEventListener(c,d,a.capture):b.detachEvent&&b.detachEvent(oc(c),d);jc--;(c=S(b))?(c.removeByKey(a),0==c.typeCount_&&(c.src=null,b[hc]=null)):a.markAsRemoved();return!0},tc=function(a,b){if(!a)return 0;if(Q(a))return a.removeAllListeners(b);var c=S(a);if(!c)return 0;var d=0,e=b&&b.toString(),f;for(f in c.listeners)if(!e||f==e)for(var h=c.listeners[f].concat(),
l=0;l<h.length;++l)sc(h[l])&&++d;return d},oc=function(a){return a in ic?ic[a]:ic[a]=Za+a},vc=function(a,b,c,d){var e=!0;if(a=S(a))if(b=a.listeners[b.toString()])for(b=b.concat(),a=0;a<b.length;a++){var f=b[a];f&&f.capture==c&&!f.removed&&(f=uc(f,d),e=e&&!1!==f)}return e},uc=function(a,b){var c=a.listener,d=a.handler||a.src;a.callOnce&&sc(a);return c.call(d,b)},pc=function(a,b){if(a.removed)return!0;if(!bc){var c;if(!(c=b))a:{c=[tb,Pa];for(var d=w,e;e=c.shift();)if(null!=d[e])d=d[e];else{c=null;break a}c=
d}e=c;c=new P(e,this);d=!0;if(!(0>e.keyCode||void 0!=e.returnValue)){a:{var f=!1;if(0==e.keyCode)try{e.keyCode=-1;break a}catch(H){f=!0}if(f||void 0==e.returnValue)e.returnValue=!0}e=[];for(f=c.currentTarget;f;f=f.parentNode)e.push(f);for(var f=a.type,h=e.length-1;!c.propagationStopped_&&0<=h;h--){c.currentTarget=e[h];var l=vc(e[h],f,!0,c),d=d&&l}for(h=0;!c.propagationStopped_&&h<e.length;h++)c.currentTarget=e[h],l=vc(e[h],f,!1,c),d=d&&l}return d}return uc(a,new P(b,this))},S=function(a){a=a[hc];
return a instanceof R?a:null},wc="__closure_events_fn_"+(1E9*Math.random()>>>0),lc=function(a){D(a,wa);if(x(a)==r)return a;D(a.handleEvent,ra);a[wc]||(a[wc]=function(b){return a.handleEvent(b)});return a[wc]};var T=function(){N.call(this);this.eventTargetListeners_=new R(this);this.actualEventTarget_=this;this.parentEventTarget_=null};B(T,N);T.prototype[dc]=!0;v=T.prototype;v.addEventListener=function(a,b,c,d){kc(this,a,b,c,d)};v.removeEventListener=function(a,b,c,d){rc(this,a,b,c,d)};
v.dispatchEvent=function(a){this.assertInitialized_();var b,c=this.parentEventTarget_;if(c){b=[];for(var d=1;c;c=c.parentEventTarget_)b.push(c),D(1E3>++d,Sa)}c=this.actualEventTarget_;d=a.type||a;if(z(a))a=new O(a,c);else if(a instanceof O)a.target=a.target||c;else{var e=a;a=new O(d,c);Rb(a,e)}var e=!0,f;if(b)for(var h=b.length-1;!a.propagationStopped_&&0<=h;h--)f=a.currentTarget=b[h],e=f.fireListeners(d,!0,a)&&e;a.propagationStopped_||(f=a.currentTarget=c,e=f.fireListeners(d,!0,a)&&e,a.propagationStopped_||
(e=f.fireListeners(d,!1,a)&&e));if(b)for(h=0;!a.propagationStopped_&&h<b.length;h++)f=a.currentTarget=b[h],e=f.fireListeners(d,!1,a)&&e;return e};v.disposeInternal=function(){T.superClass_.disposeInternal.call(this);this.removeAllListeners();this.parentEventTarget_=null};v.listen=function(a,b,c,d){this.assertInitialized_();return this.eventTargetListeners_.add(String(a),b,!1,c,d)};v.listenOnce=function(a,b,c,d){return this.eventTargetListeners_.add(String(a),b,!0,c,d)};
v.unlisten=function(a,b,c,d){return this.eventTargetListeners_.remove(String(a),b,c,d)};v.unlistenByKey=function(a){return this.eventTargetListeners_.removeByKey(a)};v.removeAllListeners=function(a){return this.eventTargetListeners_?this.eventTargetListeners_.removeAll(a):0};
v.fireListeners=function(a,b,c){a=this.eventTargetListeners_.listeners[String(a)];if(!a)return!0;a=a.concat();for(var d=!0,e=0;e<a.length;++e){var f=a[e];if(f&&!f.removed&&f.capture==b){var h=f.listener,l=f.handler||f.src;f.callOnce&&this.unlistenByKey(f);d=!1!==h.call(l,c)&&d}}return d&&0!=c.returnValue_};v.getListener=function(a,b,c,d){return this.eventTargetListeners_.getListener(String(a),b,c,d)};v.assertInitialized_=function(){D(this.eventTargetListeners_,ua)};var xc=function(a,b){b.preventDefault();a(b);return!1};var yc=function(a){a=a.className;return z(a)&&a.match(/\S+/g)||[]},zc=function(a,b){for(var c=yc(a),d=Mb(arguments,1),e=c.length+d.length,f=c,h=0;h<d.length;h++)E(f,d[h])||f.push(d[h]);a.className=c.join(k);return c.length==e},Bc=function(a,b){var c=yc(a),d=Mb(arguments,1),e=Ac(c,d);a.className=e.join(k);return e.length==c.length-d.length},Ac=function(a,b){return Ib(a,function(a){return!E(b,a)})},Cc=function(a,b){var c=!E(yc(a),b);c?zc(a,b):Bc(a,b);return c};!I&&!G||G&&9<=ac||I&&M("1.9.1");var Dc=G&&!M("9");var U=function(a,b,c,d){a=d||a;b=b&&b!=ka?b.toUpperCase():g;if(a.querySelectorAll&&a.querySelector&&(b||c))return a.querySelectorAll(b+(c?m+c:g));if(c&&a.getElementsByClassName){a=a.getElementsByClassName(c);if(b){d={};for(var e=0,f=0,h;h=a[f];f++)b==h.nodeName&&(d[e++]=h);d.length=e;return d}return a}a=a.getElementsByTagName(b||ka);if(c){d={};for(f=e=0;h=a[f];f++)b=h.className,typeof b.split==r&&E(b.split(/\s+/),c)&&(d[e++]=h);d.length=e;return d}return a},Fc={SCRIPT:1,STYLE:1,HEAD:1,IFRAME:1,OBJECT:1},
Gc={IMG:k,BR:aa},Ic=function(a){if(Dc&&Ta in a)a=a.innerText.replace(/(\r\n|\r|\n)/g,aa);else{var b=[];Hc(a,b,!0);a=b.join(g)}a=a.replace(/ \xAD /g,k).replace(/\xAD/g,g);a=a.replace(/\u200B/g,g);Dc||(a=a.replace(/ +/g,k));a!=k&&(a=a.replace(/^\s*/,g));return a},Hc=function(a,b,c){if(!(a.nodeName in Fc))if(3==a.nodeType)c?b.push(String(a.nodeValue).replace(/(\r\n|\r|\n)/g,g)):b.push(a.nodeValue);else if(a.nodeName in Gc)b.push(Gc[a.nodeName]);else for(a=a.firstChild;a;)Hc(a,b,c),a=a.nextSibling};var V="StopIteration"in w?w.StopIteration:{message:"StopIteration",stack:g},W=function(){};W.prototype.next=function(){throw V;};W.prototype.__iterator__=function(){return this};
var Jc=function(a){if(a instanceof W)return a;if(typeof a.__iterator__==r)return a.__iterator__(!1);if(y(a)){var b=0,c=new W;c.next=function(){for(;;){if(b>=a.length)throw V;if(b in a)return a[b++];b++}};return c}throw Error("Not implemented");},Kc=function(a,b,c){if(y(a))try{Hb(a,b,c)}catch(d){if(d!==V)throw d;}else{a=Jc(a);try{for(;;)b.call(c,a.next(),void 0,a)}catch(d){if(d!==V)throw d;}}};var Lc=function(a){a=String(a);if(/^\s*$/.test(a)?0:/^[\],:{}\s\u2028\u2029]*$/.test(a.replace(/\\["\\\/bfnrtu]/g,qa).replace(/"[^"\\\n\r\u2028\u2029\x00-\x08\x0a-\x1f]*"|true|false|null|-?\d+(?:\.\d*)?(?:[eE][+\-]?\d+)?/g,Ea).replace(/(?:^|:|,)(?:[\s\u2028\u2029]*\[)+/g,g)))try{return eval(ha+a+ja)}catch(b){}throw Error("Invalid JSON string: "+a);};var X=function(a,b){this.map_={};this.keys_=[];this.version_=this.count_=0;var c=arguments.length;if(1<c){if(c%2)throw Error("Uneven number of arguments");for(var d=0;d<c;d+=2)this.set(arguments[d],arguments[d+1])}else a&&this.addAll(a)};v=X.prototype;v.getValues=function(){this.cleanupKeysArray_();for(var a=[],b=0;b<this.keys_.length;b++)a.push(this.map_[this.keys_[b]]);return a};v.getKeys=function(){this.cleanupKeysArray_();return this.keys_.concat()};
v.remove=function(a){return Object.prototype.hasOwnProperty.call(this.map_,a)?(delete this.map_[a],this.count_--,this.version_++,this.keys_.length>2*this.count_&&this.cleanupKeysArray_(),!0):!1};
v.cleanupKeysArray_=function(){if(this.count_!=this.keys_.length){for(var a=0,b=0;a<this.keys_.length;){var c=this.keys_[a];Object.prototype.hasOwnProperty.call(this.map_,c)&&(this.keys_[b++]=c);a++}this.keys_.length=b}if(this.count_!=this.keys_.length){for(var d={},b=a=0;a<this.keys_.length;)c=this.keys_[a],Object.prototype.hasOwnProperty.call(d,c)||(this.keys_[b++]=c,d[c]=1),a++;this.keys_.length=b}};v.get=function(a,b){return Object.prototype.hasOwnProperty.call(this.map_,a)?this.map_[a]:b};
v.set=function(a,b){Object.prototype.hasOwnProperty.call(this.map_,a)||(this.count_++,this.keys_.push(a),this.version_++);this.map_[a]=b};v.addAll=function(a){var b;a instanceof X?(b=a.getKeys(),a=a.getValues()):(b=Ob(a),a=Nb(a));for(var c=0;c<b.length;c++)this.set(b[c],a[c])};v.forEach=function(a,b){for(var c=this.getKeys(),d=0;d<c.length;d++){var e=c[d],f=this.get(e);a.call(b,f,e,this)}};v.clone=function(){return new X(this)};v.getKeyIterator=function(){return this.__iterator__(!0)};
v.__iterator__=function(a){this.cleanupKeysArray_();var b=0,c=this.version_,d=this,e=new W;e.next=function(){if(c!=d.version_)throw Error("The map has changed since the iterator was created");if(b>=d.keys_.length)throw V;var e=d.keys_[b++];return a?e:d.map_[e]};return e};var Mc=function(a){if(a.getValues&&typeof a.getValues==r)return a.getValues();if(z(a))return a.split(g);if(y(a)){for(var b=[],c=a.length,d=0;d<c;d++)b.push(a[d]);return b}return Nb(a)},Nc=function(a,b,c){if(a.forEach&&typeof a.forEach==r)a.forEach(b,c);else if(y(a)||z(a))Hb(a,b,c);else{var d;if(a.getKeys&&typeof a.getKeys==r)d=a.getKeys();else if(a.getValues&&typeof a.getValues==r)d=void 0;else if(y(a)||z(a)){d=[];for(var e=a.length,f=0;f<e;f++)d.push(f)}else d=Ob(a);for(var e=Mc(a),f=e.length,h=
0;h<f;h++)b.call(c,e[h],d&&d[h],a)}};var Oc=function(a,b,c){if(x(a)==r)c&&(a=A(a,c));else if(a&&typeof a.handleEvent==r)a=A(a.handleEvent,a);else throw Error("Invalid listener argument");return 2147483647<b?-1:w.setTimeout(a,b||0)};var Pc=/^(?:([^:/?#.]+):)?(?:\/\/(?:([^/?#]*)@)?([^/#?]*?)(?::([0-9]+))?(?=[/#?]|$))?([^?#]+)?(?:\?([^#]*))?(?:#(.*))?$/;var Qc=function(){};Qc.prototype.cachedOptions_=null;Qc.prototype.getOptions=function(){return this.cachedOptions_||(this.cachedOptions_=this.internalGetOptions())};var Rc,Y=function(){};B(Y,Qc);Y.prototype.createInstance=function(){var a=this.getProgId_();return a?new ActiveXObject(a):new XMLHttpRequest};Y.prototype.internalGetOptions=function(){var a={};this.getProgId_()&&(a[0]=!0,a[1]=!0);return a};
Y.prototype.getProgId_=function(){if(!this.ieProgId_&&"undefined"==typeof XMLHttpRequest&&"undefined"!=typeof ActiveXObject){for(var a=[za,ya,xa,Aa],b=0;b<a.length;b++){var c=a[b];try{return new ActiveXObject(c),this.ieProgId_=c}catch(d){}}throw Error("Could not create ActiveXObject. ActiveX might be disabled, or MSXML might not be installed");}return this.ieProgId_};Rc=new Y;var Z=function(a){T.call(this);this.headers=new X;this.xmlHttpFactory_=a||null;this.active_=!1;this.xhrOptions_=this.xhr_=null;this.lastUri_=g;this.inAbort_=this.inOpen_=this.inSend_=this.errorDispatched_=!1;this.timeoutInterval_=0;this.timeoutId_=null;this.responseType_=g;this.useXhr2Timeout_=this.progressEventsEnabled_=this.withCredentials_=!1};B(Z,T);
var Sc=/^https?$/i,Tc=[n,"PUT"],Uc=[],Vc=function(a,b,c,d,e,f,h){var l=new Z;Uc.push(l);b&&l.listen(q,b);l.listenOnce(bb,l.cleanupSend_);f&&l.setTimeoutInterval(f);h&&l.setWithCredentials(h);l.send(a,c,d,e);return l};Z.prototype.cleanupSend_=function(){this.dispose();Lb(Uc,this)};Z.prototype.setTimeoutInterval=function(a){this.timeoutInterval_=Math.max(0,a)};Z.prototype.setWithCredentials=function(a){this.withCredentials_=a};
Z.prototype.send=function(a,b,c,d){if(this.xhr_)throw Error("[goog.net.XhrIo] Object is active with another request="+this.lastUri_+"; newUri="+a);b=b?b.toUpperCase():va;this.lastUri_=a;this.errorDispatched_=!1;this.active_=!0;this.xhr_=this.createXhr();this.xhrOptions_=this.xmlHttpFactory_?this.xmlHttpFactory_.getOptions():Rc.getOptions();this.xhr_.onreadystatechange=A(this.onReadyStateChange_,this);this.progressEventsEnabled_&&$a in this.xhr_&&(this.xhr_.onprogress=A(function(a){this.onProgressHandler_(a,
!0)},this),this.xhr_.upload&&(this.xhr_.upload.onprogress=A(this.onProgressHandler_,this)));try{this.inOpen_=!0,this.xhr_.open(b,String(a),!0),this.inOpen_=!1}catch(f){this.error_(5,f);return}a=c||g;var e=this.headers.clone();d&&Nc(d,function(a,b){e.set(b,a)});d=Jb(e.getKeys(),Wc);c=w.FormData&&a instanceof w.FormData;!E(Tc,b)||d||c||e.set(ta,Ja);e.forEach(function(a,b){this.xhr_.setRequestHeader(b,a)},this);this.responseType_&&(this.xhr_.responseType=this.responseType_);Pb(this.xhr_,ub)&&(this.xhr_.withCredentials=
this.withCredentials_);try{this.cleanUpTimeoutTimer_(),0<this.timeoutInterval_&&((this.useXhr2Timeout_=Xc(this.xhr_))?(this.xhr_.timeout=this.timeoutInterval_,this.xhr_.ontimeout=A(this.timeout_,this)):this.timeoutId_=Oc(this.timeout_,this.timeoutInterval_,this)),this.inSend_=!0,this.xhr_.send(a),this.inSend_=!1}catch(f){this.error_(5,f)}};var Xc=function(a){return G&&M(9)&&typeof a.timeout==t&&void 0!==a.ontimeout},Wc=function(a){return Ma==a.toLowerCase()};v=Z.prototype;
v.createXhr=function(){return this.xmlHttpFactory_?this.xmlHttpFactory_.createInstance():Rc.createInstance()};v.timeout_=function(){"undefined"!=typeof vb&&this.xhr_&&(this.dispatchEvent(qb),this.abort(8))};v.error_=function(){this.active_=!1;this.xhr_&&(this.inAbort_=!0,this.xhr_.abort(),this.inAbort_=!1);this.dispatchErrors_();this.cleanUpXhr_()};v.dispatchErrors_=function(){this.errorDispatched_||(this.errorDispatched_=!0,this.dispatchEvent(q),this.dispatchEvent(Oa))};
v.abort=function(){this.xhr_&&this.active_&&(this.active_=!1,this.inAbort_=!0,this.xhr_.abort(),this.inAbort_=!1,this.dispatchEvent(q),this.dispatchEvent(Ia),this.cleanUpXhr_())};v.disposeInternal=function(){this.xhr_&&(this.active_&&(this.active_=!1,this.inAbort_=!0,this.xhr_.abort(),this.inAbort_=!1),this.cleanUpXhr_(!0));Z.superClass_.disposeInternal.call(this)};v.onReadyStateChange_=function(){if(!this.disposed_)if(this.inOpen_||this.inSend_||this.inAbort_)this.onReadyStateChangeHelper_();else this.onReadyStateChangeEntryPoint_()};
v.onReadyStateChangeEntryPoint_=function(){this.onReadyStateChangeHelper_()};v.onReadyStateChangeHelper_=function(){if(this.active_&&"undefined"!=typeof vb&&(!this.xhrOptions_[1]||4!=this.getReadyState()||2!=this.getStatus()))if(this.inSend_&&4==this.getReadyState())Oc(this.onReadyStateChange_,0,this);else if(this.dispatchEvent(cb),this.isComplete()){this.active_=!1;try{this.isSuccess()?(this.dispatchEvent(q),this.dispatchEvent(pb)):this.dispatchErrors_()}finally{this.cleanUpXhr_()}}};
v.onProgressHandler_=function(a,b){D(a.type===ab,Ra);this.dispatchEvent(Yc(a,ab));this.dispatchEvent(Yc(a,b?Na:rb))};var Yc=function(a,b){return{type:b,lengthComputable:a.lengthComputable,loaded:a.loaded,total:a.total}};v=Z.prototype;v.cleanUpXhr_=function(a){if(this.xhr_){this.cleanUpTimeoutTimer_();var b=this.xhr_,c=this.xhrOptions_[0]?xb:null;this.xhrOptions_=this.xhr_=null;a||this.dispatchEvent(bb);try{b.onreadystatechange=c}catch(d){}}};
v.cleanUpTimeoutTimer_=function(){this.xhr_&&this.useXhr2Timeout_&&(this.xhr_.ontimeout=null);typeof this.timeoutId_==t&&(w.clearTimeout(this.timeoutId_),this.timeoutId_=null)};v.isComplete=function(){return 4==this.getReadyState()};v.isSuccess=function(){var a=this.getStatus(),b;a:switch(a){case 200:case 201:case 202:case 204:case 206:case 304:case 1223:b=!0;break a;default:b=!1}return b||0===a&&!this.isLastUriEffectiveSchemeHttp_()};
v.isLastUriEffectiveSchemeHttp_=function(){var a=String(this.lastUri_).match(Pc)[1]||null;!a&&w.self&&w.self.location&&(a=w.self.location.protocol,a=a.substr(0,a.length-1));return Sc.test(a?a.toLowerCase():g)};v.getReadyState=function(){return this.xhr_?this.xhr_.readyState:0};v.getStatus=function(){try{return 2<this.getReadyState()?this.xhr_.status:-1}catch(a){return-1}};v.getResponseJson=function(a){if(this.xhr_){var b=this.xhr_.responseText;a&&0==b.indexOf(a)&&(b=b.substring(a.length));return Lc(b)}};var Zc=function(a,b){this.entityId_=encodeURIComponent(a);b?this.sender_=b:(this.sender_=Z,this.sender_.send=Vc);this.writeToken_=g;this.options_={};this.counts_={};this.decodeLabel_={};this.selectedReactions_=new X};v=Zc.prototype;
v.initialize=function(a){a=U(document,Ha,kb,document.getElementById(a));for(var b=0;b<a.length;b++){var c=a[b],d=U(document,mb,jb,c)[0],d=Ic(d);this.options_[d]=c;var e=this.encodeLabel_(d);this.decodeLabel_[e]=d;var e=c,f=A(this.toggle,this,d);kc(e,La,Ab(xc,f));c=U(document,mb,hb,c)[0];this.counts_[d]=c;c.innerHTML=oa}a=A(this.displayRetrievedAnnotations_,this);b=A(this.disableOptions_,this);this.loadExistingReactions_(a,b)};v.setZipitToken_=function(a){this.writeToken_=a};
v.loadZipitToken_=function(a){var b=A(this.disableOptions_,this),c=A(this.setZipitToken_,this),d=A(this.toggle,this);this.sender_.send(ma,function(){if(this.isSuccess()){var e=this.getResponseJson();c(e.channelHeader.token);a&&d(a)}else b()},n,eb)};v.loadExistingReactions_=function(a,b){this.sender_.send(la,function(){this.isSuccess()?a(this.getResponseJson()):b()},n,fb+this.entityId_+ea+this.entityId_+fa)};
v.displayRetrievedAnnotations_=function(a){if(a.entityAggregates)for(var b=0;b<a.entityAggregates.length;b++){var c=!1;if(c=a.entityAggregates[b].labels)for(var d=0;d<c.length;d++){var e=this.counts_[this.decodeLabel_[c[d].label]];if(e){var f=parseInt(Ic(e),10);isNaN(f)&&(f=0);e.innerHTML=f+parseInt(c[d].count,10)}}}};v.encodeLabel_=function(a){a=a.replace(/([^A-Za-z ])/g,function(a){return Ga+a.charCodeAt(0)});return a=a.replace(/([A-Z])/g,function(a){return Ga+a.toLowerCase()})};
v.disableOptions_=function(){for(var a=U(document,Ha,kb,document.getElementById(ib)),b=0;b<a.length;b++){var c=a[b];c.style.borderColor=null;tc(c)}};
v.toggle=function(a){if(this.writeToken_==g)this.loadZipitToken_(a);else{if(this.selectedReactions_.get(a)){var b=!1;this.selectedReactions_.remove(a)}else b=!0,this.selectedReactions_.set(a,!0);var c=g;Kc(this.selectedReactions_.getKeyIterator(),function(a){c=c+ba+this.encodeLabel_(a)+ca},this);this.sender_.send(na,xb,n,db+this.entityId_+da+c+Fa+this.writeToken_);var d=this.options_[a];if(d){a=this.counts_[a];var e=parseInt(Ic(a),10);isNaN(e)&&(e=0);a.innerHTML=b?e+1:e-1;Cc(d,gb);Cc(d,lb)}}};wb("BLOG_Annotator",Zc,void 0);Zc.prototype.initialize=Zc.prototype.initialize;wb("BLOG_listenOnce",qc,void 0); })()
