class AlarmScheduling {
    private val yes = 1
    private var userArray = arrayListOf<String>()

    fun alar() {
        try {
            println("Alarm is ready..")
            println("Are you want to schedule Alarm on any day?")
            print("First Plzz enter time in this Format=12:00\nEnter time here:")
            val enterTime = readlnOrNull() ?: ""
            println("Are you want to schedule your alarm on:$enterTime")
            println("Enter YES = 1\nEnter NO = 0")
            print("Enter here:")
            val enterDetail = readlnOrNull() ?: ""
            val enterChoice = enterDetail.toInt()
            if (enterChoice == yes) {
                print("Second plzz enter DAY to schedule alarm in this format.\nFormat=Sunday,Monday,Tuesday,Wednesday,Thursday,Friday,Saturday\nEnter DAYS here:")
                var userEnter = readlnOrNull() ?: ""
                userArray.add(userEnter)
                println(userArray)
                println("Are you want to modify SELECTED DAYS")
                println("Enter YES=1 or NO=0")
                val g = readlnOrNull() ?: ""
                val h = g.toInt()
                if (h == 1) {
                    println("Day Modification start..")
                    println("You want to Add or Delete days")
                    println("Enter:ADD = 0\nEnter:DELETE = 1\nEnter:Remove All=2")
                    print("Enter No:")
                    val j = readlnOrNull() ?: ""
                    when (j.toInt()) {
                        0 -> {
                            print("Plz enter Day name here:")
                            val l = readlnOrNull() ?: ""
                            userArray.add(l)
                            println("Add successful..")
                            println("Alarm scheduled time:$enterTime O'Clock on days:$userArray.")
                            println("Thank you for using our ALARM service.")
                        }

                        1 -> {
                            print("Plz enter Deleted Day name here:")
                            val deletedDay = readlnOrNull() ?: ""
                            println(deletedDay)
                            userArray.remove("$deletedDay")
                            println("Delete successful..")
                            println("Alarm scheduled time:$enterTime O'Clock on days:$userArray.")
                            println("Thank you for using our ALARM service.")
                        }

                        2 -> {
                            userArray.removeAll(userArray.toSet())
                            println("Removed successful..")
                            print("Selected days cleared Successful:\n$userArray")
                            println("Thank you for using our ALARM service.")
                        }
                    }
                } else {
                    println("Alarm scheduled time:$enterTime O'Clock on days:$userArray.")
                    println("Thank you for using our ALARM service.")

                }
            } else {
                print("Ok,Thank you using our Alarm service.")
            }
        } catch (a: NumberFormatException) {
            print("Plz enter correct value..")

        } catch (e: Exception) {
            print("Error occurred..")
        }
    }


}