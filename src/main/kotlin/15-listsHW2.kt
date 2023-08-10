fun main() {
    val fibList = mutableListOf(0, 1)
    println("Please enter a number n > 1: ")
    val n = readLine()?.toIntOrNull()

    if (n != null && n > 1) {
        for (i in 2 until n) {
            val nextNumber = fibList[i - 1] + fibList[i - 2]
            fibList.add(nextNumber)
        }
    }
    println(fibList)
}
