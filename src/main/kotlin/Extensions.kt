abstract class WorkShop(val a: Int = 0, val b: Int = 0) {
    open fun doWork() {
        println("WorkShop doWork")
    }

    abstract fun doWorkTwice()
}


class WorkShop2 : WorkShop() {
    override fun doWorkTwice() {
        println("WorkShop2 doWork2")
    }
}

fun WorkShop2.doWorkTwice() {
    doWork()
    doWork()
}

fun WorkShop.doWork() {
    println("WorkShop doWork")
}


fun main() {
    val workShop = WorkShop2()
    workShop.doWorkTwice()
    workShop.doWork()
}