package com.gmail.wizaripost.vk_team_bot.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.mail.im.botapi.BotApiClient
import ru.mail.im.botapi.BotApiClientController
import ru.mail.im.botapi.api.entity.SendTextRequest

@Service
class VkTeamsBotService(
    @Value("\${vk-team-bot.token}")
    private var token: String,
    @Value("\${vk-team-bot.chat-id}")
    private var chatId: String
): MessageSender {

    private val client: BotApiClient = BotApiClient(token)
    private val controller = BotApiClientController.startBot(client)

    // Спецсимволы, которые нужно экранировать
    private val specialCharacters = mapOf(
        '_' to "\\_",
        '*' to "\\*",
        '[' to "\\[",
        ']' to "\\]",
        '(' to "\\(",
        ')' to "\\)",
        '~' to "\\~",
        '`' to "\\`",
        '>' to "\\>",
        '#' to "\\#",
        '+' to "\\+",
        '-' to "\\-",
        '=' to "\\=",
        '|' to "\\|",
        '{' to "\\{",
        '}' to "\\}",
        '.' to "\\.",
        '!' to "\\!"
    )

    // Экранирование спецсимволов
    fun escapeSpecialCharacters(text: String): String {
        val escapedText = StringBuilder()

        for (char in text) {
            escapedText.append(specialCharacters[char] ?: char.toString())
        }

        return escapedText.toString()
    }

    // Разбивка текста на части по maxLength символов
    fun splitMessage(text: String, maxLength: Int = 4000): List<String> {
        val result = mutableListOf<String>()
        var currentIndex = 0

        while (currentIndex < text.length) {
            val endIndex = minOf(currentIndex + maxLength, text.length)
            result.add(text.substring(currentIndex, endIndex))
            currentIndex = endIndex
        }

        return result
    }

    override fun send(payload: String) {
//        // 1. Экранируем спецсимволы
//        val escapedPayload = escapeSpecialCharacters(payload)

        // 2. Разбиваем на части, если нужно
        val messageParts = splitMessage(payload)

        // 3. Отправляем каждую часть
        messageParts.forEach { part ->
            controller.sendTextMessage(
                SendTextRequest()
                    .setChatId(chatId)
                    .setText(part)
            ).getMsgId()
        }
    }
}