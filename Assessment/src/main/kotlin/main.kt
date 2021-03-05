fun main(args: Array<String>) {

    println("Total price is: $"+"%.2f".format(calculateTotal(args)))
}

fun calculateTotal(args: Array<String>): Double {
    return calculateTotalWithOffers(calculateCartCount(args))
}

fun calculateCartCount(args: Array<String>): MutableMap<String, Int> {
    val finalCart = mutableMapOf("apple" to 0, "orange" to 0)
    for (productName in args) {
        var tempProductName = productName.toLowerCase().trim()
        finalCart.get(tempProductName)?.plus(1)?.let { finalCart.put(tempProductName, it) }
    }
    return finalCart
}

fun calculateTotalWithOffers(cartItems: MutableMap<String, Int>) : Double{

    var applePrice = 0.60;
    var orangePrice = 0.25;

    var appleCount = cartItems.get("apple")
    var orangeCount = cartItems.get("orange")

    var appleCost : Double = appleCount?.times(.5)?.times(applePrice) ?: 0.0
    var orangeCost : Double = orangeCount?.times(0.6666666666666667)?.times(orangePrice) ?: 0.0

    return appleCost+orangeCost;

}