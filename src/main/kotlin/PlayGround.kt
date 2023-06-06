import java.io.BufferedReader
import kotlin.math.roundToInt

fun main() {
    val br = BufferedReader(System.`in`.reader())
    val n = br.readLine().toInt()
    if(n == 0) {
        println(0)
        return
    }
    val scores = mutableListOf<Int>()
    for(i in 1 .. n){
        scores.add(br.readLine().toInt())
    }
    scores.sort()
    val m = (n.toFloat() * 15f / 100f).roundToInt()
    val targetScore = scores.subList(m, scores.size-m)
    println((targetScore.sum().toFloat() / targetScore.size.toFloat()).roundToInt())
}