package com.gmail.wizaripost.vk_team_bot.service

import org.springframework.stereotype.Service
import com.fasterxml.jackson.databind.ObjectMapper
import com.gmail.wizaripost.vk_team_bot.dto.Message
import com.gmail.wizaripost.vk_team_bot.dto.MessageNewObject

@Service
class BotService(
    private val vkTeamApiService: VkTeamApiService,
    private val objectMapper: ObjectMapper
) {

    fun handleMessage(message: Message, clientInfo: Map<String, Any>) {
        val text = message.text.toLowerCase().trim()
        val peerId = message.peerId

        when {
            text.startsWith("/start") || text.startsWith("привет") -> {
                val response = "Привет! Я бот на Spring Boot + Kotlin! 👋\n" +
                        "Доступные команды:\n" +
                        "/help - помощь\n" +
                        "/time - текущее время"
                vkTeamApiService.sendMessage(peerId, response)
            }

            text == "/help" -> {
                val response = "Я могу:\n" +
                        "1. Отвечать на приветствия\n" +
                        "2. Показывать время\n" +
                        "3. Эхо-сообщения"
                vkTeamApiService.sendMessage(peerId, response)
            }

            text == "/time" -> {
                val time = java.time.LocalDateTime.now()
                val response = "Текущее время: ${time.format(java.time.format.DateTimeFormatter.ofPattern("HH:mm:ss"))}"
                vkTeamApiService.sendMessage(peerId, response)
            }

            else -> {
                // Эхо-ответ
                if (text.isNotBlank()) {
                    vkTeamApiService.sendMessage(peerId, "Вы написали: $text")
                }
            }
        }
    }

    fun handleMessageNew(event: Map<String, Any>) {
        try {
            val messageNewObject = objectMapper.convertValue(event, MessageNewObject::class.java)
            handleMessage(messageNewObject.message, messageNewObject.clientInfo as Map<String, Any>)
        } catch (e: Exception) {
            println("Error processing message_new: ${e.message}")
        }
    }
}