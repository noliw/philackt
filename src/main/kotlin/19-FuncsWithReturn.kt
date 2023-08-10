fun main() {
    adding(1,5)
    threeLines()

    val power = power(3,5)

}

fun multiply(a:Int, b:Int) = a * b

fun firstItem(list: List<Int>) = println(list[0])


fun power(base: Int, exponent: Int): Int {
    var result = Math.pow(base.toDouble(), exponent.toDouble()).toInt()
    println("$base to the power of $exponent is $result")
    return result
}

fun threeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun adding (num1: Int, num2: Int) {
    var total = 0
    for (num in num1..num2){
        total += num
    }
    println("THe sum of the values from $num1 to $num2 is $total ")
}