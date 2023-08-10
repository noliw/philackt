fun main() {
    sum(1,5)
    printThreeLines()
}


fun printPow(base: Double, exponent: Double) {
    var result = Math.pow(base, exponent).toInt()
    println("$base to the power of $exponent is $result")
}

fun printThreeLines() {
    println("First")
    println("Second")
    println("Third")
}

fun sum (num1: Int, num2: Int) {
    var total = 0
    for (num in num1..num2){
        total += num
    }
    println("THe sum of the values from $num1 to $num2 is $total ")
}