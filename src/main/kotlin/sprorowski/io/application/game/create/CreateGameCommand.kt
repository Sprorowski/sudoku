package sprorowski.io.application.game.create

import sprorowski.io.application.Command
import sprorowski.io.domain.game.Game


data class CreateGameCommand (
    val difficulty: Game.Difficulty

): Command<Unit>