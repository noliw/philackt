fun main() {
    println("Please enter a number: ")
    val input = readLine()?.toInt()

    if(input != null){
      if (input.isPrime()) {
          println("$input is a prime number")
      } else {
          println("$input is NOT a prime number")

      }
    }
}


fun Int.isPrime(): Boolean{
   return  this % 2 == 0
}