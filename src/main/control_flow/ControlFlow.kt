fun printGameBoyControlAction(button: String) {
    println(
        when (button) {
            "A" -> "Yes"
            "B" -> "No"
            "X" -> "Menu"
            "Y" -> "Nothing"
            else -> "There is no such button"
        }
    )
}

fun whileLoop() {
    var pizzaSlices = 0

    while (pizzaSlices < 7) {
        pizzaSlices++
        println("There's only $pizzaSlices slice/s of pizza :(")
    }

    pizzaSlices++
    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun doWhileLoop() {
    var pizzaSlices = 0

    pizzaSlices++

    do {
        println("There's only $pizzaSlices slice/s of pizza :(")
        pizzaSlices++
    } while (pizzaSlices < 8)

    println("There are $pizzaSlices slices of pizza. Hooray! We have a whole pizza! :D")
}

fun fizzBuzz() {
    for (number in 1..100) {
        println(
            when {
                number % 15 == 0 -> "fizzbuzz"
                number % 3 == 0 -> "fizz"
                number % 5 == 0 -> "buzz"
                else -> number
            }
        )
    }
}

fun wordsStartWithLetter(words: List<String>, letter: Char) {
    for (word in words) {
        if (word.lowercase().startsWith(letter.lowercaseChar())) {
            println(word)
        }
    }
}

fun main() {
    printGameBoyControlAction("A")
    whileLoop()
    doWhileLoop()
    fizzBuzz()
    wordsStartWithLetter(listOf("dinosaur", "limousine", "magazine", "language"), 'l')
}