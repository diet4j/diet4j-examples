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

/**
 * Print out that the main() method was invoked.
 */
public class Main
{
    /**
     * Main program, must be invoked by diet4j framework.
     * 
     * @param args command-line arguments
     */
    public static void main(
            String [] args )
    {
        System.err.println( Main.class.getName() + ":" );
        System.err.println( "    main invoked with " + ( args.length > 1 ? "arguments: " + String.join( ", ", args ) : "no args" ));
        System.err.println( "    loaded from ClassLoader " + Main.class.getClassLoader() );
        
        if( args.length == 1 && "throw".equals( args[0] )) {
            throw new NullPointerException( "Thrown at end of main(); demonstrates that Module deactivation still happens" );
        }
    }
}