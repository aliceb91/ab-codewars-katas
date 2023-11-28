package katas

import kotlin.math.floor

class GrowthOfAPopulation2 {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        val decimal: Double = percent / 100
        val sequence = generateSequence(pp0.toDouble()) { floor(it + it * decimal + aug) }.takeWhile {it < p}
        return sequence.count()
    }
}