fun main() {
    println("Please enter 5 numbers:")
    var average = 0.0
    for (enteredNum in 1..5){
        var uInput = readLine()?.toDouble()
        if (uInput !== null){
            average += uInput/5.0
        }
    }
    println("the average of the numbers is $average")
}