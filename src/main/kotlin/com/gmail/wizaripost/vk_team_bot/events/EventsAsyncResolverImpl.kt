package com.gmail.wizaripost.vk_team_bot.events

import com.gmail.wizaripost.vk_team_bot.config.Loggable
import org.springframework.scheduling.annotation.Async
import org.springframework.stereotype.Component
import ru.mail.im.botapi.fetcher.event.Event

@Component
class EventsAsyncResolverImpl(
    private val eventControllers: Set<EventController>,
    private val commandControllers: Set<CommandController>,
    private val commandResolver: CommandResolver
) : EventsResolver, Loggable {


    @Async
    override fun handle(event: Event<*>) {

        val command = commandResolver.getCommand(event)

        if (command?.value == null) {
            eventControllers.firstOrNull { it.valid(event) }?.execute(event)
        } else{
            commandControllers.filter { it.valid(command.value) }.forEach { it.execute(
                chatId = command.chatId,
                userId = command.userId
            ) }
        }

    }


}