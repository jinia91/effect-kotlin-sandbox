data class SampleDataClass(val value: Int, val value2: Int)

class SampleService{
    fun doSomething(){
        val sampleDataClass = SampleDataClass(1, 2)
        sampleDataClass.doSomething()
//        sampleDataClass::doSomething
        sampleDataClass.doSomething2()
        sampleDataClass::doSomething2
        println("doSomething")
    }

    fun SampleDataClass.doSomething(){
        println("SampleDataClass doSomething")
    }
}

fun SampleDataClass.doSomething2() {
    println("SampleDataClass doSomething2")
}