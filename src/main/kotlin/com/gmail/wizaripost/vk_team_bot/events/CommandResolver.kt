package com.gmail.wizaripost.vk_team_bot.events

import org.springframework.stereotype.Component
import ru.mail.im.botapi.fetcher.event.EditedMessageEvent
import ru.mail.im.botapi.fetcher.event.Event
import ru.mail.im.botapi.fetcher.event.NewMessageEvent

@Component
class CommandResolver  {


    fun getCommand(event: Event<*>): Command? {
        val command = getMessage(event)
        if (command?.value?.firstOrNull() == '/'){
            return command
        }
        return null
    }


    private fun getMessage(event: Event<*>): Command? {
        if (event is NewMessageEvent){
            return Command(event.text, event.from.userId, event.chat.chatId)
        }
        if (event is EditedMessageEvent){
            return Command(event.text, event.from.userId, event.chat.chatId)
        }
        return null

    }

    data class Command(val value: String?, val userId: String, val chatId: String)
}