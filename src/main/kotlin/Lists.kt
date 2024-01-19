fun main() {

    //arrays are mutable, lists are immutable unless we create a mutable list
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    array[0] = 9
    //list[0] = 3  :immutable

    mutableList()
    mutableLists()
    reverse()
    fibonacci()
}

fun mutableList() {
    //mutable lists can change in size unlike arrays which dont
    val list = mutableListOf(1,2,3)  //mutable
    list[0] = 9
    list.add(4) //you can add items to list but not array
    list.remove(1) //removes an element/value
    list.removeAt(1) //remove value/element at index
    println(list)
}
fun mutableLists() {
    val list = mutableListOf<Int>()  //Empty lists require to specify data type
    println("Number of elements:")
    val element = readLine()?.toInt()
    println("Add elements to list:")
    for (i in 1..element!!) { //(!!) a non-null asserted call
        val x = readLine()?.toInt()
        if (x != null) //make sure val x is not null
        list.add(x)
    }
    println(list)
}
fun reverse() {
    val list = mutableListOf<Int>()
    println("Number of elements:")
    val element = readLine()?.toInt()
    println("Add elements to list:")
    for (i in 1..element!!) { //(!!) a non-null asserted call
        val x = readLine()?.toInt()
        if (x != null) {//make sure val x is not null
            list.add(x)
        }
    }

    list.reverse()
    println(list)
    //or
    for (i in list.size - 1 downTo 0) {
        println(list[i])
    }
}
fun fibonacci() {
    val list = mutableListOf(0,1)
    println("Enter a number n > 1:")
    val n = readLine()?.toInt()
    if (n != null) {
        for (i in 2..n-1) { //start from i[2] //if n == 6 listOf(0,1,1,2,3,4)
            list.add(list[i-2] + list[i-1]) //index at [i-2] == 0 + [i-1] == 1
        }
    }
    println(list)
}

