package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// In this kata you will be given a random string of letters.
// You will then be tasked with returning them as a string of comma-separated sequences, sorted alphabetically.
// Each sequence should start with an uppercase character followed by n-1 lowercase characters.
// n is equal to the letters alphabet position 1-26

// Technical Details:
// The string will include only letters.
// The first letter of each sequence is uppercase followed by n-1 lowercase.
// Each sequence is separated with a comma.
// Return value needs to be a string.

class AlphabeticalSequenceTest {

    @Test
    fun `given a string of a, it returns A`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "A"
        val result: String = underTest.alphaSeq("a")
        assertEquals(expected, result)
    }

    @Test
    fun `given a string of b, it returns Bb`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "Bb"
        val result: String = underTest.alphaSeq("b")
        assertEquals(expected, result)
    }

    @Test
    fun `given a single character, it returns that character with the appropriate subsequent characters`() {
        val underTest = AlphabeticalSequence()
        val expected1: String = "Ccc"
        val expected2: String = "Dddd"
        val result1: String = underTest.alphaSeq("c")
        val result2: String = underTest.alphaSeq("d")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given multiple characters, it returns the appropriate string`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "A,Bb,Ccc,Dddd,Eeeee"
        val result: String = underTest.alphaSeq("abcde")
        assertEquals(expected, result)
    }

    @Test
    fun `given a string with repeating characters it returns the appropriate string`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "Bb,Bb,Bb"
        val result: String = underTest.alphaSeq("bbb")
        assertEquals(expected, result)
    }

    @Test
    fun `given a string of upper and lower case characters it returns the appropriate string`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "Ccc,Dddd,Eeeee,Ffffff"
        val result: String = underTest.alphaSeq("CdEf")
        assertEquals(expected, result)
    }

    @Test
    fun `given a string that is not in alphabetical order, it returns the appropriate string`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "Bb,Ccc,Dddd,Eeeee,Ffffff"
        val result: String = underTest.alphaSeq("dbcfe")
        assertEquals(expected, result)
    }

    @Test
    fun `given a random string, it returns the approriate string`() {
        val underTest = AlphabeticalSequence()
        val expected: String = "Dddd,Ggggggg,Ggggggg,Kkkkkkkkkkk,Ooooooooooooooo,Zzzzzzzzzzzzzzzzzzzzzzzzzz"
        val result: String = underTest.alphaSeq("ZKgGdo")
        assertEquals(expected, result)
    }
}