fun main() {
    findNum(listOf(3,2,5,1,5,6,7))
}

fun findNum(list: List<Int>) { // [3,2,5,6,7]
    println("The list looks like $list")
    println("Search for this number:")
    val num = readLine()?.toInt()
    if (num != null) {
        var idx = list.indexOf(num)
        if (num in list) {
            println("THe index of $num is $idx")
        } else {
            println("NAh")
        }
    }
}
