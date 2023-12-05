package katas

class ReplaceAllVowelsWithExclamationMarks {

    fun replace(s: String): String {

        return s.toCharArray()
            .map {
                if (it.uppercase() in "AEIOU") {
                    "!"
                } else {
                    it.toString()
                }
            }
            .joinToString("")
    }
}