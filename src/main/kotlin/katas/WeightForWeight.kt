package katas

class WeightForWeight {

    fun orderWeight(str: String): String {
        if (str == "") {
            return ""
        }
        val longList: List<Long> = str.split(" ")
            .map { it.toLong() }
        val splitList: List<List<Long>> = longList.map {
            it.toString()
                .toCharArray()
                .map { char ->
                    char.toString().toLong()
                }
        }
        val comp = Comparator { a: List<Long>, b: List<Long> ->
            if (a.sum() == b.sum()) {
                a.joinToString("").compareTo(b.joinToString(""))
            } else {
                a.sum().compareTo(b.sum())
            }
        }
        val sortedList = splitList.sortedWith(comp)
        val fixedList = sortedList.map {
            it.joinToString("")
        }
        return fixedList.joinToString(" ")
    }
}