/* 13-Data Classes, 2:07:01 in video*/
/* This section has been HEAVILY altered from the 11-Enum Class section, as it pertains to the 12-Sealed Class section*/
import java.util.*

enum class Entity3Type {
    HELP, EASY, MEDIUM, HARD;
    fun getFormattedName() = name.toLowerCase().capitalize() /*function to change capitalization of output by name2:*/
}

object EntityFactory3 {
    fun create3(type: Entity3Type): Entity3 {
        val id3 = UUID.randomUUID().toString()
        val name2  = when (type){
            Entity3Type.EASY -> type.name    /* Instead of hard coding as "Easy", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
            Entity3Type.MEDIUM -> type.getFormattedName()    /* Instead of hard coding as "Medium", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
            Entity3Type.HARD -> type.getFormattedName()    /* Instead of hard coding as "Hard", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
            Entity3Type.HELP -> type.getFormattedName() /*added via Sealed Classes section*/
        }
        return when (type) {
            Entity3Type.EASY -> Entity3.Easy(id3, name2)
            Entity3Type.MEDIUM -> Entity3.Medium(id3, name2)
            Entity3Type.HARD -> Entity3.Hard(id3, name2, 2f) /*When I started typing 2f, it added multiplier in the IDE, but when I type multiplier it doesn't like it.*/
            Entity3Type.HELP -> Entity3.Help
        }
    }
}

/*This class was altered HEAVILY from 11-Enum Class section*/
/*Note:  You can use multiple and different types of classes in a sealed class, as well as objects*/
sealed class Entity3 {  /*compiler can use smartcasting to apply different outcomes to each of these, but you can use different types of classes in this sealed class, not just data classes.*/
    object Help : Entity3 () { /*This body code has been added, because this object does not have a previous constructor defined for it, so it's added on the fly.*/
        val name4 : String = "Help. This line of text comes from EnumClass.kt."
    }
    data class Easy(val id: String, val name: String): Entity3()
    data class Medium(val id: String, val name: String): Entity3()
    data class Hard(val id: String, val name: String, val multiplier: Float): Entity3()  /*Added val multiplier to this last sealed data class, which as an example could be a difficulty multiplier, as would be in a game.*/
}