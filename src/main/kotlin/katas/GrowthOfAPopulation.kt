package katas

import kotlin.math.floor

class GrowthOfAPopulation {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        var total: Int = pp0
        val percentage: Double = percent / 100
        var counter: Int = 0
        while (total < p) {
            counter += 1
            val num: Double = total + total * percentage + aug
            total = num.toInt()
        }
        return counter
    }
}