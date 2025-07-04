package org.example.problems.binarytree

import kotlin.math.abs
import kotlin.math.max

fun isBalanced(root: TreeNode?): Boolean {
    var balanced = true

    tailrec fun dfs(root: TreeNode?): Int {
        if (root == null) return 0

        var left = dfs(root.left)
        var right = dfs(root.right)

        if (abs(left - right) > 1)
            balanced = false

        return max(left, right) + 1
    }

    dfs(root)

    return balanced
}