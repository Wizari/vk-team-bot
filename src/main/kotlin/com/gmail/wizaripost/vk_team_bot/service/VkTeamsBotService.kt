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

    fun splitMessage(text: String, maxLength: Int = 4000): List<String> {
        val codeBlockOverhead = 7  // ```\n + \n``` = 7 символов
        val actualMaxLength = maxLength - codeBlockOverhead

        if (text.length <= actualMaxLength) {
            return listOf(wrapInCodeBlock(text))
        }

        val result = mutableListOf<String>()
        var currentIndex = 0

        while (currentIndex < text.length) {
            val endIndex = minOf(currentIndex + actualMaxLength, text.length)
            val chunk = text.substring(currentIndex, endIndex)
            result.add(wrapInCodeBlock(chunk))
            currentIndex = endIndex
        }

        return result
    }

    private fun wrapInCodeBlock(text: String): String {
        return "```\n$text\n```"
    }

    override fun send(payload: String) {
        val messageParts = splitMessage(payload)

        messageParts.forEach { part ->
            controller.sendTextMessage(
                SendTextRequest()
                    .setChatId(chatId)
                    .setText(part)
            ).getMsgId()
            // Небольшая задержка между отправками, если частей много
            if (messageParts.size > 1) {
                Thread.sleep(100)
            }
        }
    }
}