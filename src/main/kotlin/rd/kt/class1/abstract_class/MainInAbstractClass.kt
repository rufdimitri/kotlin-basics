package rd.kt.class1.abstract_class

fun main() {
//    val transport = Transport(2) //Error cannot create instance of abstract class
    val auto = Auto()
    println("Auto has ${auto.doors} doors")
    auto.drive()
}