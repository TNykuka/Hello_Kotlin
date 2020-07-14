package Aquarium.generics

import java.lang.ref.Cleaner

fun main(args: Array<String>){
    genericExample()
}

open class WaterSupply(var needsProcessed: Boolean)

class TapWater : WaterSupply(true){
    fun addChemicalCleaners() = apply{ needsProcessed = false
    }
}

class FinhStoreWater : WaterSupply(false)

class LakeWater  : WaterSupply(true){
    fun filter() = apply{needsProcessed = false }
}

class Aquarium<out T : WaterSupply>(val waterSupply: T ){
    fun addWater(){
        check (!waterSupply.needsProcessed){"water supply needs processed"}

        println("adding water from $waterSupply")
    }
}

inline fun <reified R : WaterSupply> Aquarium<*>.hasWaterSupplyOfType() = waterSupply is R

fun <T: WaterSupply> isWaterClean(aquarium: Aquarium<T>){
    println("aquarium water is Clean: ${aquarium.waterSupply.needsProcessed}")

}

inline fun <reified T:WaterSupply> WaterSupply.isOfType() = this is T

fun genericExample(){
    val aquarium:Aquarium<TapWater> = Aquarium(TapWater())
    aquarium.hasWaterSupplyOfType<TapWater>() // true
    aquarium.waterSupply.isOfType<LakeWater>() // false
}
