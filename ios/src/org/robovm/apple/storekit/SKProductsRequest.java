/*
 * Copyright (C) 2014 Trillian Mobile AB
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.robovm.apple.storekit;

/*<imports>*/
import org.robovm.apple.foundation.NSSet;
import org.robovm.apple.foundation.NSString;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.Method;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.annotation.Pointer;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKProductsRequest/*</name>*/ 
    extends /*<extends>*/SKRequest/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKProductsRequestPtr extends Ptr<SKProductsRequest, SKProductsRequestPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKProductsRequest.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKProductsRequest() {}
    protected SKProductsRequest(SkipInit skipInit) { super(skipInit); }
    public SKProductsRequest(NSSet<NSString> productIdentifiers) { super((SkipInit) null); initObject(init(productIdentifiers)); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "delegate")
    public native SKProductsRequestDelegate getDelegate();
    @Property(selector = "setDelegate:", strongRef = true)
    public native void setDelegate(SKProductsRequestDelegate delegate);
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    @Method(selector = "initWithProductIdentifiers:")
    public native @Pointer long init(NSSet<NSString> productIdentifiers);
    /*</methods>*/
}
