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
import org.robovm.apple.foundation.NSError;
import org.robovm.apple.foundation.NSObjectProtocol;
import org.robovm.objc.annotation.Method;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*//*</annotations>*/
/*<visibility>*/public/*</visibility>*/ interface /*<name>*/SKPaymentTransactionObserver/*</name>*/ 
    extends /*<extends>*/NSObjectProtocol/*</extends>*/ 
    /*<implements>*//*</implements>*/ {

    /*<ptr>*//*</ptr>*/
    /*<bind>*//*</bind>*/
    /*<constants>*//*</constants>*/
    /*<properties>*/
    
    /*</properties>*/
    /*<methods>*/
    @Method(selector = "paymentQueue:updatedTransactions:")
    void updatedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:removedTransactions:")
    void removedTransactions(SKPaymentQueue queue, NSArray<SKPaymentTransaction> transactions);
    @Method(selector = "paymentQueue:restoreCompletedTransactionsFailedWithError:")
    void restoreCompletedTransactionsFailed(SKPaymentQueue queue, NSError error);
    @Method(selector = "paymentQueueRestoreCompletedTransactionsFinished:")
    void restoreCompletedTransactionsFinished(SKPaymentQueue queue);
    @Method(selector = "paymentQueue:updatedDownloads:")
    void updatedDownloads(SKPaymentQueue queue, NSArray<SKDownload> downloads);
    /*</methods>*/
    /*<adapter>*/
    /*</adapter>*/
}
