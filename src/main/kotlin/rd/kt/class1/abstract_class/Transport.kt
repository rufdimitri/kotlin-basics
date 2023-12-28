package rd.kt.class1.abstract_class

abstract class Transport (
    val doors: Int
) {
    init {
        println("Created Transport with $doors doors")
    }

    abstract fun drive()
}