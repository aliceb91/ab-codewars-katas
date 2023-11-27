package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Return the number (count) of vowels in the given string.
// We will consider a, e, i, o, u as vowels for this Kata (but not y).
// The input string will only consist of lower case letters and/or spaces.

class VowelCountTest {

    @Test
    fun `it counts a single vowel in a single vowel string`() {
        val underTest = VowelCount()
        val expected: Int = 1
        val result: Int = underTest.getCount("a")
        assertEquals(expected, result)
    }

    @Test
    fun `it counts 5 in a string containing all 5 vowels`() {
        val underTest = VowelCount()
        val expected: Int = 5
        val result: Int =  underTest.getCount("aeiou")
        assertEquals(expected, result)
    }

    @Test
    fun `it counts the correct number of vowels in variable strings`() {
        val underTest = VowelCount()
        val expected1: Int = 2
        val expected2: Int = 3
        val result1: Int = underTest.getCount("hello")
        val result2: Int = underTest.getCount("goodbye")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it counts the correct number of vowels in a full sentence`() {
        val underTest = VowelCount()
        val expected: Int = 8
        val result: Int = underTest.getCount("i am testing using kotlin")
        assertEquals(expected, result)
    }

    @Test
    fun `it counts 0 when given an empty string`() {
        val underTest = VowelCount()
        val expected: Int = 0
        val result: Int = underTest.getCount("")
        assertEquals(expected, result)
    }
}