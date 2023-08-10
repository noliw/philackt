fun main() {
    println("Please enter 5 numbers:")
    var list = mutableListOf<Int>()
    for (num in 1..5) {
        var inputNum = readLine()?.toInt()
        if (inputNum != null) {
            list.add(inputNum)
        }
    }
    println()
    println("The 5 numbers in reverse are: ")
    for (num in list.reversed()) {
        println(num)
    }
}