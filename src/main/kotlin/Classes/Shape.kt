package Classes

open class Shape(
    var name: String, // protected only available within the shape class and all the subclasses that inherit from it
) {
    init {
        println("I am the super/parent class!!!1")
    }

    fun changeName(newName: String) { //
        name = newName
    }
}