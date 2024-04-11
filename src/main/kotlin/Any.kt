import java.util.Objects

fun main() {
    val a = Any()
    val b = Object()
    println(a.javaClass == b.javaClass)
}