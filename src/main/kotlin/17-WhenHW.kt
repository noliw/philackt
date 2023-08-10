fun main() {
    println("Where are you from?")
    var country = readLine()
    when(country){
        "Russia" -> println("Privet")
        "USA" -> println("Hello")
        "France" -> println("Bonjour")
        else -> println("I don't know that")
    }
}