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
    fun `given b it returns a list of B, b`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("B", "b")
        val result: List<String> = underTest.capitalize("b")
        assertEquals(expected, result)
    }

    @Test
    fun `given any letter, it returns a list of LETTER, letter`() {
        val underTest = AlternateCapitalization()
        val expected1: List<String> = listOf("C", "c")
        val expected2: List<String> = listOf("D", "d")
        val result1: List<String> = underTest.capitalize("c")
        val result2: List<String> = underTest.capitalize("d")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given ab, it returns a list of Ab, aB`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("Ab", "aB")
        val result: List<String> = underTest.capitalize("ab")
        assertEquals(expected, result)
    }

    @Test
    fun `given abc, it returns a list of AbC, aBc`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("AbC", "aBc")
        val result: List<String> = underTest.capitalize("abc")
        assertEquals(expected, result)
    }

    @Test
    fun `given the string of abracadabra it returns the correct capitalisation`() {
        val underTest = AlternateCapitalization()
        val expected: List<String> = listOf("AbRaCaDaBrA", "aBrAcAdAbRa")
        val result: List<String> = underTest.capitalize("abracadabra")
        assertEquals(expected,result)
    }
}