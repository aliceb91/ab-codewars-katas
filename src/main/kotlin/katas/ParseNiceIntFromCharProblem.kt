package katas

class ParseNiceIntFromCharProblem {

    fun getAge(yearsOld: String): Int {

        val age = yearsOld.first()
        return age.digitToInt()

    }

}