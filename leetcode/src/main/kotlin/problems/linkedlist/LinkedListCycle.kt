package org.example.problems.linkedlist

fun hasCycle(head: ListNode?): Boolean {
    val visited = mutableSetOf<ListNode>()
    var cur = head
    while (cur != null) {
        visited.add(cur)
        if (cur.next != null && visited.contains(cur.next)) return true
        cur = cur.next
    }

    return false
}