package katas

import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

class TerminalGameMoveFunctionTest {

    @Test
    fun `it returns the position value added to the move value * 2`() {
        val underTest = TerminalGameMoveFunction()
        val expected: Int =  15
        val result: Int =  underTest.move(3, 6)
        assertEquals(expected, result)
    }

    @Test
    fun `it returns the correct value with different values`() {
        val underTest = TerminalGameMoveFunction()
        val expected: Int = 17
        val result: Int = underTest.move(5, 6)
        assertEquals(expected, result)
    }
}