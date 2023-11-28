package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Given a string, capitalize the letters that occupy even indexes and odd indexes separately.
// Then return them as shown below.
// Index 0 will be considered even.

// For example,
// capitalize("abcdef") = ['AbCdEf', 'aBcDeF'].

// The input will be a lowercase string with no spaces.

class AlternateCapitalizationTest {

    @Test
    fun `given a, it returns a list of A, a`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("A", "a")
        val result: List<String> = underTest.capitalize("a")
        assertEquals(expected, result)
    }

    @Test
    fun `given ab, it returns a list of Ab, aB`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("Ab", "aB")
        val result: List<String> = underTest.capitalize("ab")
        assertEquals(expected, result)
    }
}