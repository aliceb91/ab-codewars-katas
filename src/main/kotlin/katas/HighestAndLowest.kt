package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        return numbers.split(" ")
            .map {
                it.toInt()
            }
            .sorted()
            .let {
                "${it.last()} ${it.first()}"
            }
    }
}