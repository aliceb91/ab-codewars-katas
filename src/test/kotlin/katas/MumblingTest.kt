package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Returns the letters in a string as many times as those letters are present

class MumblingTest {

    @Test
    fun `returns a single letter in an amount equal the position in the alphabet`() {
        val underTest = Mumbling()
        val expected1: String = "A"
        val expected2: String = "B"
        val result1: String = underTest.accum("A")
        val result2: String = underTest.accum("B")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `returns the correct letters and values for multiple letters in a string`() {
        val underTest = Mumbling()
        val expected1: String = "A-Bb-Ccc-Dddd-Eeeee"
        val expected2: String = "J-Ii-Hhh-Gggg-Fffff"
        val result1: String = underTest.accum("abcDe")
        val result2: String = underTest.accum("JiHGf")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `solves Codewars test data`() {
        val underTest = Mumbling()
        val expected1: String = "Z-Pp-Ggg-Llll-Nnnnn-Rrrrrr-Xxxxxxx-Qqqqqqqq-Eeeeeeeee-Nnnnnnnnnn-Uuuuuuuuuuu"
        val expected2: String = "N-Yy-Fff-Ffff-Sssss-Gggggg-Eeeeeee-Yyyyyyyy-Yyyyyyyyy-Llllllllll-Bbbbbbbbbbb"
        val result1: String = underTest.accum("ZpglnRxqenU")
        val result2: String = underTest.accum("NyffsGeyylB")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }
}