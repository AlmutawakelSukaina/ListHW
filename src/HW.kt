fun main(){

//First Question

    val list=listOf("Yellow","Green","White","Blue")
    for((index,element) in list.withIndex())
            println("The element at $index is $element ")
    println()

 //Second Question

    println(list.first())
    println(list.last())
    println()
 //Third Question

    val list1= listOf(8,4,7,1,2,30,5,6)

    val l= list1.sortedDescending()
    for(i in l) print("$i  ")
    println()

    val l2= list1.sorted()
    for(i in l2) print("$i  ")

}