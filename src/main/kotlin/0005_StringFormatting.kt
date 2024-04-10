fun main(args: Array<String>) {
    val name = if (args.size > 0) args[0] else "Kotlin"
    println("Hello, $name!")

    //Uses the ${} syntax to insert the first element of the args array
    val args1 = arrayOf("Kotlin Args")
    if (args1.size > 0) {
        println("Hello, ${args1[0]}!")
    }
}