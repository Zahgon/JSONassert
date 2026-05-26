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

import org.json.JSONArray;
import org.json.JSONObject;
import org.skyscreamer.jsonassert.JSONCompareResult;
import java.util.*;
import static org.skyscreamer.jsonassert.comparator.JSONCompareUtil.*;

/**
 * This class provides a skeletal implementation of the {@link JSONComparator}
 * interface, to minimize the effort required to implement this interface.
 */
public abstract class AbstractComparator implements JSONComparator {

    /**
     * Default constructor
     */
    public AbstractComparator() {
    }

    /**
     * Compares JSONObject provided to the expected JSONObject, and returns the results of the comparison.
     *
     * @param expected Expected JSONObject
     * @param actual   JSONObject to compare
     */
    @Override
    public final JSONCompareResult compareJSON(JSONObject expected, JSONObject actual) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Compares JSONArray provided to the expected JSONArray, and returns the results of the comparison.
     *
     * @param expected Expected JSONArray
     * @param actual   JSONArray to compare
     */
    @Override
    public final JSONCompareResult compareJSON(JSONArray expected, JSONArray actual) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param prefix
     * @param expected
     * @param actual
     * @param result
     */
    protected void checkJsonObjectKeysActualInExpected(String prefix, JSONObject expected, JSONObject actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * @param prefix
     * @param expected
     * @param actual
     * @param result
     */
    protected void checkJsonObjectKeysExpectedInActual(String prefix, JSONObject expected, JSONObject actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void compareJSONArrayOfJsonObjects(String key, JSONArray expected, JSONArray actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void compareJSONArrayOfSimpleValues(String key, JSONArray expected, JSONArray actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    protected void compareJSONArrayWithStrictOrder(String key, JSONArray expected, JSONArray actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    // This is expensive (O(n^2) -- yuck), but may be the only resort for some cases with loose array ordering, and no
    // easy way to uniquely identify each element.
    // This is expensive (O(n^2) -- yuck), but may be the only resort for some cases with loose array ordering, and no
    // easy way to uniquely identify each element.
    protected void recursivelyCompareJSONArray(String key, JSONArray expected, JSONArray actual, JSONCompareResult result) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
