package com.gmail.wizaripost.vk_team_bot.events

import ru.mail.im.botapi.fetcher.event.Event

interface EventController {
    fun valid(event: Event<*>): Boolean
    fun execute(event: Event<*>)
}