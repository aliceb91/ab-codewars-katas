package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// Create a function taking a positive integer between 1 and 3999 as its parameter.
// Return a string containing the Roman Numeral representation of that integer.

// Modern Roman numbers are written by expressing each digit separately.
// This starts with the left most digit and skipping any digit with a value of zero.
// In roman numerals, 1990 is rendered: 100 = M, 900 = CM, 90 = XC, resulting in MCMXC.
// 2008 is written as 2000 = MM, 8 = VIII, or MMVIII.
// 1666 uses each Roman symbol in descending order, MDCLXVI

// Remember that there can't be more than 3 identical symbols in a row.

class RomanNumeralsEncoderTest {

    @Test
    fun `given 1, it returns I`() {
        val underTest = RomanNumeralsEncoder()
        val expected: String = "I"
        val result: String = underTest.encode(1)
        assertEquals(expected, result)
    }

    @Test
    fun `given digits below 4, it returns that many Is`() {
        val underTest = RomanNumeralsEncoder()
        val expected1: String = "II"
        val expected2: String = "III"
        val result1: String = underTest.encode(2)
        val result2: String = underTest.encode(3)
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given 5, it returns V`() {
        val underTest = RomanNumeralsEncoder()
        val expected: String = "V"
        val result: String = underTest.encode(5)
        assertEquals(expected, result)
    }

    @Test
    fun `given numbers surrounding 5, it returns the relevant numerals`() {
        val underTest = RomanNumeralsEncoder()
        val expected1: String = "IV"
        val expected2: String = "VI"
        val expected3: String = "VII"
        val expected4: String = "VIII"
        val result1: String = underTest.encode(4)
        val result2: String = underTest.encode(6)
        val result3: String = underTest.encode(7)
        val result4: String = underTest.encode(8)
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
        assertEquals(expected3, result3)
        assertEquals(expected4, result4)
    }

    @Test
    fun `given a range of numbers of varying lengths, it returns the correct roman numeral`() {
        val underTest = RomanNumeralsEncoder()
        val expected1: String = "XXXIV"
        val expected2: String = "DCCCLXXII"
        val expected3: String = "MMMCCLXVII"
        val expected4: String = "MMI"
        val result1: String = underTest.encode(34)
        val result2: String = underTest.encode(872)
        val result3: String = underTest.encode(3267)
        val result4: String = underTest.encode(2001)
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
        assertEquals(expected3, result3)
        assertEquals(expected4, result4)
    }
}