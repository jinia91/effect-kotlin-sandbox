import org.openjdk.jol.info.ClassLayout

class JustWrapper{}

class JustWrapper2{
    val a : Int? = 1
}

class JustWrapper3{
    val a : Int = 1
    val b : Int? = 2
}


fun main() {
    println(ClassLayout.parseClass(JustWrapper::class.java).toPrintable())
    println(ClassLayout.parseInstance(JustWrapper()).toPrintable())
    println(ClassLayout.parseClass(Int::class.java).toPrintable())
    println(ClassLayout.parseInstance(1).toPrintable())
    println(ClassLayout.parseClass(JustWrapper2::class.java).toPrintable())
    println(ClassLayout.parseInstance(JustWrapper2()).toPrintable())
    println(ClassLayout.parseClass(JustWrapper3::class.java).toPrintable())
    println(ClassLayout.parseInstance(JustWrapper3()).toPrintable())
}