package recursive

import java.util.*
import kotlin.math.pow

val traceList = arrayListOf<String>()

fun main() {
    val weight = Scanner(System.`in`).nextInt()

    println("${2.0.pow(weight).toInt() - 1}")
    hanoi(weight, 1, 3, 2)

    traceList.forEach { println(it) }
}

fun hanoi(weight: Int, from: Int, to: Int, via: Int) {
    if (weight == 1) {
        move(from, to)
        return
    }
    hanoi(weight - 1, from, via, to)
    move(from, to)
    hanoi(weight - 1, via, to, from)
}

fun move(from: Int, to: Int) {
    traceList.add("$from $to")
}