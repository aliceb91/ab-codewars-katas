package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// You are going to be given a word.
// Your job is to return the middle character of the word.
// If the word's length is odd, return the middle character.
// If the word's length is even, return the middle 2 characters.

class GetTheMiddleCharacterTest {

    @Test
    fun `given the string a, it returns a`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "a"
        val result: String = underTest.getMiddle("a")
        assertEquals(expected, result)
    }

    @Test
    fun `given the string b, it returns b`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "b"
        val result: String = underTest.getMiddle("b")
        assertEquals(expected, result)
    }

    @Test
    fun `given any single character string, it returns that character`() {
        val underTest = GetTheMiddleCharacter()
        val expected1: String = "c"
        val expected2: String = "d"
        val result1: String = underTest.getMiddle("c")
        val result2: String = underTest.getMiddle("d")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given abc, it returns b`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "b"
        val result: String = underTest.getMiddle("abc")
        assertEquals(expected, result)
    }

    @Test
    fun `given def, it returns e`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "e"
        val result: String = underTest.getMiddle("def")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple three letter strings, it returns the middle character`() {
        val underTest = GetTheMiddleCharacter()
        val expected1: String = "h"
        val expected2: String = "k"
        val result1: String = underTest.getMiddle("ghi")
        val result2: String = underTest.getMiddle("jkl")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given abcde it returns c`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "c"
        val result: String = underTest.getMiddle("abcde")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple longer odd strings, it returns the middle character`() {
        val underTest = GetTheMiddleCharacter()
        val expected1: String = "h"
        val expected2: String = "n"
        val result1: String = underTest.getMiddle("fghij")
        val result2: String = underTest.getMiddle("klmnopq")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given ab, it returns ab`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "ab"
        val result: String = underTest.getMiddle("ab")
        assertEquals(expected, result)
    }

    @Test
    fun `given cd, it returns cd`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "cd"
        val result: String = underTest.getMiddle("cd")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple 2 letter strings, it returns them back`() {
        val underTest = GetTheMiddleCharacter()
        val expected1: String = "ef"
        val expected2: String = "gh"
        val result1: String = underTest.getMiddle("ef")
        val result2: String = underTest.getMiddle("gh")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given abcd, it returns bc`() {
        val underTest = GetTheMiddleCharacter()
        val expected: String = "bc"
        val result: String = underTest.getMiddle("abcd")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple even number strings, it returns their middle 2 values`() {
        val underTest = GetTheMiddleCharacter()
        val expected1: String = "gh"
        val expected2: String = "no"
        val result1: String = underTest.getMiddle("efghij")
        val result2: String = underTest.getMiddle("klmnopqr")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }
}