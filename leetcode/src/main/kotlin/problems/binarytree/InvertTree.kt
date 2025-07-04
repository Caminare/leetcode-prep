package org.example.problems.binarytree

fun invertTree(root: TreeNode?): TreeNode? {
    if (root == null) return root
    val tmp = root.left
    root.left = invertTree(root.right)
    root.right = invertTree(tmp)

    return root
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}