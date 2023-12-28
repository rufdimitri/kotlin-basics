package rd.kt.loop_for

fun main() {
    for1()
    for2()
}

fun for1() {
    println("for (x in 0..9) {")
    for (x in 0..9) {
        println("  x = $x")
    }
    println("}")
}

fun for2() {
    val autos = listOf("BMW", "Mercedes", "Audi")
    println("for (auto in autos) {")
    for (auto in autos) {
        println("  $auto")
    }
    println("}")
}