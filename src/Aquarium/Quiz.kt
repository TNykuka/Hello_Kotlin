fun move(where: () -> Boolean ) {
    where.invoke()
}
fun makeMove(command:String?) {
    if (command.equals("n")) move(north)
    else if (command.equals("s")) move(south)
    else if (command.equals("e")) move(east)
    else if (command.equals("w")) move(west)
    else move(end)
}
while (true) {
    print("Enter a direction: n/s/e/w: ")
    game.makeMove(readLine())
}