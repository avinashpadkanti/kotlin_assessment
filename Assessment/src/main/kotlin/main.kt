fun main(args: Array<String>) {

    println("Total price is: $"+calculateTotal(args))
}

fun calculateTotal(args: Array<String>): Double {
    val pricesMap = mutableMapOf("apple" to 0.60, "orange" to 0.25)
    var total : Double  = 0.0
    for (productName in args)
        total += pricesMap.get("${productName.toLowerCase().trim()}")!!

    return total
}