package org.example.problems.graph

fun floodFill(image: Array<IntArray>, sr: Int, sc: Int, color: Int): Array<IntArray> {
    val colorToFill = image[sr][sc]
    tailrec fun dfs(r: Int, c: Int) {
        if (r !in image.indices || c !in image[0].indices || image[r][c] != colorToFill ||  image[r][c] == color) return

        image[r][c] = color

        dfs(r - 1, c)
        dfs(r + 1, c)
        dfs(r, c - 1)
        dfs(r, c + 1)
    }

    if (colorToFill == color) return image

    dfs(sr, sc)

    return image
}