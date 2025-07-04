package org.example.problems.stack

class MyQueue() {
    var read = ArrayList<Int>()
    var write = ArrayList<Int>()

    fun push(x: Int) {
        write.add(x)
    }

    fun pop(): Int {
        peek()
        return read.removeLast()
    }

    fun peek(): Int {
        if (read.isEmpty()) {
            while (write.isNotEmpty()) {
                read.add(write.removeLast())
            }
        }

        return read.last()
    }

    fun empty(): Boolean {
        return read.isEmpty() && write.isEmpty()
    }

}