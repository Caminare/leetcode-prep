package org.example

import java.io.File

fun main() {
    val filePath = "src/main/resources/duplicates.txt"
    val lines = readFileLines(filePath)

    if (lines.isEmpty()) {
        println("No lines to process.")
        return
    }

    val duplicates = findDuplicates(lines)

    if (duplicates.isEmpty()) {
        println("No duplicates found.")
    } else {
        println("Duplicates found:")
        duplicates.forEach { println(it) }
    }
}

//read txt file line by line
fun readFileLines(filePath: String): List<String> {
    return try {
        File(filePath).readLines()
    } catch (e: Exception) {
        println("Error reading file: ${e.message}")
        emptyList()
    }
}

fun findDuplicates(lines: List<String>): Set<String> {
    val seen = mutableSetOf<String>()
    val duplicates = mutableSetOf<String>()

    for (line in lines) {
        if (!seen.add(line)) {
            duplicates.add(line)
        }
    }

    return duplicates
}