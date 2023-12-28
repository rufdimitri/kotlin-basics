package rd.kt.try_catch

import java.lang.Exception

fun main() {
    while (true) {
        print("Please input a number: ")
        val input = readLine() ?: "0"
        val number = try {
            input.toInt()
        } catch (e: NumberFormatException) {
            0
        }
        println("You entered: $input")
        println("converted into Int = $number")
    }
}