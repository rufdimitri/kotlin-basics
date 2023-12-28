package rd.kt.class1

open class AnimalOpen (
    val name: String, //constructor parameter is also an instance variable
    legCount: Int = 4 //without val , its only a constructor parameter and not instance variable anymore
) {

    init {
        println("Hello, my name is $name, i have $legCount legs")
    }
}