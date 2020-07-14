package Aquarium5

import java.util.*
import kotlin.reflect.jvm.internal.impl.load.kotlin.JvmType

fun main (args: Array<String>){
    fishExample()
}

data class Fish (var name:String)

fun fishExample() {
    val fish = Fish("Splashy")

    //with inline no object is created every call to myWith
    myWith(fish.name, Object : Function1< String , Unit>){
        override fun invoke(name: String){
            name.capitalize()
        }
    })
    fish.name.capitalize()
}
inline fun myWith(name: String,block: String.() -> Unit){
    name.block()
}