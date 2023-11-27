package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Replaces all vowels in a string with exclamation marks.

class ReplaceAllVowelsWithExclamationMarksTest {

    @Test
    fun `replaces all vowels in Hello with exclamation marks`() {
        val underTest = ReplaceAllVowelsWithExclamationMarks()
        val expected: String = "H!ll!"
        val result: String = underTest.replace("Hello")
        assertEquals(expected, result)
    }

    @Test
    fun `replaces all the vowels in Goodbye with exclamation marks`() {
        val underTest = ReplaceAllVowelsWithExclamationMarks()
        val expected: String = "G!!dby!"
        val result: String = underTest.replace("Goodbye")
        assertEquals(expected, result)
    }
}