package sprorowski.io.plugins

import io.ktor.server.application.*
import io.ktor.server.routing.*
import sprorowski.io.presenter.http.routes.game.gameRoute

fun Application.configureRouting() {
    routing {
        gameRoute()
    }
}
