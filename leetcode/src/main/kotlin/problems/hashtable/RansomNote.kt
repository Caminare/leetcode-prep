package org.example.problems.hashtable

fun canConstruct(ransomNote: String, magazine: String): Boolean {
    if (magazine.length < ransomNote.length) return false

    val map = mutableMapOf<Char, Int>()

    for (c in magazine) {
        map[c] = map.getOrDefault(c, 0) + 1
    }

    for (c in ransomNote) {
        if (map.containsKey(c)) {
            if (map[c] == 1) map.remove(c)
            else map[c] = map[c]!! - 1
        } else return false
    }
    return true
}