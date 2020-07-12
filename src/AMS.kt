import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()
}
fun feedTheFish(){
    val day = randomDay()
    val food = "Pellets"
    println("Today is $day and the fish eat $food")
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