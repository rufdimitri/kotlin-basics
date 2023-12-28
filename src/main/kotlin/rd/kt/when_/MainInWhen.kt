package rd.kt.when_

fun main() {
    val x = 5

    when (x) {
        in 1..2 -> println("x is between 1 and 2")
        in 3..5 -> println("x is between 3 and 5")

        else -> { //multiline code
            println("x has another value: ")
            println("x = $x")
        }
    }
}