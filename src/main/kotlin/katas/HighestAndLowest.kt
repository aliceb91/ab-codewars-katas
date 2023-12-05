package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        val sorted: List<Int> = numbers.split(" ")
            .map {
                it.toInt()
            }
            .sorted()

        return "${sorted.last()} ${sorted.first()}"
    }
}