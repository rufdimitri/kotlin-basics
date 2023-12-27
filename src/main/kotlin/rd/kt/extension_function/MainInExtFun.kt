package rd.kt.extension_function

fun main(args: Array<String>) {
    val n = 123
    println(n.add10())
}

fun Int.add10(): Int {
    return this + 10
}