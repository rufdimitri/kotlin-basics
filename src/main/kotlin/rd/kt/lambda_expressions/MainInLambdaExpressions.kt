package rd.kt.lambda_expressions

fun main() {
    example1Count()
    example2ForEach()
    example3CustomCountFunction()
}

fun example1Count() {
    println("example1Count")
    val list = listOf("Warcraft", "Legends", "Wisdom")
    val count = list.count { value -> value.startsWith("W")}
    println("count = $count")
}

fun example2ForEach() {
    println("example2ForEach")
    val list = listOf("Warcraft", "Legends", "Wisdom")
    val uppercaseList = list.map { value -> value.uppercase() }
    println("uppercaseList = $uppercaseList")
}

fun example3CustomCountFunction() {
    println("example3CustomCountFunction")
    val list = listOf("abc", "de", "fgh", "i")
    val count = list.customCount { value -> value.length == 3 }
    println("count = $count")
}

fun <T> List<T>.customCount(predicatFunction: (T) -> Boolean): Int {
    var count = 0
    for (value in this) {
        if (predicatFunction(value)) {
            count++;
        }
    }

    return count
}