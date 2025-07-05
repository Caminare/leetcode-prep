package org.example.problems.arrays

fun main(args : Array<String>) {
    // Call areTheyEqual() with test cases here
}

fun areTheyEqual(arr_a: Array<Int>, arr_b: Array<Int>): Boolean {
    val map = mutableMapOf<Int, Int>()

    for (i in arr_a.indices) {
        map[arr_a[i]] = map.getOrDefault(i, 0) + 1
        map[arr_b[i]] = map.getOrDefault(i, 0) -1
    }

    return map.values.any { v -> v != 0}
}