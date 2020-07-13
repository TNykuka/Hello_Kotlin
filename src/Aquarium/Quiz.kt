const val MAX_NUMBER_BOOKS = 20

fun canBorrow(hasBooks: Int): Boolean {
    return (hasBooks < MAX_NUMBER_BOOKS)
}

object Constants {
    const val BASE_URL = "http://www.turtlecare.net/"
}

fun printUrl() {
    println(Constants.BASE_URL + title + ".html")
}
companion object {
    val BASE_URL = "http://www.turtlecare.net/"
}