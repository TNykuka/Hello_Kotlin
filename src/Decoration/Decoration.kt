package Decoration

fun main(args:Array<String>){
    makeDecorations()
}
fun makeDecorations(){
    val d1 = Decoration("granite")
    println(d1)

    val d2 = Decoration("slate")
    println(d2)

    val d3 = Decoration("slate")
    println(d3)

    println(d1.equals(d2))
    println(d2.equals(d2))

    val d4:Decoration = d3.copy()
    println(d3)
    println(d4)

    val d5 = Decoration2("crystal","wood","diver")
    println(d5)

    val (rock:String,wood:String,diver:String) = d5
    println(rock)
    println(wood)
    println(diver)

}

data class Decoration(val rocks: String){}

data class Decoration2(val rocks: String,val wood:String,val diver: String){

}

