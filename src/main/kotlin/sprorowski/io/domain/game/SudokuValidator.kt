package sprorowski.io.domain.game

class SudokuValidator(private val board: Array<IntArray>) {
    fun isValidMove(row: Int, col: Int, num: Int): Boolean {
        return isRowValid(row, num) && isColumnValid(col, num) && isSubgridValid(row, col, num)
    }

    private fun isRowValid(row: Int, num: Int): Boolean {
        for (col in 0 until 9) {
            if (board[row][col] == num) {
                return false
            }
        }
        return true
    }

    private fun isColumnValid(col: Int, num: Int): Boolean {
        for (row in 0 until 9) {
            if (board[row][col] == num) {
                return false
            }
        }
        return true
    }

    private fun isSubgridValid(row: Int, col: Int, num: Int): Boolean {
        val subgridStartRow = row - row % 3
        val subgridStartCol = col - col % 3
        for (i in subgridStartRow until subgridStartRow + 3) {
            for (j in subgridStartCol until subgridStartCol + 3) {
                if (board[i][j] == num) {
                    return false
                }
            }
        }
        return true
    }
}
