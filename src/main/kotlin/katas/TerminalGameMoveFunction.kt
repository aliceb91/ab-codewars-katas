package katas

class TerminalGameMoveFunction {

    fun move(pos: Int, roll: Int): Int {
        return pos + roll * 2
    }
}