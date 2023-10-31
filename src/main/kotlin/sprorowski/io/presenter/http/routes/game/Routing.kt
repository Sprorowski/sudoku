package sprorowski.io.presenter.http.routes.game

import io.ktor.http.*
import io.ktor.server.application.*
import io.ktor.server.response.*
import io.ktor.server.routing.*
import org.koin.ktor.ext.inject
import sprorowski.io.application.game.create.CreateGameCommand
import sprorowski.io.application.game.create.CreateGameCommandHandler
import sprorowski.io.domain.game.Board
import sprorowski.io.domain.game.Game

fun Route.gameRoute() {
    val creator: CreateGameCommandHandler by inject()

    route("/game") {
        post {
            val command = CreateGameCommand(Game.Difficulty.EASY)

            call.respond(HttpStatusCode.OK, Board.create().toString())
        }
    }
}
