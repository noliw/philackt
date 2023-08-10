fun main() {
    val list = mutableListOf<Int>()
    println("PLease enter 10 numbers: ")
    for (i in 1..10){
        val x = readLine()?.toInt()
        if (x != null){
            list.add(x)

        }
    }
    println(list)
}