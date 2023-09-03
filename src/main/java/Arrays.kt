class ContraVariant<in T> {
    fun foo(foo : T) {
        println(foo)
    }
}


val ContraVariant1 = ContraVariant<Number>()
val ContraVariant2: ContraVariant<Int> = ContraVariant1