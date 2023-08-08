fun main() {
    //Easy
    var uInput = readln()
    var num = uInput.toInt()
    if (num != null) {
        println("Let's count from $num Down to 0")
        while (num >= 0) {
            println(num)
num--
    }
}

}