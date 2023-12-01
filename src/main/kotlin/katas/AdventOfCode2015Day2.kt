package katas

class AdventOfCode2015Day2 {

    fun wrappingPaperCalc(str: String): Int {
        var counter: Int = 0
        val splitBoxes: List<String> = str.split("\n")
        splitBoxes.forEach {
            val measurement: List<String> = it.split("x")
            val intMes: List<Int> = measurement.map {
                it.toInt()
            }
            val small: Int = intMes.sorted()[0] * intMes.sorted()[1]
            counter += 2 * intMes[0] * intMes[1] + 2 * intMes[1] * intMes[2] +2 * intMes[2] * intMes[0] + small
        }
        return counter
    }
}