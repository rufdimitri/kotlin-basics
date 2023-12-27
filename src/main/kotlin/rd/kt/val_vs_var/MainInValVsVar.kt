package rd.kt.val_vs_var

fun main() {
    val x = 3
//    x = 4 //error, val is not

    var y = 5
    y = 6 //ok
    println("x = $x, y = $y")
}