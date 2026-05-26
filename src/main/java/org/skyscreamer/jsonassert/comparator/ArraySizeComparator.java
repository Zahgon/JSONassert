/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
*/
package org.skyscreamer.jsonassert.comparator;

import java.text.MessageFormat;
import org.json.JSONArray;
import org.skyscreamer.jsonassert.JSONCompareMode;
import org.skyscreamer.jsonassert.JSONCompareResult;

/**
 * A JSONAssert array size comparator.
 *
 * <p>Some typical usage idioms are listed below.</p>
 *
 * <p>Assuming JSON to be verified is held in String variable ARRAY_OF_JSONOBJECTS and contains:</p>
 *
 * <code>{a:[7, 8, 9]}</code>
 *
 * <p>then:</p>
 *
 * <p>To verify that array 'a' contains 3 elements:</p>
 *
 * <code>
 * JSONAssert.assertEquals("{a:[3]}", ARRAY_OF_JSONOBJECTS, new ArraySizeComparator(JSONCompareMode.LENIENT));
 * </code>
 *
 * <p>To verify that array 'a' contains between 2 and 6 elements:</p>
 *
 * <code>
 * JSONAssert.assertEquals("{a:[2,6]}", ARRAY_OF_JSONOBJECTS, new ArraySizeComparator(JSONCompareMode.LENIENT));
 * </code>
 *
 * @author Duncan Mackinder
 */
public class ArraySizeComparator extends DefaultComparator {

    /**
     * Create new ArraySizeComparator.
     *
     * @param mode
     *            comparison mode, has no impact on ArraySizeComparator but is
     *            used by instance of superclass DefaultComparator to control
     *            comparison of JSON items other than arrays.
     */
    public ArraySizeComparator(JSONCompareMode mode) {
        super(mode);
    }

    /**
     * Expected array should consist of either 1 or 2 integer values that define
     * maximum and minimum valid lengths of the actual array. If expected array
     * contains a single integer value, then the actual array must contain
     * exactly that number of elements.
     */
    @Override
    public void compareJSONArray(String prefix, JSONArray expected, JSONArray actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
