package recursive

import java.util.*

val sb = StringBuilder()
var count = 0

fun main() {
    val weight = Scanner(System.`in`).nextInt()
    hanoi(weight, 1, 2, 3)

    println(count)
    println(sb.toString())
}

fun hanoi(weight: Int, from: Int, via: Int, to: Int) {
    count++
    if (weight == 1) {
        sb.append("$from $to\n")
        return
    }
    hanoi(weight - 1, from, to, via)
    sb.append("$from $to\n")
    hanoi(weight - 1, via, from, to)
}