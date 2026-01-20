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

    var client: BotApiClient = BotApiClient(token)
    var controller = BotApiClientController.startBot(client);

    override fun send(payload: String) {
        controller.sendTextMessage(
            SendTextRequest()
                .setChatId(chatId)
                .setText(payload)
        ).getMsgId()
    }

}