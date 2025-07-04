package org.example.problems.binarysearch

fun search(nums: IntArray, target: Int): Int {
    if (nums.isEmpty()) return -1
    if (nums.size == 1) return if (nums[0] == target) 0 else -1

    var l = 0
    var r = nums.size - 1

    while (l <= r) {
        val mid = l + ((r - l) / 2)

        if (nums[mid] == target) return mid

        if (nums[mid] > target) r = mid - 1
        if (nums[mid] < target) l = mid + 1

        if (l <= nums.size - 1 && nums[l] == target) return l
        if (r >= 0 && nums[r] == target) return r
        l++
        r--
    }

    return -1
}