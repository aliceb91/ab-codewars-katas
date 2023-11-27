package katas

class GrowthOfAPopulation2 {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        val sequence = generateSequence(pp0.toDouble()) {it + aug}.takeWhile {it < p}
        return sequence.count()
    }
}