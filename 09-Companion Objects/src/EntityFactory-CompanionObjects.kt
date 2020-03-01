/* 09-Companion Objects, 1:45:06 in video*/
/* This file is new as of the 09-Companion Objects Module*/
interface IdProvider {
    fun getId() = "default string value"
}

//class Entity private constructor (val id: String) { /*This line is private to this class, and will not be usable in the main until the companion objects are created*/
class Entity private constructor(val id:String) { /*Cleaner way to do above line for java/kotlin interoperability*/

    companion object Factory : IdProvider {  /*Companion Object created. Factory was added after cleaned up line of code in main was added, in order to make kotlin/java interops easier to read.*/
        override fun getId() : String {
            return "123 -- which is the overridden text output from the fun getId() interface referenced from within the companion object."
        }

        const val id = "id2 -- which is output from const val id in regards to fun create() Companion Object."

        fun create() = Entity (id) /*When I started typing "id", it auto populated the greyed out feature. Typing this manually in IDE does not work with compiler. (getid) is the equivalent of (id) in this line in the updated code as compared to the video.*/
        /* The id reference makes sense coming from a java perspective for static fields */
    }
}