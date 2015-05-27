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

package org.diet4j.examples.utils;

/**
 * A class in a library.
 */
public class StringUtils
{
    /**
     * Turns letters randomly uppercase or lowercase.
     * 
     * @param s the String to work on
     * @return the result
     */
    public static String ransomify(
            String s )
    {
        StringBuilder buf = new StringBuilder( s.length() );
        for( int i = 0 ; i < s.length() ; ++i ) {
            char c = s.charAt( i );
            if( Character.isUpperCase( c )) {
                if( Math.random() > 0.5 ) {
                    c = Character.toLowerCase( c );
                }
            } else if( Character.isLowerCase( c )) {
                if( Math.random() > 0.5 ) {
                    c = Character.toUpperCase( c );
                }
            } else {
                c = '.';
            }
            buf.append( c );
        } 
        return buf.toString();
    }
}
