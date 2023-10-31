package sprorowski.io.application.game.create

import sprorowski.io.application.CommandHandler
import sprorowski.io.domain.game.Board
import sprorowski.io.domain.game.Game


class CreateGameCommandHandler (): CommandHandler<CreateGameCommand, Unit> {
    override suspend fun handle(command: CreateGameCommand) {
    }
}