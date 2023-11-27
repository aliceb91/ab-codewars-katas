package katas

class HighestAndLowest {

    fun highAndLow(numbers: String): String {

        var highest: Int = Int.MIN_VALUE
        var lowest: Int = Int.MAX_VALUE

        val numberList = numbers.split(" ")
        for (number in numberList) {
            val intNum: Int = number.toInt()
            if (intNum > highest) {
                highest = intNum
            }
            if (intNum < lowest) {
                lowest = intNum
            }
        }

        return "$highest $lowest"
    }
}