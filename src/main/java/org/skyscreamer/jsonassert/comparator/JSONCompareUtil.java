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

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import org.json.JSONArray;
import org.json.JSONObject;

/**
 * Utility class that contains Json manipulation methods.
 */
public final class JSONCompareUtil {

    private static Integer INTEGER_ONE = new Integer(1);

    private JSONCompareUtil() {
    }

    /**
     * Converts the provided {@link JSONArray} to a Map of {@link JSONObject}s where the key of each object
     * is the value at {@code uniqueKey} in each object.
     *
     * @param array     the JSON array to convert
     * @param uniqueKey the key to map the JSON objects to
     * @return the map of {@link JSONObject}s from {@code array}
     */
    public static Map<Object, JSONObject> arrayOfJsonObjectToMap(JSONArray array, String uniqueKey) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Searches for the unique key of the {@code expected} JSON array.
     *
     * @param expected the array to find the unique key of
     * @return the unique key if there's any, otherwise null
     */
    public static String findUniqueKey(JSONArray expected) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * <p>Looks to see if candidate field is a possible unique key across a array of objects.
     * Returns true IFF:</p>
     * <ol>
     *   <li>array is an array of JSONObject
     *   <li>candidate is a top-level field in each of of the objects in the array
     *   <li>candidate is a simple value (not JSONObject or JSONArray)
     *   <li>candidate is unique across all elements in the array
     * </ol>
     *
     * @param candidate is usable as a unique key if every element in the
     * @param array is a JSONObject having that key, and no two values are the same.
     * @return true if the candidate can work as a unique id across array
     */
    public static boolean isUsableAsUniqueKey(String candidate, JSONArray array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Converts the given {@link JSONArray} to a list of {@link Object}s.
     *
     * @param expected the JSON array to convert
     * @return the list of objects from the {@code expected} array
     */
    public static List<Object> jsonArrayToList(JSONArray expected) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns the value present in the given index position. If null value is present, it will return null
     *
     * @param jsonArray the JSON array to get value from
     * @param index index of object to retrieve
     * @return value at the given index position
     */
    public static Object getObjectOrNull(JSONArray jsonArray, int index) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns whether all of the elements in the given array are simple values.
     *
     * @param array the JSON array to iterate through on
     * @return true if all the elements in {@code array} are simple values
     * @see #isSimpleValue(Object)
     */
    public static boolean allSimpleValues(JSONArray array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns whether the given object is a simple value: not {@link JSONObject} and not {@link JSONArray}.
     *
     * @param o the object to inspect
     * @return true if {@code o} is a simple value
     */
    public static boolean isSimpleValue(Object o) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns whether all elements in {@code array} are {@link JSONObject} instances.
     *
     * @param array the array to inspect
     * @return true if all the elements in the given array are JSONObjects
     */
    public static boolean allJSONObjects(JSONArray array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Returns whether all elements in {@code array} are {@link JSONArray} instances.
     *
     * @param array the array to inspect
     * @return true if all the elements in the given array are JSONArrays
     */
    public static boolean allJSONArrays(JSONArray array) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Collects all keys in {@code jsonObject}.
     *
     * @param jsonObject the {@link JSONObject} to get the keys of
     * @return the set of keys
     */
    public static Set<String> getKeys(JSONObject jsonObject) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String qualify(String prefix, String key) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static String formatUniqueKey(String key, String uniqueKey, Object value) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    /**
     * Creates a cardinality map from {@code coll}.
     *
     * @param coll the collection of items to convert
     * @param <T>  the type of elements in the input collection
     * @return the cardinality map
     */
    public static <T> Map<T, Integer> getCardinalityMap(final Collection<T> coll) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
