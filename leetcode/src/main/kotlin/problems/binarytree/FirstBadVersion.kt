package org.example.problems.binarytree

class Solution: VersionControl() {
    fun firstBadVersion(n: Int) : Int {
        var l = 1L
        var r = n.toLong() + 1

        while (l < r) {
            val mid = l + ((r - l) / 2)
            if (isBadVersion(mid.toInt())) r = mid
            else l = mid + 1
        }

        return l.toInt()
    }

    fun isBadVersion(m: Int): Boolean {
        return m == 3
    }
}

open class VersionControl {
    fun firstBadVersion(): Int {
        return 0
    }
}
