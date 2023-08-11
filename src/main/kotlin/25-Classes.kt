import Classes.Circle
import Classes.Rectangle

//  a class is a blueprint for an object


fun main() {
    val myRect = Rectangle(4.0, 7.0)
    println(" Rectangle area is ${myRect.area()}")
    println(" Rectangle Perimeter is ${myRect.perimeter()}")
    println(" Rectangle  is square?  ${myRect.isSquare()}")
    println()

    val myCircle = Circle(5.0)
    println()
    val secondCircle = Circle(7.0)
}

