fun Book.weight() : Double { return (pages * 1.5) }

fun Book.tornPages(torn: Int) = if (pages >= torn) pages -= torn else pages = 0

class Puppy() {
    fun playWithBook(book: Book) {
        book.tornPages(Random().nextInt(12))
    }
}
val puppy = Puppy()
val book = Book("Oliver Twist", "Charles Dickens", 1837, 540)

while (book.pages > 0) {
    puppy.playWithBook(book)
    println("${book.pages} left in ${book.title}")
}
println("Sad puppy, no more pages in ${book.title}. ")