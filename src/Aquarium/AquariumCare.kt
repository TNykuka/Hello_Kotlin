package Aquarium

fun main(args: Array<String>){

    val cures:Map<String,String> = mapOf("white spots" to "Ich","red sores" to "hole disease")

    println(cures.get("white spots"))
    println(cures["white spots"])

    println(cures.getOrDefault("bloating","sorry I don't know"))

    cures.getOrElse(("bloating")){"no cure for this"}

    val  inventory : MutableMap<String , Int> = mutableMapOf("fish net" to 1)
    inventory.put("tank scrubber",3)
    inventory.remove("fish net")

}