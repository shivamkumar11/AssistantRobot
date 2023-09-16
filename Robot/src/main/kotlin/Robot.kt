class Robot : DailyTask {

    override fun ringAlarm() {
        val callAlarmService = AlarmScheduling()
        callAlarmService.alar()
    }

    override fun mainServices() {
        println("Hi there,I am SHIVAM'S ROBOT assistant.")
        println("How can I help you ?")
        println("I Offer Daily Routine Services.")
        println("Select Services no.")

        val list: Array<Any> = arrayOf("Alarm", "Make Coffee", "Heat Water", "Bag Pack", "Cook", "Iron")
        for (i in list) {
            println("No:${list.indexOf(i)}- $i Service")
        }
        try {
            print("Choose SERVICE no from above list\nEnter service No here:")
            val enter = readlnOrNull() ?: ""
            val no = enter.toInt()
            when (no) {
                0 -> {
                    val r = Robot()
                    print(r.ringAlarm())
                }

                1 -> {
                    val r = Robot()
                    print(r.makeCoffee())
                }

                2 -> {
                    val r = Robot()
                    print(r.heatWater())
                }

                3 -> {
                    val r = Robot()
                    print(r.packBag())
                }

                4 -> {
                    val r = Robot()
                    print(r.cook())
                }

                5 -> {
                    val r = Robot()
                    print(r.iron())
                }
            }
        } catch (b: Exception) {
            print("Error occurred..")
        }


    }

    override fun makeCoffee() {
        val callCoffeeService = CoffeeScheduling()
        callCoffeeService.makeCoffee()

    }

    override fun heatWater() {
        val callHeatWaterService = HeatWaterScheduling()
        callHeatWaterService.heatWater()
    }

    override fun packBag() {
        val callBagPackService = BagPackScheduling()
        callBagPackService.bagPack()

    }

    override fun cook() {
        val callCookService = CookScheduling()
        callCookService.cooking()
    }

    override fun iron() {
        val callIronService = IronScheduling()
        callIronService.ironClothes()
    }
}