package Classes

import kotlin.math.pow

class Circle (
    val radius: Double,
) {
    val pi = 3.141592
    init {
        println("Circle created with radius is $radius")
        println("Circle area is ${area()}")
        println("Circle perimeter is ${perimeter()}")
    }

    fun area() = radius.pow(2) * pi

    fun perimeter() = 2 * radius * pi
}