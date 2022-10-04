fun main (){
    val currency = "руб."
    val amount = 10_152
    val commission = 0.75
    val minCommission = 35
    val sumCommission = (amount * commission) / 100
    val transferCommission = if (sumCommission > minCommission) {
        println("Сумма комиссии $sumCommission $currency")} else { println("Сумма комиссии $minCommission $currency") }

}