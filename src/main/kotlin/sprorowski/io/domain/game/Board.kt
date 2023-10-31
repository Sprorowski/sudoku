package sprorowski.io.domain.game
class Board(private val matrix: Array<IntArray>) {
    companion object {
        fun create(): Board {
            val sudokuGenerator =  SudokuGenerator();
            return Board(sudokuGenerator.generateSudoku())
        }
    }

    override fun toString(): String {
        val stringBuilder = StringBuilder()
        for (i in 0 until 9) {
            for (j in 0 until 9) {
                stringBuilder.append(matrix[i][j])
                if (j < 8) {
                    stringBuilder.append(' ')
                }
            }
            stringBuilder.append('\n')
        }
        return stringBuilder.toString()
    }
}
