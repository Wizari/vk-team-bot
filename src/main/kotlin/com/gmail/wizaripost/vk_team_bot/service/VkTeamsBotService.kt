package com.gmail.wizaripost.vk_team_bot.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.stereotype.Service
import ru.mail.im.botapi.BotApiClient
import ru.mail.im.botapi.BotApiClientController
import ru.mail.im.botapi.api.entity.SendTextRequest
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter

@Service
class VkTeamsBotService(
    @Value("\${vk-team-bot.token}")
    private var token: String,
    @Value("\${vk-team-bot.chat-id}")
    private var chatId: String
): MessageSender {

    private val client: BotApiClient = BotApiClient(token)
    private val controller = BotApiClientController.startBot(client)

//    fun splitMessage(text: String, maxLength: Int = 4000): List<String> {
    fun splitMessage(text: String, maxLength: Int = 40000): MutableList<String> {
        val codeBlockOverhead = 9  // ```\n + \n``` = 7 символов
        val actualMaxLength = maxLength - codeBlockOverhead

        if (text.length <= actualMaxLength) {
            return mutableListOf(wrapInCodeBlock(text))
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
        var stringBuilder = StringBuilder()
        stringBuilder.append(payload)
        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
//        stringBuilder.append(payload)
        val string = stringBuilder.toString()

        val messageParts = splitMessage(string)

        val timestamp = LocalDateTime.now()
        val formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss")

        var firstPart = "${timestamp.format(formatter)}\n${messageParts.get(0)}"
        messageParts.set(0, firstPart)

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