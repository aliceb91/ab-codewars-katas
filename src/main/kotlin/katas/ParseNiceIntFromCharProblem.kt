package katas

// Returns the first character of the string as an integer.

class ParseNiceIntFromCharProblem {

    fun getAge(yearsOld: String): Int {

        val age = yearsOld.first()
        return age.digitToInt()

    }

}