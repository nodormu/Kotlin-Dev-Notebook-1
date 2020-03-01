import java.util.*

enum class Entity3Type {
    EASY, MEDIUM, HARD;
    fun getFormattedName() = name.toLowerCase().capitalize() /*function to change capitalization of output by name2:*/
}

object EntityFactory3 {
    fun create3(type: Entity3Type):Entity3 {
        val id3 = UUID.randomUUID().toString()
        val name2 = when (type){
            Entity3Type.EASY -> type.getFormattedName()    /* Instead of hard coding as "Easy", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
            Entity3Type.MEDIUM -> type.getFormattedName()    /* Instead of hard coding as "Medium", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
            Entity3Type.HARD -> type.getFormattedName()    /* Instead of hard coding as "Hard", we can reference the entity types directly, and just use a function in the enum class to correct the capitalization.*/
        }
        return Entity3(id3, name2)
    }
}


class Entity3(val id3: String, val name: String) {
    override fun toString(): String {
        return "id3:$id3, name2:$name"
    }
}