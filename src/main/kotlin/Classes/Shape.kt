package Classes

open class Shape(
    var name: String,
) {
    init {
        println("I am the super/parent class!!!1")
    }

    fun changeName(newName: String) {
        name = newName
    }
}