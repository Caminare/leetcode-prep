package org.example.problems.arrays

fun main() {
    val prices = listOf(
        7,6,4,3,1
    )

    val result = maxProfit(prices.toIntArray())

    println("Max profit is: $result")
}

fun maxProfit(prices: IntArray): Int {
    var minBuy = Int.MAX_VALUE
    var maxProfit = 0

    for (price in prices) {
        if (price < minBuy) {
            minBuy = price
        } else {
            maxProfit = maxProfit.coerceAtLeast(price - minBuy)
        }
    }

    return maxProfit
}