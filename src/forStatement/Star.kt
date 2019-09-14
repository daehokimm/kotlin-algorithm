package forStatement

import java.util.*

/**
 * 2439
 */
fun main() {
    val size = Scanner(System.`in`).nextInt()

    for (i in size downTo 1) {
        printStar(i, size)
    }
}

fun printStar(idx: Int, size: Int) {
    for (i in 1 until idx)
        print(" ")
    for (j in idx..size)
        print("*")
    println()
}