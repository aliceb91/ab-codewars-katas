package katas

class RomanNumeralsEncoder {

    fun encode(num: Int): String {
        val digits: List<String> = listOf("I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX")
        val tens: List<String> = listOf("X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC")
        val hundreds: List<String> = listOf("C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM")
        val thousands: List<String> = listOf("M", "MM", "MMM")
        var numeral: String = ""
        num.toString()
            .toList()
            .reversed()
            .map {
                it.toString().toInt()
            }
            .forEachIndexed {index, dig ->
                if (dig == 0) {
                    numeral += ""
                } else if (index == 0) {
                    numeral += digits[dig - 1]
                } else if (index == 1) {
                    numeral = tens[dig - 1] + numeral
                } else if (index == 2) {
                    numeral = hundreds[dig - 1] + numeral
                } else if (index == 3) {
                    numeral = thousands[dig-1] + numeral
                }
            }
        return numeral
    }
}