package katas

class AlternateCapitalization {

    fun capitalize(text:String): List<String> {
        var index: Int = 0
        var upperFirst: String = ""
        var lowerFirst: String = ""
        for (char in text) {
            if (index % 2 == 0) {
                upperFirst += char.uppercase()
                lowerFirst += char
            } else {
                upperFirst += char
                lowerFirst += char.uppercase()
            }
            index += 1
        }
        return listOf(upperFirst, lowerFirst)
    }
}