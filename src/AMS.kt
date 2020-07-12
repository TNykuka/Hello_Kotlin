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
    val week = listOf ("Monday","Tuesday","Wednesday","thursday","Friday","Saturday","Sunday")
    return week[Random().nextInt(7)]
}