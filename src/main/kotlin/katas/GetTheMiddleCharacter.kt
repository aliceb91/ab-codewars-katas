package katas

import kotlin.math.ceil

class GetTheMiddleCharacter {

    fun getMiddle(word: String): String {

        return word.substring((word.length - 1) / 2, word.length / 2 + 1)
    }
}