package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

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

class GrowthOfAPopulationTest {

    @Test
    fun `given the first provided example as arguments, it returns 15`() {
        val underTest = GrowthOfAPopulation()
        val expected = 15
        val result = underTest.nbYear(1500, 5.0, 100, 5000)
        assertEquals(expected, result)
    }

    @Test
    fun `given the second provided example as arguments, its returns 10`() {
        val underTest = GrowthOfAPopulation()
        val expected = 10
        val result = underTest.nbYear(1500000, 2.5, 10000, 2000000)
        assertEquals(expected, result)
    }

    @Test
    fun `given multiple sets of arguments, it returns correct values for all of them`() {
        val underTest = GrowthOfAPopulation()
        val expected1 = 3
        val expected2 = 13
        val result1 = underTest.nbYear(1600, 6.0, 50, 2000)
        val result2 = underTest.nbYear(2000, 8.0, 80, 7000)
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `returns 0 when no growth is necessary to meet p value`() {
        val underTest = GrowthOfAPopulation()
        val expected = 0
        val result = underTest.nbYear(1000, 1.0, 10, 999)
        assertEquals(expected, result)
    }
}