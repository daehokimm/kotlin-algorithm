package forStatement

import java.util.*

/**
 * 2439
 */
fun main() {
    val size = Scanner(System.`in`).nextInt()

    for (i in 1..size) {
        println(" ".repeat(size - i) + "*".repeat(i))
    }
}