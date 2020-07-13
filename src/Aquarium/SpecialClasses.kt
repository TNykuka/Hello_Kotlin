package Aquarium

object MobyDickWhale{
    val author = "Herman Melville"

    fun jume(){
        // ...
    }
}

enum class Color (val rgb: Int){
    RED(0xFF0000),
    GREEN(0x00FF000),
    BLUE(0x0000FF)
}
sealed class Seal

class SeaLion:Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String{
    return when (Seal){
        is Walrus -> "walrus"
        is SeaLion -> "Sea lion"

    }
}
interface SpiceColor {
    val color: Color
}

object YellowSpiceColor : SpiceColor {
    override val color = Color.YELLOW
}