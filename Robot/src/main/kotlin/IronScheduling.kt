class IronScheduling {
    fun ironClothes()
    {
        println("Iron Service Activated...")
        println("You want to wear clothes before bath just give me detail in numbers.")
        println("Your clothes get ironed within few minutes only..")
        print("Plz add No of Pants quantity:")
        val pants =readLine()?:""
        val pantQuantity=pants.toInt()
        print("Plz add No of Shirts quantity:")
        val shirts =readLine()?:""
        val shirtsQuantity=shirts.toInt()
        println("Ironed clothes is ready successfully..\nPants = $pantQuantity\nShirts = $shirtsQuantity")
        println("Thank you so much for using our Iron Service.")

    }
}