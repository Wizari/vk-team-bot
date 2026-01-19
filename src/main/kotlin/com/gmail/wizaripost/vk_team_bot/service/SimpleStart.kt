package com.gmail.wizaripost.vk_team_bot.service

import org.springframework.stereotype.Component
import org.springframework.stereotype.Service
import ru.mail.im.botapi.BotApiClient
import ru.mail.im.botapi.BotApiClientController
import ru.mail.im.botapi.entity.ChatAction
import ru.mail.im.botapi.fetcher.OnEventFetchListener
import ru.mail.im.botapi.fetcher.event.Event
import java.util.Scanner

@Component
class SimpleStart() {
    fun start() {
        val scanner: Scanner = Scanner(System.`in`)
        println("Enter bot token:")
        val token: String = "123"
        println("Enter test chatId:")
        val chatId: String? = "123"

        val client = BotApiClient(token)

        val controller = BotApiClientController.startBot(client)
        println("STARTED")
        client.addOnEventFetchListener(OnEventFetchListener { x: MutableList<Event<*>?>? -> println(x) })
        controller.sendActions(chatId, ChatAction.TYPING)
        val messageId = controller.sendTextMessage(chatId, "test").getMsgId()
        controller.sendActions(chatId, ChatAction.TYPING)
        controller.editText(chatId, messageId, "EDITED TEST")
        controller.replyText(chatId, "Reply msg", messageId)


        //        create file 1.txt in project root
//        File file = new File("1.txt");
//        controller.sendFile(chatId, file);
//        controller.replyFile(chatId, file, messageId, "Awesome file");
        while (!scanner.nextLine().equals("end")) {
            //do nothing here, just waiting for fetch
        }
    }
}