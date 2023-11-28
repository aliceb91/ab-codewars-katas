package katas

class AlphabeticalSequence {

    fun alphaSeq(str: String): String {
        val lowerCaseString: String = str.lowercase()
        val alphabet: String = "abcdefghijklmnopqrstuvwxyz"
        val stringList: List<String> = lowerCaseString.split("").drop(1).dropLast(1)
        val sortedList: List<String> = stringList.sorted()
        val finalList: List<String> = sortedList.map {
            val charIndex = alphabet.indexOf(it)
            var newStr = it.uppercase()
            for (count in 1..charIndex) {
                newStr += it
        }
            newStr
        }
        return finalList.joinToString(",")
    }
}