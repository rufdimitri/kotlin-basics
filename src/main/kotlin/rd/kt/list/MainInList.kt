package rd.kt.list

fun main() {
    //unmutable list
    val autos = listOf("BMW", "Mercedes", "Audi")
//    autos.add("...") //error, list can only be read, but not modified
    for(auto in autos) {
        println("auto = $auto")
    }

    //mutable list
    val cities = mutableListOf("Berlin", "New York", "Barcelona")
    cities.add("Prague") //add new item to the list
    for (city in cities) {
        println("city = $city")
    }
}