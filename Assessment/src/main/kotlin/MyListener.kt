class MyListener {

    fun setOrderListener(total: Double){
        if(total == 0.0){
            println("Sorry!! Your order failed due to out of stock")
        }else{
            println("Total price is: $"+"%.2f".format(total))
            println("Your order received and will be delivered in 2 working days")
        }
     }
}