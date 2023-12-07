package katas

data class WeightString(val string: String): Comparable<WeightString> {
    private val sum: Long =
        string
        .toCharArray()
        .sumOf { char ->
        char.toString().toLong()
    }

    override fun compareTo(weightString: WeightString): Int {
            return if (this.sum == weightString.sum) {
                this.string.compareTo(weightString.string)
            } else {
                this.sum.compareTo(weightString.sum)
            }
    }
}

class WeightForWeight {

    fun orderWeight(str: String): String {
        return str
            .split(" ")
            .map {
                WeightString(it)
            }
            .sorted()
            .joinToString(" ") {
                it.string
            }
    }

//    fun orderWeight(str: String): String {
//        if (str == "") {
//            return ""
//        }
//        val longList: List<Long> = str.split(" ")
//            .map { it.toLong() }
//        val splitList: List<List<Long>> = longList.map {
//            it.toString()
//                .toCharArray()
//                .map { char ->
//                    char.toString().toLong()
//                }
//        }
//        val comp = Comparator { a: List<Long>, b: List<Long> ->
//            if (a.sum() == b.sum()) {
//                a.joinToString("").compareTo(b.joinToString(""))
//            } else {
//                a.sum().compareTo(b.sum())
//            }
//        }
//        val sortedList = splitList.sortedWith(comp)
//        val fixedList = sortedList.map {
//            it.joinToString("")
//        }
//        return fixedList.joinToString(" ")
//    }
}