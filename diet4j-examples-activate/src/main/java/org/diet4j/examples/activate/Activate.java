//
// The rights holder(s) license this file to you under the
// Apache License, Version 2.0 (the "License"); you may not
// use this file except in compliance with the License. You
// may obtain a copy of the License at
//
//  http://www.apache.org/licenses/LICENSE-2.0
//
// For information about copyright ownership, see the NOTICE
// file distributed with this work.
//
// Unless required by applicable law or agreed to in writing,
// software distributed under the License is distributed on an
// "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
// KIND, either express or implied.  See the License for the
// specific language governing permissions and limitations
// under the License.
//

package org.diet4j.examples.activate;

import org.diet4j.core.Module;

/**
 * Activation/deactivation class for this Module. Only prints out that the
 * activation and deactivation methods were invoked.
 * @author buildmaster
 */
public class Activate
{
    /**
     * Before a Module is used, this activation method is invoked.
     * diet4j passes the Module that is being activated. Using this Module object,
     * this method can determine contextual information, e.g. the list of its
     * dependencies (already activated) and context objects that they provided
     * (if any) from their activation method (if any).
     * The return value of this method, if provided, becomes the context object
     * provided to any other Module that depends on this Module.
     * 
     * @param thisModule the Module being activated
     */
    public static void moduleActivate(
            Module thisModule )
    {
        System.err.println( Activate.class.getName() + ":" );
        System.err.println( "    activate invoked for " + thisModule.toString() );
    }

    /**
     * Before a program quite, this deactivation method is invoked on previously activated Modules.
     * diet4j passes the Module that is being deactivated.
     * 
     * @param thisModule the Module being deactivated
     */
    public static void moduleDeactivate(
            Module    thisModule )
    {
        System.err.println( Activate.class.getName() + ":" );
        System.err.println( "    deactivate invoked for " + thisModule.toString() );
    }    
}
