fun main() {
    findNum(listOf(3,2,5,1,5,6,7))
}

fun findNum(list: List<Int>) { // [3,2,5,6,7]
    println("The list looks like $list")
    println("Search for this number:")
    val num = readLine()?.toInt()

    if (num != null) {
        val index = list.indexOf(num)
        if (index != -1) {
            println("The index of $num is $index")
        } else {
            println("The number you entered is not in the list")
        }
    } else {
        println("Invalid input")
    }
}
