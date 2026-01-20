package com.gmail.wizaripost.vk_team_bot.service

interface MessageSender {
    fun send(payload: String) {}
}