package rd.kt.loop_for

fun main() {
    for1();

}

fun for1() {
    println("for (x in 0..9) {")
    for (x in 0..9) {
        println("  x = $x");
    }
    println("}")
}