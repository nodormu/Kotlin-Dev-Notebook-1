/* 06-Interfaces*/
/* Introduces abstract class briefly.*/
/* IMPORTANT Do NOT try to implement BOTH fun overrides from this part and part 2 in this. This is why the files were separated into parts. Choose one of the other for the sake of learning how these can be implemented in different places.*/
/* View this file along side same file from Part 2 for comparison */
interface PersonInfoProvInterface {
    val providerInfo:String /* You can NOT assign '=' default String values in interface parameters. You will get a compiler error. Assigning them in classes and functions within them is fine, as well as functions in the main.*/
    fun printInfo (person: PersonClass) {
        println(providerInfo) /*Original text was println("basicInfoProvider). Try swapping it out here and in line 18 to test different implementations WITHOUT encapsulation.*/
    }
}


class BasicInfoProvider:PersonInfoProvInterface { /*Created a class that uses the interface file we are in. It becomes an empty class when methods are defined in public interface parameters.*/
/*abstract class BasicInfoProvider:PersonInfoProvInterface /*Abstract means it does not have to implement all the methods the interface includes, but also can NOT be instanciated*/*/
    /*The implementation in the overridden methodology across the next 4 lines can be made public in the interface parameters.*/
    override fun printInfo(person: PersonClass) { /*Without override, you get compile error of missing supertype, aka override in this case.*/
        println(providerInfo) /*Try swapping out "basicInfoProvider for providerInfo*/
        person.printInfo() /*as a result, the output reprints println("$firstname ($nicknameToPrint) $lastname") from the PersonClass.kt file in the main.kt a second time, as the first instance outputs class.*/
        println("basicInfoProvider text outputted 3 lines above comes from the interface file's class method parameters.") /*Since I'm using the actual main.kt, this is an output reference after build/run of main.kt*/
    }
    override val providerInfo: String
        get() = "basicInfoProvider (This comes from the class override, that is overriding the encapsulated val providerInfo:String in the interface public parameters.)"
}