package katas

class ParseNiceIntFromCharProblem {

    fun getAge(yearsOld: String): Int {

        return yearsOld.first().digitToInt()
    }

}