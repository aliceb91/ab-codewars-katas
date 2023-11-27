package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// In this little assignment you are given a string of space seperated numbers.
// You will need to return the highest and lowest of these numbers.

// Examples:
// highAndLow("1 2 3 4 5") returns "5 1"
// highAndLow("1 2 -3 4 5") returns "5 -3"
// highAndLow("1 9 3 4 -5") returns "9 -5"

// Notes:
// - All numbers are valid Int32, no need to validate them.
// - There will always be at least one number in the input string.
// - Output string must be two numbers separated by a single space, and highest number is first.

class HighestAndLowestTest {

    @Test
    fun `it returns 5 and 1 when given 1 2 3 4 5`() {
        val underTest = HighestAndLowest()
        val expected: String = "5 1"
        val result: String = underTest.highAndLow("1 2 3 4 5")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns 6 and 2 when given 2 3 4 5 6`() {
        val underTest = HighestAndLowest()
        val expected: String = "6 2"
        val result: String = underTest.highAndLow("2 3 4 5 6")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the highest and lowest values when given multiple valid strings`() {
        val underTest = HighestAndLowest()
        val expected1: String = "8 0"
        val expected2: String = "9 3"
        val result1: String = underTest.highAndLow("0 3 2 8 4")
        val result2: String = underTest.highAndLow("9 4 3 6 7")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `it returns the highest and lowest values from a string of negative numbers`() {
        val underTest = HighestAndLowest()
        val expected: String = "-1 -7"
        val result: String = underTest.highAndLow("-1 -7 -4 -3 -6")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the highest and lowest values from a mix of positive and negative numbers`() {
        val underTest = HighestAndLowest()
        val expected: String = "9 -3"
        val result: String = underTest.highAndLow("4 -3 5 9 -2")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the highest and lowest values when numbers have more than 1 digit`() {
        val underTest = HighestAndLowest()
        val expected: String = "123 -42"
        val result: String = underTest.highAndLow("1 123 -42 4 -5")
        assertEquals(expected, result)
    }
}