fun main() {
    val arr = arrayOf(1, 2, 3)// the values of an array can be changed during runtime
    val rlist = listOf(1, 2, 3)
    val mlist = mutableListOf(1,2,3)

    // ex1
    arr[0] = 3 // this will turn the 1 into a 3 but we cannot do this with lists
    mlist[0] = 3

    // so what is the difference between arrays and lists??
        // Lists are similar to arrays but more flexible
        // mutable lists can even change in size. we cannot add or remove things to arrays but we can with mutable lists

    mlist.add(4)
    println(mlist)

    mlist.remove(4)
    println(mlist)

    



}


