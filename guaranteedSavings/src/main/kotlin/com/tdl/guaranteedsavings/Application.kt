package com.tdl.guaranteedsavings

import com.tdl.guaranteedsavings.config.Configuration
import com.tdl.guaranteedsavings.config.DBConfig
import com.tdl.guaranteedsavings.plugins.configureCallLogging
import com.tdl.guaranteedsavings.plugins.configureRouting
import com.tdl.guaranteedsavings.plugins.configureSerialization
import io.ktor.server.application.*

fun main(args: Array<String>): Unit =
    io.ktor.server.cio.EngineMain.main(args)

@Suppress("unused")
fun Application.module() {
    Configuration.initConfig(this.environment)
    configureSerialization()
    configureRouting()
    configureCallLogging()
    DBConfig.getDatabase()


}
