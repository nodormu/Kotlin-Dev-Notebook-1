/* 11-Enum Classes, 1:52:41 in video*/
/* This implements the methodology of the function from the previous part 1, that was implemented in the class as an override, but into the interface parameters instead.*/
/* super type override demonstrated here as well. */
/* The second if/else statement has BOTH RE-casting AND SMART-casting ways defined, one is commented out.*/
/* For this inheritance section, 'open' had to be added to class BasicInfoProvider on line 20 in order for fancyinfoprovider-inheritance to be able to inherit from the class.*/
interface PersonInfoProvInterface {
    val providerInfo:String /* You can NOT assign '=' default String values in interface parameters. You will get a compiler error. Assigning them in classes and functions within them is fine, as well as functions in the main.*/

    fun printInfo (person: PersonClass) {
//        println("basicInfoProvider") /*This is commented out due to next line of encapsulating fun providerInfo:String() for the override with the super.printInfo(person) in the next line.*/
        println(providerInfo) /*overridden in the class with super type. Original text in above line. Try swapping out text output for encapsulation and test*/
        person.printInfo() /*as a result, the output reprints println("$firstname ($nicknameToPrint) $lastname") from the PersonClass.kt file in the main.kt a second time, as the first instance outputs class.*/
    }
}

interface SessionInfoProvider {
    fun getSessionID():String
}

open class BasicInfoProvider:PersonInfoProvInterface, SessionInfoProvider { /*Created a class that uses the interface file we are in. It becomes an empty class when methods are defined in public interface parameters.*/

    //open val sessionIDPrefix = "Session" /* This is an option changed to improve inheritance, instead of hard-coding Session into the return on comment out line 33. Must be open for inheritance to work. */
    protected open val sessionIDPrefix = "Session" /* This option is so the public API in the IDE can not expose the sessionIDPrefix as an option in the main, but still keep it usable for inheritance. Good Security.*/

    override val providerInfo: String
        get() = "basicInfoProvider (This comes from the class override in PersonInfoProvInterface.kt file, that is overriding the encapsulated val providerInfo:String in the interface public methodology parameters.)"

    override fun printInfo(person: PersonClass) {
        super.printInfo(person)
        println("Additional text filler coming from class in PersonInfoProvInterface.kt file.")
    }

    override fun getSessionID(): String {
//        return "Session"
        return sessionIDPrefix
    }
}

/*The next two functions are IDENTICAL. Do NOT use both. They are 2 different versions, but output is IDENTICAL showing that Luke is a session provider in both versions.*/
/*This is typesetting section*/

/*This is the check if the instance of the infoProvider is also a SessionInfoProvider*/
//fun checkTypes(infoProvider:PersonInfoProvInterface) {
//    if (infoProvider is SessionInfoProvider) {
//        println("is a session info provider.")
//    }
//    else {
//        println("is NOT a session info provider.")
//    }
//}

/*This is the check if the instance of the infoProvider is NOT a SessionInfoProvider. Notice the reversal of the if/else statements, and is vs !is*/
fun checkTypes(infoProvider:PersonInfoProvInterface) {
    if (infoProvider !is SessionInfoProvider) {
        println("is NOT a session info provider (and comes from PersonInfoProvInterface.kt file).")
    }
    else {
        println("is a session info provider (and comes from PersonInfoProvInterface.kt file).")
        /*This is where typecasting example picks up, yes... in the else block of either if/else version. Use either line 57 or 58, NOT both, as they do the same thing a different way.*/
        //(infoProvider as SessionInfoProvider).getSessionID() /* RE-casting example to access information associated with SessionInfoProvider*/
        infoProvider.getSessionID() /*This is a feature built into the compiler called SMART casting to also access information associated with SessionInfoProvider*/
    }
}