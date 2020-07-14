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
    fun addWater(cleaner: Cleaner<T>){
        if (waterSupply.needsProcessed){
            cleaner.clean(waterSupply)
        }
        println("adding water from $waterSupply")
    }
}

interface Cleaner<in T : WaterSupply>{
    fun  Clean(waterSupply: T)
}

class TapWaterCleaner: Cleaner<TapWater>{
    override fun Cleaner<waterSupply: TapWater>{
        waterSupply.addChemicalCleaners()
    }
}

fun addItem(aquarium: Aquarium<waterSupply> ) = println("item added")

fun genericExample(){
    val Cleaner = TapWaterCleaner()
    val aquarium:Aquarium<TapWater> = Aquarium((TapWater))
    aquarium.addWater(Cleaner)
}