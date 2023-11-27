package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

//  All the animals are having a feast!
//  Each animal is bringing one dish.
//  There is just one rule: the dish must start and end with the same letters as the animal's name.
//  For example, the great blue heron is bringing garlic naan and the chickadee is bringing chocolate cake.

//  Write a function "feast" that takes the animal's name and dish as arguments.
//  It should return true or false to indicate weather the beast is allowed to bring the dish to the feast.

//  Assume that "beast" and "dish" are always lowercase strings, and that each has at least two letters.
//  "beast" and "dish" may contain hyphens and spaces, but these will not appear at the beginning or end of the string.
//  They will not contain numerals.

class TheFeastOfManyBeastsTest {

    @Test
    fun `it returns true when snake brings a sponge cake`() {
        val underTest = TheFeastOfManyBeasts()
        val expected: Boolean = true
        val result: Boolean = underTest.feast("snake", "sponge cake")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns true when badger brings a burger`() {
        val underTest = TheFeastOfManyBeasts()
        val expected: Boolean = true
        val result: Boolean = underTest.feast("badger", "burger")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns false when cat brings treacle`() {
        val underTest = TheFeastOfManyBeasts()
        val expected: Boolean = false
        val result: Boolean = underTest.feast("cat", "treacle")
        assertEquals(expected, result)
    }

    @Test
    fun `it returns false when dog bring steak`() {
        val underTest = TheFeastOfManyBeasts()
        val expected: Boolean = false
        val result: Boolean = underTest.feast("dog", "steak")
        assertEquals(expected, result)
    }
}