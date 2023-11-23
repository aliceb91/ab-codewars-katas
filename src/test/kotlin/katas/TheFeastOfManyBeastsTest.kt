package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

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