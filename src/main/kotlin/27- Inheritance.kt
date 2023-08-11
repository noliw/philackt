import Classes.Circle
import Classes.Triangle

fun main() {
    val cir1 = Circle(5.0)
    cir1.changeName("Peter")
    println(cir1.name)

    println()
    val tri = Triangle(3.0,3.0,3.0)
    tri.changeName("Noli")
    println("The name of the triangle is ${tri.name}")
    println()
}