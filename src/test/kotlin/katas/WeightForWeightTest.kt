package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// My friend John and I are members of the Fat to Fit Club (FCC).
// John is worried because each month a list with the weights of the members is published.
// Each month he is the last on the list which is the heaviest.

// I am the one who establishes the list, so I told him I would change the order.
// It was decided to attribute a weight to numbers.
// The weight of a number will be the sum of its digits.

// Given a string with the wrights of FCC members in normal order, present these in their weighted order.

class WeightForWeightTest {

    @Test
    fun `given a single number, it returns that integer`() {
        val underTest = WeightForWeight()
        val expected1: String = "1"
        val expected2: String = "2"
        val result1: String = underTest.orderWeight("1")
        val result2: String = underTest.orderWeight("2")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given two single digit numbers, it returns them in ascending order`() {
        val underTest = WeightForWeight()
        val expected1: String = "1 2"
        val expected2: String = "3 4"
        val result1: String = underTest.orderWeight("2 1")
        val result2: String = underTest.orderWeight("4 3")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `given two double digit numbers, it weights them appropriately`() {
        val underTest = WeightForWeight()
        val expected1: String = "55 66"
        val expected2: String = "77 88"
        val result1: String = underTest.orderWeight("66 55")
        val result2: String = underTest.orderWeight("88 77")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `codewars test input`() {
        val underTest = WeightForWeight()
        val expected1: String = "2000 103 123 4444 99"
        val expected2: String = "11 11 2000 10003 22 123 1234000 44444444 9999"
        val result1: String = underTest.orderWeight("103 123 4444 99 2000")
        val result2: String = underTest.orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123")
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `big int`() {
        val underTest = WeightForWeight()
        val expected: String = "59544965313"
        val result: String = underTest.orderWeight("59544965313")
        assertEquals(expected, result)
    }
}