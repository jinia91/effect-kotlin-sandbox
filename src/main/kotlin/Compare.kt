fun main() {
    data class NonComparable(val value: Int, val value2: Int)

    val list = listOf(NonComparable(3, 2), NonComparable(2,3), NonComparable(1, 2), NonComparable(3, 3))
    println(list.sortedBy { it.value })
}