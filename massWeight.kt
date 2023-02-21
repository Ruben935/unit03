fun main(args: Array<String>)
{
    println("Enter the mass of the object: ")
    var mass = Integer.valueOf(readLine())
    var weight = mass * 9.8
    if (mass > 1000)
        println("The object is too heavy.")
    if (mass < 10)
        println("The object is too light.")

}
