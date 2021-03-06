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
package org.robovm.apple.social;

/*<imports>*/
import org.robovm.rt.bro.ValuedEnum;
import org.robovm.rt.bro.annotation.Marshaler;
/*</imports>*/

/**
 * <div class="javadoc"></div>
 */
/*<annotations>*/@Marshaler(ValuedEnum.AsMachineSizedUIntMarshaler.class)/*</annotations>*/
public enum /*<name>*/SLComposeViewControllerResult/*</name>*/ implements ValuedEnum {
    /*<values>*/
	 Cancelled(0L),
	 Done(1L);
    /*</values>*/
	 
    private final long n;

    private /*<name>*/SLComposeViewControllerResult/*</name>*/(long n) { this.n = n; }
    public long value() { return n; }
    public static /*<name>*/SLComposeViewControllerResult/*</name>*/ valueOf(long n) {
        for (/*<name>*/SLComposeViewControllerResult/*</name>*/ v : values()) {
            if (v.n == n) {
                return v;
            }
        }
        throw new IllegalArgumentException("No constant with value " + n + " found in " 
            + /*<name>*/SLComposeViewControllerResult/*</name>*/.class.getName());
    }
}
