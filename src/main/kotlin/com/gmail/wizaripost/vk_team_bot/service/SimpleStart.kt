//package com.gmail.wizaripost.vk_team_bot.service
//
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.boot.context.properties.ConfigurationProperties
//import org.springframework.context.annotation.PropertySource
//import org.springframework.stereotype.Component
//import ru.mail.im.botapi.BotApiClient
//import ru.mail.im.botapi.BotApiClientController
//import ru.mail.im.botapi.entity.ChatAction
//import ru.mail.im.botapi.fetcher.OnEventFetchListener
//import ru.mail.im.botapi.fetcher.event.Event
//import java.util.*
//
//@PropertySource("classpath:secret.properties")
//@Component
//class SimpleStart() {
//    @Value("\${vkteams.token}")
//    private lateinit var token: String
//    @Value("\${vkteams.chat-id}")
//    private lateinit var chatId: String
//
//
//    fun start() {
//        val scanner: Scanner = Scanner(System.`in`)
//
//        val client = BotApiClient(token)
//
//        val controller = BotApiClientController.startBot(client)
//        println("STARTED")
//        client.addOnEventFetchListener(OnEventFetchListener { x: MutableList<Event<*>?>? -> println(x) })
//        controller.sendActions(chatId, ChatAction.TYPING)
//        val messageId = controller.sendTextMessage(chatId, "test").getMsgId()
//        controller.sendActions(chatId, ChatAction.TYPING)
//        controller.editText(chatId, messageId, "EDITED TEST")
//        controller.replyText(chatId, "Reply msg", messageId)
//
//
//        //        create file 1.txt in project root
////        File file = new File("1.txt");
////        controller.sendFile(chatId, file);
////        controller.replyFile(chatId, file, messageId, "Awesome file");
//        while (!scanner.nextLine().equals("end")) {
//            //do nothing here, just waiting for fetch
//        }
//    }
//}