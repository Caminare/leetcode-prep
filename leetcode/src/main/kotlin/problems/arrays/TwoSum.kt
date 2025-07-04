package org.example.problems.arrays

fun main() {
    val nums = intArrayOf(2, 7, 11, 15)
    val target = 9
    val result = twoSum(nums, target)
    println("Indices: ${result.joinToString(", ")}")
}

fun twoSum(nums: IntArray, target: Int): IntArray {
    val map = mutableMapOf<Int, Int>()
    for ((i, value) in nums.withIndex()) {
        val complement = target - value
        if (map.containsKey(complement)) {
            return intArrayOf(map[complement]!!, i)
        }
        map[value] = i
    }

    return intArrayOf()
}