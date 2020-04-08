package queue

import kotlin.system.exitProcess


/**
 * 배열로 Queue 만들기
 * - 리얼월드 알고리즘 2장 연습문제 2번
 */

const val PUSH = "push"
const val POP = "pop"
const val ARRAY_SIZE = 10

fun main() {
    val array = arrayOfNulls<Int>(ARRAY_SIZE)
    var head = 0
    var tail = 0

    loop@ while (true) {
        val input = readLine()!!.split(" ")

        when (input[0]) {
            PUSH -> {
                val value = input[1].toInt()

                if (array[tail] != null) {
                    println("QUEUE IS FULL!!!")
                    continue@loop
                }

                array[tail] = value
                tail = (tail + 1) % ARRAY_SIZE
            }
            POP -> {
                if (array[head] == null) {
                    println("QUEUE IS EMPTY!!!")
                    continue@loop
                }

                array[head] = null
                head = (head + 1) % ARRAY_SIZE
            }
            else -> {
                println("CLOSE PROGRAM")
                exitProcess(0)
            }
        }

        showCurrentState(array, head, tail)
    }
}

private fun showCurrentState(array: Array<Int?>, head: Int, tail: Int) {
    array.forEach {
        if (it != null) {
            print("$it|\t")
        } else {
            print("_|\t")
        }
    }
    println()

    for (idx in array.indices) {
        if (idx == head)
            print("h")

        if (idx == tail)
            print("t")

        if (idx != head && idx != tail)
            print("_")
        print("|\t")
    }
    println()
    println()
}