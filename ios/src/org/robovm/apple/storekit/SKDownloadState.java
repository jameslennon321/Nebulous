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
import org.robovm.rt.bro.ValuedEnum;
import org.robovm.rt.bro.annotation.Marshaler;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/SKDownloadState/*</name>*/ implements ValuedEnum {
    /*<values>*/
	 Waiting(0L),
	 Active(1L),
	 Paused(2L),
	 Finished(3L),
	 Failed(4L),
	 Cancelled(5L);
    /*</values>*/
	 
    private final long n;

    private /*<name>*/SKDownloadState/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SKDownloadState/*</name>*/ valueOf(long n) {
        for (/*<name>*/SKDownloadState/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SKDownloadState/*</name>*/.class.getName());
    }
}
