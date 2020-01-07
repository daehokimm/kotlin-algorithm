package stack

import java.util.*

/**
 * 9012 번
 * https://www.acmicpc.net/problem/9012
 */
const val OPEN = "("
const val CLOSE = ")"
const val YES = "YES"
const val NO = "NO"

fun main() {
    val case = readLine()!!.toInt()
    for (stg in 1..case) {
        val stack = Stack<String>()
        var isShortCircuitFail = false;

        readLine()!!
            .split("")
            .forEach {
                when (it) {
                    OPEN -> stack.push(it)
                    CLOSE -> {
                        if (stack.isEmpty()) {
                            isShortCircuitFail = true
                        } else {
                            stack.pop()
                        }
                    }
                }
            }

        if (stack.isEmpty() && !isShortCircuitFail) {
            println(YES)
        } else {
            println(NO)
        }
    }
}