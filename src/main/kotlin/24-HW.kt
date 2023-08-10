fun main() {
    val list = listOf(1, 2, 3, 4, 5, 6)
    println("The product of $list is ${list.product()}")
}

fun List<Int>.product(): Int {
    var prod = 1

    for (i in this) {
        println(i)
        prod *= i
    }
    return prod
}
