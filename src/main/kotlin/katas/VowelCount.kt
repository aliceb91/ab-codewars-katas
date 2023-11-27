package katas

class VowelCount {

    fun getCount(str: String): Int {

        return str.count {it in "aeiou"}
    }
}