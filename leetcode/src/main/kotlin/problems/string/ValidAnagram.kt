package org.example.problems.string

fun main() {
    val result = isAnagram("car", "cat")

    println("The words are: " + if (result) "anagrams" else "not anagrams")
}

fun isAnagram(s: String, t: String): Boolean {
    if (s.length != t.length) return false

    val first = mutableMapOf<Char, Int>()
    val second = mutableMapOf<Char, Int>()

   for (i in s.indices) {
        first[s[i]] = first.getOrDefault(s[i], 0) + 1
        second[t[i]] = second.getOrDefault(t[i], 0) + 1
    }

    for ((key, value) in first) {
        if (second[key] != value) return false
    }

    return true
}