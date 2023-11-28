package katas

class AlphabeticalSequence {

    fun alphaSeq(str: String): String {
        val lowerCaseString: String = str.lowercase()
        val charArr: CharArray = lowerCaseString.toCharArray()
        val sortedList: List<Char> = charArr.sorted()
        return sortedList.joinToString(",") {
            "$it".uppercase() + "$it".repeat(it - 'a')
        }
    }
}