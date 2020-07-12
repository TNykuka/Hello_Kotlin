package Aquarium

import java.awt.Color

fun main(args: Array<String>){
    delegate()
}
fun  delegate(){
    val pleco = Plecostomus()
    println("Fish has color ${pleco.color}")
    pleco.eat()
}

interface FishAction{
    fun eat()
}
interface FishColor{
    val color: String
}

class Plecostomus(fishColor: FishColor = GoldColor): FishAction,
    FishColor by fishColor{
    override fun eat() {
        println("eat algae")
    }
}

object GoldColor:FishColor{
    override val color = "gold"
}
object RedColor: FishColor{
    override val color = "rad"
}

class  PrintingFishAction(val food:String): FishAction{
    override fun eat() {
        println(food)
    }
}