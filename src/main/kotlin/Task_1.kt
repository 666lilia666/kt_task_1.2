fun main() {
    val currency = "руб."
    val amount = 10_152
    val commission = 0.75
    val minCommission = 35
    val sumCommission = (amount * commission) / 100
    val transferCommission = if (sumCommission > minCommission) sumCommission else minCommission
    println("Сумма комиссии $transferCommission $currency")
}