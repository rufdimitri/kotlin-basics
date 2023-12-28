package rd.kt.class1.anonymous_class

import rd.kt.class1.abstract_class.Transport

fun main() {
    val bus = object : Transport(8) {
        override fun drive() {
            println("drive @ bus")
        }
    }

    bus.drive()
}