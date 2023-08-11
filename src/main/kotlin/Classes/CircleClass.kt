package Classes

import kotlin.math.pow

class Circle(
    val radius: Double,
) : Shape("Circle") {
    val pi = 3.141592

    init {
        println("$name created with radius is $radius")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")
    }

    fun area() = radius.pow(2) * pi

    fun perimeter() = 2 * radius * pi
}