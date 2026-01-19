package com.gmail.wizaripost.vk_team_bot.config
import org.slf4j.Logger
import org.slf4j.LoggerFactory
interface Loggable {
    fun getLogger(): Logger = LoggerFactory.getLogger(this.javaClass)
}