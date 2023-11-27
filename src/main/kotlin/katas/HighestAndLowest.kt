package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        val numbersList: List<String> = numbers.split(" ")
        val intList: List<Int> = numbersList.map {it.toInt()}
        val sortedList: List<Int> = intList.sorted()

        return "${sortedList.last()} ${sortedList.first()}"
    }
}