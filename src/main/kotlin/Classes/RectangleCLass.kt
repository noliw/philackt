package Classes

class Rectangle( // constructor is used to specify the values we need to create a class
    val a: Double,
    val b: Double
) {
    init {
        println("Rectangle crete with a = $a and b = $b")
    }

    fun area() = a * b

    fun perimeter() = 2 * a + 2 * b

    fun isSquare() = a == b

}