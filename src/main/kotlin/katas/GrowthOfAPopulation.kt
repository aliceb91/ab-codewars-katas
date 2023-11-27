package katas

class GrowthOfAPopulation {

    fun nbYear(pp0: Int, percent: Double, aug: Int, p: Int): Int {
        var total: Double = pp0.toDouble()
        val percentage: Double = percent / 100
        var counter: Int = 0
        while (total < p) {
            counter += 1
            val num: Double = total + total * percentage + aug
            total = num
        }
        return counter
    }
}