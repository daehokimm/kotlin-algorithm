package forStatement

import java.io.BufferedReader
import java.io.InputStreamReader

/**
 * 10951
 */
fun main() {
    val bufferedReader = BufferedReader(InputStreamReader(System.`in`))

    while (true) {
        val readLine = bufferedReader.readLine()?:break
        println("${readLine.split(" ").map { it.toInt() }.sum()}")
    }
}