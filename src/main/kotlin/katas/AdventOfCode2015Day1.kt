package katas

class AdventOfCode2015Day1 {

    fun whatFloor(instructions: String): Map<String, Int?> {
        val instructionArr: CharArray = instructions.toCharArray()
        var total: Int = 0
        var downstairsAt: Int? = null
        var progress: Int = 1
        instructionArr.forEach {
            if (it == '(') {
                total += 1
            } else if (it == ')') {
                total -= 1
            }
            if (total < 0 && downstairsAt == null) {
                downstairsAt = progress
            }
            progress += 1
        }
        return mapOf("endpoint" to total, "basementEntry" to downstairsAt)
    }
}