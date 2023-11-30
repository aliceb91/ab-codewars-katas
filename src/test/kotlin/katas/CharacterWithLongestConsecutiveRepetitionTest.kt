package katas


import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// For a given string s, find the character c with the longest consecutive repetition and reutrn:

// Pair(c, l)

// where l is the length of the repetition.
// If there are two or more characters with the same l, return the first in order of appearance.

// For an empty string return:

// Pair(null, 0)

class CharacterWithLongestConsecutiveRepetitionTest {

    @Test
    fun `given an empty string, it returns (null, 0)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair(null, 0)
        val result: Pair<Char?, Int> = underTest.longestRepetition("")
        assertEquals(expected, result)
    }

//    @Test
//    fun `given a string of a, it returns (a, 1)`() {
//        val underTest = CharacterWithLongestConsecutiveRepetition()
//        val expected: Pair<Char?, Int> = Pair('a', 1)
//        val result: Pair<Char?, Int> = underTest.longestRepetition("a")
//        assertEquals(expected, result)
//    }

//    @Test
//    fun `given a string of b, it returns (b, 1)`() {
//        val underTest = CharacterWithLongestConsecutiveRepetition()
//        val expected: Pair<Char?, Int> = Pair('b', 1)
//        val result: Pair<Char?, Int> = underTest.longestRepetition("b")
//        assertEquals(expected, result)
//    }

    @Test
    fun `given multiple single character strings, it returns (character, 1)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('c', 1)
        val expected2: Pair<Char?, Int> = Pair('d', 1)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("c")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("d")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

//    @Test
//    fun `given aa, it returns (a, 2)`() {
//        val underTest = CharacterWithLongestConsecutiveRepetition()
//        val expected: Pair<Char?, Int> = Pair('a', 2)
//        val result: Pair<Char?, Int> = underTest.longestRepetition("aa")
//        assertEquals(expected, result)
//    }
//
//    @Test
//    fun `given aaa, it returns (a, 3)`() {
//        val underTest = CharacterWithLongestConsecutiveRepetition()
//        val expected: Pair<Char?, Int> = Pair('a', 3)
//        val result: Pair<Char?, Int> = underTest.longestRepetition("aaa")
//        assertEquals(expected, result)
//    }

    @Test
    fun `given multiple characters of a single letter, it returns (character, count)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('c', 4)
        val expected2: Pair<Char?, Int> = Pair('d', 5)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("cccc")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("ddddd")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given aab, it returns (a, 2)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair('a', 2)
        val result: Pair<Char?, Int> = underTest.longestRepetition("aab")
        assertEquals(expected, result)
    }

    @Test
    fun `given aaab, it returns (a, 3)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair('a', 3)
        val result: Pair<Char?, Int> = underTest.longestRepetition("aaab")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple lengths of a in a string, it returns (a, count)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('a', 4)
        val expected2: Pair<Char?, Int> = Pair('a', 5)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("aaaab")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("aaaaabb")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given baa, it returns (a, 2)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair('a', 2)
        val result: Pair<Char?, Int> = underTest.longestRepetition("baa")
        assertEquals(expected, result)
    }

    @Test
    fun `given baaa, it returns (a, 3)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair('a', 3)
        val result: Pair<Char?, Int> = underTest.longestRepetition("baaa")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple strings where a is the most common character but not the first, it returns (a, count)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('a', 4)
        val expected2: Pair<Char?, Int> = Pair('a', 5)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("baaaa")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("baaaaa")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given baab, it returns (a, 2)`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected: Pair<Char?, Int> = Pair('a', 2)
        val result: Pair<Char?, Int> = underTest.longestRepetition("baab")
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple examples of stirngs with consecutive letters, it returns the appropriate pairs`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('e', 6)
        val expected2: Pair<Char?, Int> = Pair('f', 7)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("heebbbeeeeeeuciiaa")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("pfffffffcccchhhhffajjjjww")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given multiple characters of the same consecutive frequency, it returns the first isntance`() {
        val underTest = CharacterWithLongestConsecutiveRepetition()
        val expected1: Pair<Char?, Int> = Pair('a', 2)
        val expected2: Pair<Char?, Int> = Pair('h', 3)
        val result1: Pair<Char?, Int> = underTest.longestRepetition("aabbccddeeffgg")
        val result2: Pair<Char?, Int> = underTest.longestRepetition("kllepoohhhttadejjjd")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }
}