package bruteforce

const val CHESS_BOARD_SIZE = 8
const val BLACK = "B"

fun main() {
    val input = readLine()!!.split(" ")
    val h = input[0].toInt()
    val w = input[1].toInt()
    val board = Array(h) { IntArray(w) }

    for (y in 0 until h) {
        val line = readLine()!!
        for (x in 0 until w) {
            if (line[x].toString() == BLACK) {
                board[y][x] = 1
            } else {        // == WHITE
                board[y][x] = 0
            }
        }
    }

    var min = Int.MAX_VALUE
    for (y in 0..(h - CHESS_BOARD_SIZE)) {
        for (x in 0..(w - CHESS_BOARD_SIZE)) {
            var value = board[y][x]
            var count = 0

            // Slice board as [8 x 8]
            for (i in 0 until 8) {
                for (j in 0 until 8) {
                    if (value % 2 != board[y + i][x + j]) {
                        count++
                    }
                    value++ // next value has to be different with current value.
                }
                value++ // next line's first value has to be same with current line's last value
            }

            // when re-painting block is over the half of whole blocks : reverse
            if (count > (CHESS_BOARD_SIZE * CHESS_BOARD_SIZE / 2)) {
                count = (CHESS_BOARD_SIZE * CHESS_BOARD_SIZE) - count
            }
            if (count < min) {
                min = count
            }
        }
    }
    print(min)
}