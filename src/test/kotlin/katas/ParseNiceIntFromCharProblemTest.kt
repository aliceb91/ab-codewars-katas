package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class ParseNiceIntFromCharProblemTest {

    @Test
    fun `returns the first character of the given string as an integer`() {
        val underTest = ParseNiceIntFromCharProblem()
        val expected: Int = 4
        val result: Int = underTest.getAge("4 years old")
        assertEquals(expected, result)
    }

}