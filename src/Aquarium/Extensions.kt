package Aquarium

fun String.hasSpaces() = find { it == ' '} != null

fun extensionsExample(){
    "Does it nave spaces?".hasSpaces() // true
}

class AquariumPlant(val cokor: String, private  val size: Int)

fun AquariumPlant?.pull(){
    this?.apply { this: AquariumPlant
        println("removing $this")
    }
}
fun nullableExample(){
    val plant: AquariumPlant? = null
    plant.pull() // ok
}