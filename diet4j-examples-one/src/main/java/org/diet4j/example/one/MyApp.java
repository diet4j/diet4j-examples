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

package org.diet4j.example.one;

import org.diet4j.examples.utils.StringUtils;

/**
 * Main program of the example app.
 */
public class MyApp
{
    public static void main(
            String [] args )
    {
        if( args.length == 0 ) {
            System.err.println( "Provide one or more string arguments" );
            return;
        }
        String sep = "";
        for( String arg : args ) {
            String translated = StringUtils.ransomify( arg );
            System.out.print(  sep );
            System.out.print( translated );
            sep = " ";
        }
        System.out.println();
    }
}
