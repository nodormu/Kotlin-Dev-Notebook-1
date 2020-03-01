import makevaraibleanimport as makevaraibleanimport1

val defaultglobal = "Look how you can specify what is called a default global variable OUTSIDE the main. Neato!, but specify import as <name> if you want to call it that way."
val purpleletters =  "Don't mind the purple letters in the IDE, but right click for more context suggestions, but keep in mind with purple, the suggestions may not be valid for your implementation."
val makevaraibleanimport = "Look how you can make a variable an import for other classes since it's global, and then call the global import assignment instead of the variable, but it HAS to be the same name with a number after it."

fun main() {
    var def = "var CAN be reassigned and is a mutable variable."
    val nope = "val can NOT be reassigned and is an immutable variable."
    var name:String? = "Hello, this is not null, but can be later on since there is a ? after String, and also because you specified, other wise the null doesn't work, such as with var `name = null`."
    var takeaway = "Now do you see how powerful Kotlin is, as well as how intelligently designed the compiler is?"
    var dontforget = "Don't forget to right click if you are in IDE for other alternative context suggestions for other implementations..)"
    var testnull:String? = null /*This is how you HAVE to notate a null value. the type of val must be specified with a ?*/
    var ifelse = "This would only output if variable was set with String?, otherwise the code errors out. You have to specify String? for any possibility of having a null since non-null is default."
    println(name)
    name = null + " " + "--And look how you can tag multiple strings after the null with the plus symbol! It HAS to be specified String?."
    println(def)
    println(nope)
    println(name)
    println(message = takeaway)
    println(dontforget)
    println(message = testnull)
    println(defaultglobal)
    println(purpleletters)
    println(makevaraibleanimport1)
    /*typical if else statement like in C*/
    if (testnull != null) {
        println(testnull)
    }
    else {
        println(ifelse)
    }
    /*condensed if else statement written with in the variable declaration*/
    val nulltest2:String = if (testnull != null) testnull else "hi, not null. Don't forget null has to specified as variable of type `String?`."
    println(nulltest2)
    /*option of when statement*/
    val nulltest3:String = when (testnull) {
        null -> "hi, I'm null, so this is the string output I typed, otherwise it would have output the result of nulltest2."
        else -> nulltest2
    }
    println(nulltest3)
    /*End of when statement, Notice that it's opposite of how null works in if statement, aka != vs =.*/
}

/*above code that is commented out shows how you can:
1) output text to the screen with println call function that is built in as a public function in kotlin.
2) the 2 different kinds of variables, as well as
condensed coding defaults expressing how you don't have to specify strings types.
3) also shows that if you want a null value assigned to a string you HAVE to specify the String
type, with a "?" in order for it to accept the value. Note that the below code WITH message =
outputs the original null assignment AND the altered value afterwards in it's top down approach.
4) If you choose not to output the changed value as below, it will output null to the terminal
5) This IDE as well as Android's official IDE will auto suggest other options such as `also` and `apply` options.
Right clicking on the underlined, and clicking on show context options, shows you these options and any others.
6) There is an option to define the function that is out putted to specify that it is a message, but in this context
does the same thing as not have message =.
7) Right clicking on println shows you other context options as well. Experiment with them.
8) If you DON'T assign the "?" to the String? then you do NOT have an option of converting to Null later in this context.
9) Be sure you look at the global import declaration if needed for other classes.
10) 2 different types of if else statements listed.
11) If/Else and When statements have opposing roles for handling null values, aka != vs =
12) This is the command used by the IDE to process the kotlin compiling as of 2/4/2020
/snap/intellij-idea-educational/16/jbr/bin/java -javaagent:/snap/intellij-idea-educational/16/lib/idea_rt.jar=34473:/snap/intellij-idea-educational/16/bin -Dfile.encoding=UTF-8 -classpath /home/moyom/IdeaProjects/01-HelloKotlin/out/production/01-HelloKotlin:/snap/intellij-idea-educational/16/plugins/Kotlin/kotlinc/lib/kotlin-stdlib.jar:/snap/intellij-idea-educational/16/plugins/Kotlin/kotlinc/lib/kotlin-reflect.jar:/snap/intellij-idea-educational/16/plugins/Kotlin/kotlinc/lib/kotlin-test.jar:/snap/intellij-idea-educational/16/plugins/Kotlin/kotlinc/lib/kotlin-stdlib-jdk7.jar:/snap/intellij-idea-educational/16/plugins/Kotlin/kotlinc/lib/kotlin-stdlib-jdk8.jar MainKt
 */