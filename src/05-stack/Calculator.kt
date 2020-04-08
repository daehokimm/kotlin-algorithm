package stack

import java.util.*

/**
 * 후위 수식 계산기
 */
fun main() {
    val tc = listOf(
        "1 2 +",
        "1 2 3 * +",
        "1 2 + 3 -"
    )

    for (input in tc) {
        val inputList = input.split(" ")
        val stack = Stack<String>()

        inputList.forEach {
            var result = 0
            var isOperated = true
            when (it) {
                "+" -> result = stack.pop().toInt() + stack.pop().toInt()
                "-" -> result = stack.pop().toInt() - stack.pop().toInt()
                "*" -> result = stack.pop().toInt() * stack.pop().toInt()
                "/" -> result = stack.pop().toInt() / stack.pop().toInt()
                else -> {
                    isOperated = false
                    stack.push(it)
                }
            }

            if (isOperated)
                stack.push(result.toString())
        }

        println(stack.pop())
    }
}