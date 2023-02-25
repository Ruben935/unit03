fun main(args: Array<String>)
{
    println("Enter a name: ")
    val name1 = readLine()
    println("Enter another name: ")
    val name2 = readLine()
    println("Enter one more name: ")
    val name3 = readLine()

    val names = arrayOf(name1, name2, name3)
    names.sort()
    for(name in names)
        println(name)
}
