fun main(args: Array<String>)
{
    val runners = mutableMapOf<String, Int>()

    for (i in 1..3) {
        print("Enter the name of runner $i: ")
        val name = readLine() ?: ""

        print("Enter the time (in minutes) for runner $i: ")
        val time = readLine()?.toInt() ?: 0

        runners[name] = time
    }
    val sortedRunners = runners.toList().sortedBy { (_, time) -> time }.toMap()

    println("The runners finished in the following order:")
    sortedRunners.forEach { (name, _) ->
        println("- $name")
    }
}
