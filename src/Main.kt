fun main() {
    println("WELCOME TO MADLIBS")
    println("We are going to write a story!")

    var name = getString("Enter a name for our first character: ")

    var gender = getString("Is $name a 'he', 'she' or 'they': ")
    var name2 = getString("Enter a name for our second character: ")
    var verbEndingInIng = getString("Enter a verb ending in ing: ")
    var verbEndingInEd = getString("Enter a verb ending in ed: ")
    var thing = getString("Enter an object: ")
    var animal  = getString("Enter an animal: ")
    var saying = getString("Enter something to say: ")

    println("Okay here is the story")
    println()
    println("$name was walking down the road when $gender saw $name2 $verbEndingInIng a $animal so he attacked $name2 with a $thing")
    println("$name then $verbEndingInEd $name2 which cast a magical spell turning $name2 into a $animal")
    println("$saying said $name")
}
/**
 * This is the string prompt function (for collecting strings)
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