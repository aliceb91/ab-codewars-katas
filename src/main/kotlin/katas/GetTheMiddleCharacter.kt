package katas

import kotlin.math.ceil

class GetTheMiddleCharacter {

    fun getMiddle(word: String): String {
        if (word.length % 2 == 0) {
            val midway: Int = word.length / 2
            return word.substring(midway - 1..midway)
        } else {
            return word[(word.length / 2)].toString()
        }
    }
}