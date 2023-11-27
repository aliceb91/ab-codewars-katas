package katas

class VowelCount {

    fun getCount(str: String): Int {

        val vowels: String = "aeiou"
        var counter: Int = 0

        for (char in str) {
            if (char.lowercaseChar() in vowels) {
                counter += 1
            }
        }

        return counter
    }
}