fun main() {
    val musicLovers = true
    val shopAmount = 13_000
    val standardDiscount = 100
    val discountStageOneMinValue = 1_001
    val discountStageOneMaxValue = 10_000
    val discountStageTwoValue = 10_001
    val whoNou = (shopAmount * 5) / 100
    val discount = if (discountStageOneMinValue <= shopAmount && shopAmount <= discountStageOneMaxValue)
        shopAmount - standardDiscount else if (shopAmount >= discountStageTwoValue) whoNou else shopAmount
    var result = shopAmount - discount
    if (musicLovers) result -= (result * 1) / 100
    println(result)
}