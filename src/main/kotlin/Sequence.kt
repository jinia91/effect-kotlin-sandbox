import kotlin.text.Typography.prime


val sPrimes2 = sequence {
    var numbers = generateSequence(2) { it + 1 } // 2부터 시작하는 무한 숫자 시퀸스 할당
    println("thread: ${Thread.currentThread().id}")

    var prime : Int // val prime 계속할당하는게 낭비같은데? 한번할당하고 재사용해보자! <----
    while (true) {
        prime = numbers.first() // 무한 시퀸스에서 첫번째 숫자
        yield(prime) // 해당 숫자 선택(시퀸스 결과값에 포함)
        numbers = numbers.drop(1) // 해당 숫자 제거하고
            .filter {
                println("thread: ${Thread.currentThread().id} $it , $prime")
                it % prime != 0
            } // 제거된 무한숫자 numbers에서 해당 숫자로 나뉠때 나누어 떨어지지 않는 숫자만 추출해서 무한숫자 시퀸스에 재할당
    }
}

fun main() = println(sPrimes2.take(10).toList())

//
//val sPrimes = sequence {
//    var numbers = generateSequence(2) { it + 1 } // 2부터 시작하는 무한 숫자 시퀸스 할당
//    var lcnt : Int = 0
//    var cnt : Int = 0
//
//    while (true) {
//        val prime = numbers.first() // 무한 시퀸스에서 첫번째 숫자
//        yield(prime) // 해당 숫자 선택(시퀸스 결과값에 포함)
//        numbers = numbers.drop(1) // 해당 숫자 제거하고
//            .filter {
//                it % prime != 0
//            } // 제거된 무한숫자 numbers에서 해당 숫자로 나뉠때 나누어 떨어지지 않는 숫자만 추출해서 무한숫자 시퀸스에 재할당
//    }
//}
//
//
//fun main() = println(sPrimes.take(10).toList()) // yield 로 산출되는 결과값이 10개가 나올때까지 시퀸스 실행 - cnt: 244


//fun main() {
//    var numbers = (2..100).toList()
//    val primes = mutableListOf<Int>()
//    var cnt: Int = 0
//
//    while (numbers.isNotEmpty()) {
//        val first = numbers.first()
//        primes.add(first)
//        numbers = numbers.filter {
//            println("target: $it , prime: $prime, cnt: ${++cnt}")
//            it % first != 0
//        }
//    }
//    println(primes)
//}  // 436