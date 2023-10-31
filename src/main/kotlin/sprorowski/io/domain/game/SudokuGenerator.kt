package sprorowski.io.domain.game

class SudokuGenerator {
    fun generateSudoku(): Array<IntArray> {
        val board = Array(9) { IntArray(9) }
        fillBoard(board)
        return board
    }

    private fun fillBoard(board: Array<IntArray>): Boolean {
        for (row in 0 until 9) {
            for (col in 0 until 9) {
                if (board[row][col] == 0) {
                    val possibilities = getValidEntries(board, row, col).shuffled()
                    if (possibilities.isEmpty()) {
                        return false
                    }
                    for (num in possibilities) {
                        board[row][col] = num
                        if (fillBoard(board)) {
                            return true
                        }
                        board[row][col] = 0
                    }
                    return false
                }
            }
        }
        return true
    }

    private fun getValidEntries(board: Array<IntArray>, row: Int, col: Int): List<Int> {
        val possibilities = (1..9).toMutableList()
        for (i in 0 until 9) {
            possibilities.remove(board[row][i])
            possibilities.remove(board[i][col])
        }
        val startRow = row / 3 * 3
        val startCol = col / 3 * 3
        for (i in startRow until startRow + 3) {
            for (j in startCol until startCol + 3) {
                possibilities.remove(board[i][j])
            }
        }
        return possibilities
    }
}
