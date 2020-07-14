package Aquarium5

import Aquarium.fishExample

data class Fish (var name:String)

fun main (args: Array<String>){
    fishExample()
}

fun fishExample(){
    val fish = Fish("Splashy")

    myWith (fish.name){
        println(capitalize())
    }

    println(fish.run {name})
    println(fish.apply {  })

    val fish2 : Fish = Fish(name = "splashy").apply {name = "Sharky"  }
    println(fish2.name)

    fish.let { it.name.capitalize() }
        .let { it + "fish" }
}

fun  myWith(name: String,block:String.() -> Unit){
    name.block()
}