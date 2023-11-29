package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Timeout
import kotlin.test.assertFailsWith

// In a small town the population is p0 = 1000 at the beginning of a year.
// The population regularly increases by 2 percent per year.
// Moreover, 50 new inhabitants per year come to live in the town.
// How many years does the town need to see its population greater than or equal to p=1200 inhabitants?

// At the end of the first year there will be:
// 1000 + 1000 * 0.02 + 50 => 1070 inhabitants

// At the end of the 2nd year there will be:
// 1070 + 1070 * 0.02 + 50 => 1141

// At the end of the 3rd year there will be:
// 1141 + 1141 * 0.02 + 50 => 1213

// It will need 3 entire years.

// More Generally given parameters:
// p0
// percent
// aug (inhabitants coming or leaving each year)
// p (population to equal or surpass)

// The function nbYear should return n number of entire years needed to get a population greater or equal to p.

// aud is an integer, percent a positive or null floating number, p0 and p are positive integers.

// Examples:
// nbYear(1500, 5, 100, 5000) -> 15
// nbYear(1500000, 2.5, 10000, 2000000) -> 10

class GrowthOfAPopulation2Test {


    @Test
    fun `when given a static population and target of 1000 are given, it returns 0`() {
        val underTest = GrowthOfAPopulation2()
        val expected: Int = 0
        val result: Int = underTest.nbYear(1000, 0.0, 0, 1000)
        assertEquals(expected, result)
    }

    @Test
    fun `when given a population of 1000 with a target of 1100 and an aug of 50 it returns 2`() {
        val underTest = GrowthOfAPopulation2()
        val expected: Int = 2
        val result: Int = underTest.nbYear(1000, 0.0, 50, 1100)
        assertEquals(expected, result)
    }

    @Test
    fun `when given a population of 1000 with a target of 1200 and an aug of 70 it returns 3`() {
        val underTest = GrowthOfAPopulation2()
        val expected: Int = 3
        val result: Int = underTest.nbYear(1000, 0.0, 70, 1200)
        assertEquals(expected,result)
    }

    @Test
    fun `when given a starting population, aug value and population target, it returns the appropriate result`() {
        val underTest = GrowthOfAPopulation2()
        val expected1: Int = 4
        val expected2: Int = 5
        val result1: Int = underTest.nbYear(900, 0.0, 30, 1000)
        val result2: Int = underTest.nbYear(1200, 0.0, 21, 1300)
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `when given an impossible value for percent and aug, it throws an error`() {
        val thrown = assertFailsWith<IllegalArgumentException>(
            message = "percent and aug of 0 did not throw an error.",
            block = {
                GrowthOfAPopulation2().nbYear(500, 0.0, 0, 700)
            }
        )
        assertEquals("Your population will never increase.", thrown.message)
    }

    @Test
    fun `when given an impossible value for pp0 and aug, it throws and error`() {
        val thrown = assertFailsWith<IllegalArgumentException>(
            message = "pp0 and aug of 0 did not throw an error.",
            block = {
                GrowthOfAPopulation2().nbYear(0, 5.0, 0, 700)
            }
        )
        assertEquals("Your population will never increase.", thrown.message)
    }

    @Test
    @Timeout(10)
    fun `when given a starting population of 500 and a percentage of 20 it takes 2 years to reach a target of 700`() {
        val underTest = GrowthOfAPopulation2()
        val expected: Int = 2
        val result: Int = underTest.nbYear(500, 20.0, 0, 700)
        assertEquals(expected, result)
    }

    @Test
    fun `when given a full set of arguments, it returns the correct number of years`() {
        val underTest = GrowthOfAPopulation2()
        val expected: Int = 4
        val result: Int = underTest.nbYear(500, 10.0, 10, 700)
        assertEquals(expected, result)
    }
}