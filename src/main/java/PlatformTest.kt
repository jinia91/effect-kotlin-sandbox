fun main() {
    val clazz = SampleJavaClass()
    clazz.sample?.length

    val clazz2 = SampleJavaClass2()
    val clazzSample = clazz2.sample

    println(clazzSample.length)
}