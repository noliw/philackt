fun main() {
    val sum = alternatingSum(3, 4, 5, 2, 1, 2, 3)
    println("The alternating sum is $sum")  // Output: 2
}

fun alternatingSum(vararg numbers: Int): Int {
    var sum = 0

    for (i in numbers.indices) { // i is the index
        // Check if the index is even or odd
        if (i % 2 == 0) {
            // For even indices, add the value to the sum
            sum += numbers[i]
        } else {
            // For odd indices, subtract the value from the sum
            sum -= numbers[i]
        }
    }

    return sum
}
