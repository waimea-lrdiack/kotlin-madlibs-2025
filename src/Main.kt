fun main() {
    println("WELCOME TO MADLIBS")
    println("We are going to write a story!")
    var name = getString("Enter a name for our first character: ")
    var gender = getString("Is $name a 'he', 'she' or 'they': ")
    var name2 = getString("Enter a name for our second character: ")
    var verbEndingInIng = getString("Enter a verb ending in ing: ")
    var verbEndingInEd = getString("Enter a verb ending in ed: ")
    var thing = getString("Enter an object: ")
    var animal = getString("Enter an animal: ")

    println("Okay here is the story")
    println()
    println("$name was walking down the road when $gender bumped into $name2 who was $verbEndingInIng a $thing")
    println("'Why are you doing that' asked $name while he $verbEndingInEd")
}
/**
 * This is the string prompt function (for collecting flipping strings)
 */

fun getString(prompt: String): String {
    var userInput: String

    while(true) {
        print(prompt)

        userInput = readln()
        if (userInput.isNotBlank()) break
    }

    return userInput
}