import jdk.dynalink.Operation
import java.util.*

fun main(args: Array<String>){
    println("Hello, ${args[0]}!")
    feedTheFish()
    eagerExample()

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
    dirty: Int = 20) : Boolean {
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

var dirty = 20
var waterFilter: (Int) -> Int = {dirty: Int -> dirty / 2 }
fun feedFish(dirty: Int) = dirty + 10

fun updateDirty(dirty: Int, operation: (Int) -> Int): Int{
    return operation(dirty)
}

fun dirtyProcessor(){
    dirty = updateDirty(dirty, waterFilter)
    dirty = updateDirty(dirty, ::feedFish)
    dirty = updateDirty(dirty,{ dirty ->
        dirty +50
    })
}


fun isTooHot(temperature: Int) = temperature >30
fun isDirty(dirty: Int) = dirty > 30
fun  isSunday(day: String) = day == "Sunday"

fun eagerExample(){
    val decoration = listOf ("rock","pagoda","plastic plant","alligator","flowerpot")

    val eager = decoration.filter{it[0] == 'p'}
    println(eager)

    // apply filter lazily
    val filtered = decoration.asSequence().filter { it[0] == 'p' }
    println(filtered)
    println(filtered.toList())

    //apply map lazily
    val lazyMap = decoration.asSequence().map {
        println("map: $it")
        it
    }
    println(lazyMap)
    println("first: ${lazyMap.first()}")
}

fun feedTheFish() {
    val day = randomDay()
    val food = fishFood(day)
    println("Today is $day and the fish eat $food")

    if (shouldChangeWater(day)){
        println("Change the water today")
    }
    // call dirty processor
    dirtyProcessor()
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