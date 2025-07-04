package org.example.problems.string

fun main() {

}

fun isPalindrome(s: String): Boolean {
    if (s.length <= 1) return true

    var l = 0
    var r = s.length - 1

    while (l < r) {
        while (!s[l].isLetterOrDigit() && l < r) l++
        while (!s[r].isLetterOrDigit() && l < r) r--

        if (s[l].lowercaseChar() != s[r].lowercaseChar()) return false

        l++
        r--
    }

    return true
}