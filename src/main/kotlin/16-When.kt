fun main() {
    //when statements help us simplify the if statement

    val age = readLine()?.toInt()
    val x = 5
    // the when expresssion only depends on one variable (age) we cannot add things
    when (age) {
        in 0..5 -> {
            println("You're a young kid")
            println("Here is another line")
        }
        in 6..17 -> println("You're a teenager")
        18 -> if (x == 6){
            println("Finally, you're 18")
        }
        19, 20 -> println("You're a young adult")
        in 21..65 -> println("You're an adult")
        else -> println("You're really old")
    }
}