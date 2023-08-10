fun main() {
    // Vararg to pass a variable number of arguments to a function. Inside the function, you can treat the vararg parameter as an array of the specified type.
    val arr = intArrayOf(13, 242, 5, 56, 78)
    val max = getMax(1, 2, 3, 4, *arr, 5, 6, 7, 5, 4)
    println("the maximum is $max")

    //Default: setting default values for the params
    search("How to learn android")
    search("How to ", "bing")

    // Named: Used when we dont know the order of the arguments
    search(search = "Loving", searchEngine = "Explorer")
}

//VARARG
fun getMax(vararg numbers: Int): Int {
    var max = numbers[0]
    for (num in numbers) {
        if (num > max) {
            max = num
        }
    }
    return max
}

// DEFAULT

fun search(search: String, searchEngine: String = "Google") {
    println("Searching for '$search' on $searchEngine")

}