package org.example.problems.binarytree

fun lowestCommonAncestor(root: TreeNode?, p: TreeNode?, q: TreeNode?): TreeNode? {
    var cur = root

    while (cur != null) {
        cur = if (p!!.`val` > cur.`val` && q!!.`val` > cur.`val`) cur.right
        else if (p!!.`val` < cur.`val` && q!!.`val` < cur.`val`) cur.left
        else return cur
    }

    return cur
}

