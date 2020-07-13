package Aquarium.generics

fun main(args: Array<String>){
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcessed = false
    }
}

class FinhStoreWater : WaterSupply(false)

class TapWater : WaterSupply(true){
    fun addChemicalCleaners(){
        needsProcessed = false
    }
}
class FishStoreWater : WaterSupply(false)
class LakeWater : waterSupply(true){
    fun filter{
        needsProcessed = false
    }
}

class Aquarium<T: WaterSupply>(val  waterSupply: T){
    fun addWater(){
        check(!waterSupply.needsProcessed){"water supply needs processed"}
        println("adding water from $waterSupply")
    }
}

fun genericExample(){
    val aquarium: Aquarium<TapWater> = Aquarium.(TapWater())
    aquarium.waterSupply.addChemicalCleaners()

    val aquarium4 : Aquarium<LakeWater> = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()

    val aquarium = Aquarium("String")
}