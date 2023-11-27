package katas

class ReplaceAllVowelsWithExclamationMarks {

    fun replace(s: String): String {
        var sentence = s
        val vowels = "AEIOU"
        for (char in vowels) {
            sentence = sentence.replace(char, '!', true)
        }
        return sentence
    }
}