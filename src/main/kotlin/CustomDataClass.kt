import kotlin.properties.Delegates

// 코틀린이 권장하는 dto 구현방식
data class CustomDataClass(
    val age: Int,
){
    var name: String by Delegates.observable("default") { _, _, new ->
        println("name이 $new 로 변경되었습니다.")
    }
}



val valMutableList = mutableListOf<Int>()
var varlist : List<Int> = listOf()

fun main() {
    valMutableList.add(1)
    varlist = (varlist + 1)

    println(valMutableList)
    println(varlist)
}
