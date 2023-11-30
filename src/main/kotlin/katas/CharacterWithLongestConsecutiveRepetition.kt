package katas

class CharacterWithLongestConsecutiveRepetition {

    fun longestRepetition(s: String): Pair<Char?, Int> {
        var counter: Int = 0
        var highestChar: Char? = null
        var highestCount: Int = 0
        s.forEachIndexed {index, char ->
            if (index == 0) {
                highestChar = char
                highestCount += 1
                counter += 1
            } else if (char == s[index -1]) {
                counter += 1
            } else {
                counter = 1
            }
            if (counter > highestCount) {
                highestCount += 1
                highestChar = char
            }
        }
        return Pair(highestChar, highestCount)
    }
}