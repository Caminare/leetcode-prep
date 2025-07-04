package org.example.problems.linkedlist

fun main() {

}

fun mergeTwoLists(list1: ListNode?, list2: ListNode?): ListNode? {
    val dummy = ListNode(0)
    var op = dummy
    var l1 = list1
    var l2 = list2

    while (l1 != null && l2 != null) {
        if (l2.`val` >= l1.`val`) {
            op.next = l1
            l1 = l1.next
        } else {
            op.next = l2
            l2 = l2.next
        }

        op = op.next!!
    }

    return dummy.next
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}