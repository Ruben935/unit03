fun main(args: Array<String>)
{
    println("Is anyone in your party a vegeterian? (Type: yes or no)")
    val answer1 = readLine()!!
    println("Is anyone in your party a vegan? (Type: yes or no)")
    val answer2 = readLine()!!
    println("Is anyone in your party gluten-free? (Type: yes or no)")
    val answer3 = readLine()!!


    if (answer1 == "yes" && answer3 == "yes" && answer3 == "yes")
        println("Here are your restaurant choices: \n\n\tThe Chef's Kitchen \n\tCorner Cafe")
    if (answer1 == "yes" && answer3 == "no" && answer3 == "yes")
        println("Here are your restaurant choices: \n\n\tMain Street Pizza Company")
    if (answer1 == "yes" && answer3 == "no" && answer3 == "no")
        println("Here are your restaurant choices: \n\n\tMama's Fine italian")
    if (answer1 == "no" && answer3 == "no" && answer3 == "no")
        println("Here are your restaurant choices: \n\n\tJoe's Gourment Burgers")


    if (answer1 == "Yes" && answer3 == "Yes" && answer3 == "Yes")
        println("Here are your restaurant choices: \n\n\tThe Chef's Kitchen \n\tCorner Cafe")
    if (answer1 == "Yes" && answer3 == "No" && answer3 == "Yes")
        println("Here are your restaurant choices: \n\n\tMain Street Pizza Company")
    if (answer1 == "Yes" && answer3 == "No" && answer3 == "No")
        println("Here are your restaurant choices: \n\n\tMama's Fine italian")
    if (answer1 == "No" && answer3 == "No" && answer3 == "No")
        println("Here are your restaurant choices: \n\n\tJoe's Gourment Burgers")


}
