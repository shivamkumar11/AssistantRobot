class HeatWaterScheduling {
    fun heatWater() {
        println("Heating water service Activated")
        println("Plz enter Today Water Temperature for your bath.")
        print("Please enter Temperature in No here:")
        val temp = readLine() ?: ""
        val temperature = temp.toInt()
        println("I recommend plz take regular bath daily.")
        println("You want to add particular Days for your Bath or Not ")
        println("Select No\nYES = 1\nNo = 2")
        println("Please enter no here:")
        val a = readLine() ?: ""
        when (a.toInt()) {
            1 -> {
                println("Please enter Days to set this $temperature")
                println("Plz follow this format to enter Day name\nFORMAT = SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY")
                print("Plz enter DAY name here:")
                val days = readLine() ?: ""
                println("Today Water =$temperature Celsius for your bath is added successfully.. ")
                println("Your Water temperature scheduled successfully for these days.\n$days")
                println("Your hot water is ready for bath...")
                println("Thank you so much for using our Bath Service.")
            }

            2 -> {
                println("Today Water =$temperature Celsius for your bath is added successfully.. ")
                println("Your hot water is ready for bath...")
                println("Thank you so much for using our Bath Service.")
            }

            else -> {
                println("Plz select right option.")
            }

        }
    }
}