package `if`

import java.util.*

/**
 * 2884
 */
fun main() {
    val sc = Scanner(System.`in`)

    val hour = sc.nextInt()
    val minute = sc.nextInt()

    var resultHour = if (minute < 45) hour - 1 else hour
    val resultMinute = if (minute < 45) 60 - (45 - minute) else minute - 45

    resultHour = if (resultHour < 0) 24 + resultHour else resultHour

    println("$resultHour $resultMinute")
}