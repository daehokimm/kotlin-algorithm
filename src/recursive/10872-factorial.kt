package recursive

import java.util.*

fun main() {
    val times = Scanner(System.`in`).next().toInt()
    println(recursiveFactorial(times))
}

fun recursiveFactorial(current: Int): Int {
    if (current == 0)
        return 1
    return current * recursiveFactorial(current - 1)
}