package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

// A man has a rather old care being worth $2000.
// He saw a secondhand car being worth $8000.
// He wants to keep his old car until he can buy the secondhand one.

// He thinks he can save $1000 each month.
// However, the price of both his old and new care decrease 1.5 percent per month.
// Furthermore, this percent of loss increases by 0.5 percent at the end of every two months.
// Out man finds it difficult to make all these calculations.
// Can you help him?

class BuyingACarTest {

    @Test
    fun `given a matching and end price, it returns 1, 0`() {
        val underTest = BuyingACar()
        val expected: Pair<Int, Int> = Pair(0, 0)
        val result1: Pair<Int, Int> = underTest.nbMonths(
            1, 1, 0, 0.0
        )
        val result2: Pair<Int, Int> = underTest.nbMonths(
            2, 2, 0, 0.0
        )
        assertEquals(expected, result1)
        assertEquals(expected, result2)
    }

    @Test
    fun `given a start of 2, an end of 4 and savings of 1, it returns 2, 0`() {
        val underTest = BuyingACar()
        val expected: Pair<Int, Int> = Pair(2, 0)
        val result: Pair<Int, Int> = underTest.nbMonths(
            2, 4, 1, 0.0
        )
        assertEquals(expected, result)
    }

    @Test
    fun `given higher total money than the cost of the new car, it returns the excess in the pari`() {
        val underTest = BuyingACar()
        val expected: Pair<Int, Int> = Pair(2, 1)
        val result: Pair<Int, Int> = underTest.nbMonths(
            2,5,2,0.0
        )
        assertEquals(expected, result)
    }

    @Test
    fun `given a percentage decrease, it considers this in its calculation`() {
        val underTest = BuyingACar()
        val expected: Pair<Int, Int> = Pair(1, 0)
        val result: Pair<Int, Int> = underTest.nbMonths(
            2, 4, 1, 50.0
        )
        assertEquals(expected, result)
    }

    @Test
    fun `given a full suite of data, it returns the correct pair`() {
        val underTest = BuyingACar()
        val expected1: Pair<Int, Int> = Pair(6, 766)
        val expected2: Pair<Int, Int> = Pair(8, 597)
        val result1: Pair<Int, Int> = underTest.nbMonths(
            2000, 8000, 1000, 1.5
        )
        val result2: Pair<Int, Int> = underTest.nbMonths(
            8000, 12000, 500, 1.0
        )
        assertEquals(expected1, result1)
        assertEquals(expected2, result2)
    }

    @Test
    fun `more test data due to issue on codewars`() {
        val underTest = BuyingACar()
        val expected: Pair<Int, Int> = Pair(25, 122)
        val result: Pair<Int, Int> = underTest.nbMonths(
            7500, 32000, 300, 1.55
        )
        assertEquals(expected, result)
    }
}