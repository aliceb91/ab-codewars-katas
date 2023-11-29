package katas

import kotlin.math.floor

class GrowthOfAPopulation2 {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {

        if ((percent == 0.0 && aug == 0) || (pp0 == 0 && aug == 0)) {
            throw IllegalArgumentException("Your population will never increase.")
        }

        val decimal: Double = percent / 100
        val sequence = generateSequence(pp0.toDouble()) { floor(it + it * decimal + aug) }.takeWhile {it < p}
        return sequence.count()
    }
}