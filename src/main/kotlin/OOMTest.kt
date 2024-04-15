class TestClass {
    fun test() {
        val block = {
        val message = "${this::class::simpleName}"
            throw IllegalArgumentException(message)
        }
        logError.add(block)
    }

    companion object {
        var logError: MutableList<(() -> Unit)?> = mutableListOf()
    }
}

class TestClass2 {
    fun test() {
        val message = "${this::class::simpleName}"
        val block = {
            throw IllegalArgumentException(message)
        }
        logError.add(block)
    }

    companion object {
        var logError: MutableList<(() -> Unit)?> = mutableListOf()
    }
}



fun main() {
    for (i in 1..10000) {
        val test = TestClass()
        val test2 = TestClass2()
        test.test()
        test2.test()
    }
    // 프로그램을 종료하지 않고 대기
    Thread.sleep(1000000)
}
