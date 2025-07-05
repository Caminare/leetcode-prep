package org.example.problems.string

fun longestPalindrome(s: String): Int {
    val count = s.groupingBy { it }.eachCount().map {
        (_, v) ->
        v % 2
    }.sum()

    return if(count > 1) s.length - count + 1 else s.length
}