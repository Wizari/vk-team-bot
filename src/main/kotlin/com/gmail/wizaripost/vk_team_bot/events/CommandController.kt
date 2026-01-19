package com.gmail.wizaripost.vk_team_bot.events


interface CommandController {
    fun valid(command: String): Boolean
    fun execute(chatId: String, userId: String)
}