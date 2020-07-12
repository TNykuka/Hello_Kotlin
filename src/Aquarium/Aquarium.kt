package Aquarium

/*fun main(args: Array<String>){
    val myAquarium: Aquarium = buildAquarium()
    println("volume: ${myAquarium.volume}")
}

internal fun buildAquarium = Aquarium()

class Aquarium(val width: Int = 0,var height: Int = 40,val length: Int = 100){
    var volume
        get() = width * height * length / 1_000
        set(value) {height = (value * 1000) / (width * length)}
}*/



class Aquarium(var length: Int = 100,var width: Int =20,var height: Int = 40){

    var volume: Int
        get() = width * height * length / 1000
        set(value){height = (value * 1000) / (width * length) }

    var water = volume * 0.9

    constructor(numberOfFish: Int): this(){

        val water:Int = numberOfFish * 2000 // cm3
        val tank: Double = water + water * 0.1
        height = (tank / (length * width)).toInt()
    }
}