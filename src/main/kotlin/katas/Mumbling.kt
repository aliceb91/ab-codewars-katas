package katas

class Mumbling {

    fun accum(s: String): String {
        return s
            .toCharArray()
            .mapIndexed {index, it ->
                it.uppercase() + it.toString().repeat(index).lowercase()
            }
            .joinToString("-")
    }
}