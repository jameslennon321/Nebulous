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
import org.robovm.apple.foundation.NSArray;
import org.robovm.apple.foundation.NSData;
import org.robovm.apple.foundation.NSDate;
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObject;
import org.robovm.objc.ObjCRuntime;
import org.robovm.objc.annotation.NativeClass;
import org.robovm.objc.annotation.Property;
import org.robovm.rt.bro.annotation.Library;
import org.robovm.rt.bro.ptr.Ptr;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Library("StoreKit") @NativeClass/*</annotations>*/
/*<visibility>*/public/*</visibility>*/ class /*<name>*/SKPaymentTransaction/*</name>*/ 
    extends /*<extends>*/NSObject/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*/public static class SKPaymentTransactionPtr extends Ptr<SKPaymentTransaction, SKPaymentTransactionPtr> {}/*</ptr>*/
    /*<bind>*/static { ObjCRuntime.bind(SKPaymentTransaction.class); }/*</bind>*/
    /*<constants>*//*</constants>*/
    /*<constructors>*/
    public SKPaymentTransaction() {}
    protected SKPaymentTransaction(SkipInit skipInit) { super(skipInit); }
    /*</constructors>*/
    /*<properties>*/
    @Property(selector = "error")
    public native NSError getError();
    @Property(selector = "originalTransaction")
    public native SKPaymentTransaction getOriginalTransaction();
    @Property(selector = "payment")
    public native SKPayment getPayment();
    @Property(selector = "downloads")
    public native NSArray<SKDownload> getDownloads();
    @Property(selector = "transactionDate")
    public native NSDate getTransactionDate();
    @Property(selector = "transactionIdentifier")
    public native String getTransactionIdentifier();
    @Property(selector = "transactionReceipt")
    public native NSData getTransactionReceipt();
    @Property(selector = "transactionState")
    public native SKPaymentTransactionState getTransactionState();
    /*</properties>*/
    /*<members>*//*</members>*/
    /*<methods>*/
    /*</methods>*/
}
