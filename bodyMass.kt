import kotlin.math.*
fun main(args: Array<String>)
{
    println("Enter your height in inches: ")
    var height = Integer.valueOf(readLine())
    println("Enter how much you weight in pounds: ")
    var weight = Integer.valueOf(readLine())
    var height2 = Math.pow(height.toDouble(), 2.toDouble())
    var bmi = weight * 703 / height2
    if (bmi < 18.5)
        println("You are underweight.")
    if (bmi > 25)
        println("You are overweight.")
    if (bmi > 18.5 && bmi < 25)
        println("Your BMI is optimal.")

}
