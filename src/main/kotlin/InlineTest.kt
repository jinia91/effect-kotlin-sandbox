fun nonInline(block: () -> Unit) {
    println("1")
    block()
    println("2")
}

inline fun inline(block: () -> Unit) {
    println("1")
    block()
    println("2")
}

inline fun inline3(
    crossinline block: () -> Unit,
    noinline block2: () -> Unit,
    block3: () -> Unit
) {
    block()
    block2()
    block3()
}

inline fun <reified T> printType() {
    val type = T::class.simpleName
    println(type)
}

fun main() {
    inline3(
        { printType<Int>() },
        { printType<Int>() },
        { return printType<Int>() }
    )
}