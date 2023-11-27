package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        val sortedList = numbers.split(" ").map {it.toInt()}.sorted()

        return "${sortedList.last()} ${sortedList.first()}"
    }
}