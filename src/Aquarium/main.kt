package Aquarium

fun main(args: Array<String>){
    buildAquarium()
}

fun buildAquarium(){
    val myAquarium = Aquarium()
    println("Length: ${myAquarium.length}" +
            "Width: ${myAquarium.width}" +
            "Height: ${myAquarium.height}")
    myAquarium.height = 80

    println("Heigth: ${myAquarium.height} cm ")

    println("Volume: ${myAquarium.volume} liters ")

    val smallAquarium = Aquarium(length = 20, width = 15,height = 30)
    println("Small Aquarium: ${smallAquarium.volume} liters")

    val myAquarium2 = Aquarium(numberOfFish = 9)
}

fun feedFish(fish: FishAction){
    // make some food then
    fish.eat()
}

fun makeFish(){
    val shark = Shark()
    val pleco = Plecostomus()

    println("Shark: ${shark.color} \n Plecostomus : ${pleco.color}")

    shark.eat()
    pleco.eat()
}