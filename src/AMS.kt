import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()

    var bubbles = 0
    while (bubbles < 50){
        bubbles++
    }

    //repeat (function from standard library)
    repeat(2){
        println("A fish is swimming")
    }
}

fun shouldChangeWater(
    day: String,
    temperature: Int = 22,
    dirty: Int = 20) : boolean {
    val isTooHot = temperature > 30
    val isDirty = dirty > 30
    val isSunday = day == "Sundey"
    return when{
        isTooHot(temperature)-> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false

    }
}

fun isTooHot(temperature: Int) = temperature >30
fun isDirty(dirty: Int) = dirty > 30
fun  isSunday(day: String) = day == "Sunday"



fun feedTheFish() {
    val day = randomDay()
    val food = "Pellets"
    println("Today is $day and the fish eat $food")
    shouldChangeWater(day,20,50)
    shouldChangeWater(day)
    shouldChangeWater(day, dirty = 50)

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
}


fun  randomDay() : String{
    val week = listOf ("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}
fun fishFood (day : String) : String{
    var food = "fasting"
    return when (day){
        "Monday" -> "flakes"
        "Wednesday" -> "redworms"
        "Thursday" -> "granules"
        "Friday" -> "mosquitoes"
        "Sunday" -> "plankton"
        else -> "fasting"
    }
}