import kotlin.random.Random

class BagPackScheduling {
    fun bagPack() {

        println("First add your Time Table here.")
        println("Are you want to add your timetable ?\nYes=1\nNo=0")
        print("Please enter your response:")
        val a = readLine() ?: ""
        when (a.toInt()) {
            0 -> {
                println("Thank you for using our service.")

            }

            1 -> {
                println("Plz add book name in your timetable in this,\nFORMAT =English,Hindi,Math,History,Gk,Geography")
                val array = arrayOf("Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday")
                for (i in array) {
                    print("Please enter Books name here:\n$i :")
                    val userAddedDays = readLine() ?: ""
                    val daysBookList = TimeTable(i, userAddedDays)
                    println(daysBookList)


                }


            }

            else -> {
                println("Please enter valid response.")
                println("Thank you for using our service.")
            }
        }
    }

}

fun main() {
    val a = BagPackScheduling()
    println(a.bagPack())
}