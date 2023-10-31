package sprorowski.io.domain.game

class Game(
    val id: Int,
    val difficulty: Difficulty,
    val gameMatrix: Board
){

    enum class Difficulty { EASY, MEDIUM, HARD }

    companion object {
        fun create(id: Int, difficulty: Difficulty, gameMatrix: Board) = Game(
            id = id,
            difficulty = difficulty,
            gameMatrix = gameMatrix
        )
    }
}