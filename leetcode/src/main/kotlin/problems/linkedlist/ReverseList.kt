package org.example.problems.linkedlist

fun reverseList(head: ListNode?): ListNode? {
    var tail = head
    var cur = head!!.next
    while (cur != null) {
        val tmp = tail
        tail = cur
        tail.next = tmp

        cur = cur.next
    }

    return tail
}