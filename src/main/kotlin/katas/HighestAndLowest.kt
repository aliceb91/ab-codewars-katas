package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        return numbers.split(" ")
            .map {
                it.toInt()
            }
            .sorted()
            .reversed()
            .foldIndexed(mutableListOf(0, 0)) {index, acc, num ->
                if (index == 0) {
                    acc[0] = num
                    acc[1] = num
                } else {
                    acc[1] = num
                }
                acc
            }
            .joinToString(" ")
    }
}