package katas

class BuyingACar {

    fun nbMonths(
        startPriceOld: Int,
        startPriceNew: Int,
        savingPerMonth: Int,
        percentLossByMonth: Double
    ): Pair<Int, Int> {
        var adjustedOldPrice: Double = startPriceOld.toDouble()
        var adjustedNewPrice: Double = startPriceNew.toDouble()
        var adjustedLoss: Double = percentLossByMonth
        var months: Int = 0
        var savings: Double = 0.0
        if (adjustedOldPrice >= adjustedNewPrice) {
            return Pair(0, (adjustedOldPrice - adjustedNewPrice).toInt())
        }
        while (savings + adjustedOldPrice < adjustedNewPrice) {
            savings += savingPerMonth.toDouble()
            months += 1
            if (months % 2 == 0) {
                adjustedLoss += 0.5
            }
            if (percentLossByMonth > 0.0) {
                    adjustedOldPrice -= adjustedOldPrice / 100 * adjustedLoss
                    adjustedNewPrice -= adjustedNewPrice / 100 * adjustedLoss
                }
        }
        return Pair(
            months,
            Math.round(savings + adjustedOldPrice - adjustedNewPrice).toInt()
        )
    }
}