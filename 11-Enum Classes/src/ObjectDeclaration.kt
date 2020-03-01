/* 11-Enum Classes, 1:52:41 in video*/
object EntityFactory2 {
    fun create2() = Entity2 ("id2", "name -- comes from ObjectDeclaration.kt")
}

class Entity2(val id2: String, val name: String) {
    override fun toString(): String {
        return "id2:$id2, name:$name"
    }
}