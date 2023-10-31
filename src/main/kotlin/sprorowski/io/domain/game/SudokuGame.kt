package sprorowski.io.domain.game

import java.util.*

class SudokuGame(private val board: Array<IntArray>) {
    private val random = Random(System.currentTimeMillis())

    fun generateGame(difficulty: Game.Difficulty): Array<IntArray> {
        val gameBoard = Array(9) { board[it].clone() }

        when (difficulty) {
            Game.Difficulty.EASY -> removeNumbersFromGrid(gameBoard, 30)
            Game.Difficulty.MEDIUM -> removeNumbersFromGrid(gameBoard, 45)
            Game.Difficulty.HARD -> removeNumbersFromGrid(gameBoard, 60)
        }

        return gameBoard
    }

    private fun removeNumbersFromGrid(board: Array<IntArray>, numToRemove: Int) {
        val cellsToRemove = numToRemove
        val emptyCell = 0
        for (i in 0 until cellsToRemove) {
            var row: Int
            var col: Int
            do {
                row = random.nextInt(9)
                col = random.nextInt(9)
            } while (board[row][col] == emptyCell)

            board[row][col] = emptyCell
        }
    }
}
