package katas

class AdventOfCode2015Day2 {

    fun wrappingPaperCalc(str: String): Map<String, Int> {
        var sum: Int = 0
        var ribbon: Int = 0
        val splitBoxes: List<String> = str.split("\n")
        splitBoxes.forEach {
            val measurement: List<String> = it.split("x")
            val intList: List<Int> = measurement.map {
                it.toInt()
            }
            val length: Int = intList[0]
            val width: Int = intList[1]
            val height: Int = intList[2]
            val ordered: List<Int> = intList.sorted()
            val smallest: Int = ordered[0] * ordered[1]
            ribbon += (ordered[0] * 2 + ordered[1] * 2) + (length * width * height)
            sum += (2 * length * width) + (2 * width * height) + (2 * height * length) + smallest
        }
        return mapOf("paper" to sum, "ribbon" to ribbon)
    }
}