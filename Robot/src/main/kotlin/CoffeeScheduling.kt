class CoffeeScheduling {
    fun makeCoffee() {
        println("Are you want to make Coffee?\nSelect No\nYes=1\nNo=0")
        print("Enter selected no here:")
        val a = readLine() ?: ""
        when (a.toInt()) {
            1 -> {
                println("How do you like your coffee (Black/With Milk.")
                println("Select No\n1-Black Coffee with Milk\n2-Black Coffee without Milk")
                print("Enter selected coffee no:")
                val coffeeNo = readLine() ?: ""
                when (coffeeNo.toInt()) {
                    1 -> {
                        println("How much SUGAR you'll take.")
                        print("Please enter spoon quantity here in no:")
                        val spoonQuantity = readLine() ?: ""
                        val quantity = spoonQuantity.toInt()
                        println("Your Coffee is ready...")
                        println("You added $quantity spoon sugar with Black Coffee with milk.\nThank you for using our Coffee Service.")

                    }

                    0 -> {
                        println("How much SUGAR you'll take.")
                        print("Please enter spoon quantity here in no:")
                        val spoonQuantity = readLine() ?: ""
                        val quantity = spoonQuantity.toInt()
                        println("Your Coffee is ready...")
                        println("You added $quantity spoon sugar with Black Coffee without milk.\nThank you for using our Coffee Service.")


                    }
                }

            }

            0 -> {
                println("Thank you so much for using our Coffee Service.")

            }
        }


    }
}
