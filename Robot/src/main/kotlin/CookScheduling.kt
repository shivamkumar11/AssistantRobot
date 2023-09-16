import kotlin.random.Random

class CookScheduling {
    fun cooking() {
        println("Cooking service start..")
        println("Plz enter items for your Breakfast & Lunch.")
        println("Select No\n1-Add BreakFast Items\n2-Add Lunch Items")
        print("Enter no here:")
        val num = readLine() ?: ""
        when (num.toInt()) {
            1 -> {
                println("Please Add items separated with comma in this\nFormat:ex=Maggi,Pao,Bread,more")
                val breakFastItems = mutableListOf<String>()
                print("Add items name here in proper format:")
                val num = readLine() ?: ""
                breakFastItems.add(num)
                println("Check Your Added Items $breakFastItems")
                val a = Random.nextInt(0,breakFastItems.size)
                println("Today's BreakFast items is =${breakFastItems[a]}")


            }

            2 -> {
                println("Please Add items separated with comma in this\nFormat:ex=Pulse-Rice,Rajma-Rice,Chapati-Sabji,more")
                val lunchItems = mutableListOf<String>()
                print("Add items name here in proper format:")
                val lunchItem = readLine() ?: ""
                lunchItems.add(lunchItem)
                println("Check Your Added Items $lunchItems")
                val b = Random.nextInt(0,lunchItems.size)
                println("Today's Lunch items is =${lunchItems[b]}")

            }

            else -> {
                println("Plz enter right option.")
            }


        }

    }
}

fun main() {
    val a = CookScheduling()
    println(a.cooking())
}