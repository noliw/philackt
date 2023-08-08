fun main() {
    val uInput = readLine()
    var age = uInput?.toInt()
    if (age != null) {
        if (age in 0..17){
            println("You are still a child!")
        } else if (age in 18..64){
            println("Congrats you are officially an adult")
        } else {
            println("you are super old!")
        }
    }
}