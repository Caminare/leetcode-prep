package org.example.problems.stack

fun main() {
    val testCases = listOf(
        "(]",
        "()",
        "()[]{}",
        "([])"
    )
    val resultsMap = mutableMapOf<String, Boolean>()

    for (test in testCases) {
        val result = isValid(test)
        resultsMap[test] = result
    }

    println("The results are: $resultsMap")
}

fun isValid(s: String): Boolean {
    if (s.length % 2 != 0) return false

    val stack = mutableListOf<Char>()
    val map = mapOf(
        '(' to ')',
        '[' to ']',
        '{' to '}'
    )

    for(c in s) {
        if (c in map) stack.add(c)
        else if (stack.isNotEmpty()) {
            val top = stack.last()
            val reversed = map[top]

            if (c != reversed) return false

            stack.removeLast()
        } else return false
    }

    return stack.isEmpty()
}