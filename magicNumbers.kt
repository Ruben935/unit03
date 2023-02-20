fun main(args: Array<String>)
{
    println("Enter an integer for month: ")
    var month = Integer.valueOf(readLine())
    println("Enter an integer for day: ")
    var day = Integer.valueOf(readLine())
    println("Enter a 2 digit integer for year: ")
    var year = Integer.valueOf(readLine())

    if (month * day == year)
        println("The date is magic!")
    else
        println("The date is not magic.")

}
