package rd.kt.class1.abstract_class

class Auto : Transport (3) {
    init {
        println("Created Auto")
    }

    override fun drive() {
        println("drive @ Auto")
    }
}