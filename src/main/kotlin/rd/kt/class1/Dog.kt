package rd.kt.class1

//class Dog : AnimalClosed("Dog") { //AnimalClosed is final, so it cannot be inherited from
//}

class Dog : AnimalOpen("Dog") {
    init {
//        println("Dog has: $legCount") //error, because legCount is not an instance variable
    }
}