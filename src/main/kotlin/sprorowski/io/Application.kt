package sprorowski.io

import io.ktor.server.application.*
import org.koin.dsl.module
import org.koin.ktor.plugin.Koin
import sprorowski.io.application.game.create.CreateGameCommandHandler
import sprorowski.io.plugins.*

fun main(args: Array<String>) {
    io.ktor.server.netty.EngineMain.main(args)
}

fun Application.module() {
    configureRouting()
    install(Koin){
        modules(module{
            single { CreateGameCommandHandler() }
        })
    }
}
