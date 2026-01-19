package com.gmail.wizaripost.vk_team_bot.events

import ru.mail.im.botapi.fetcher.event.Event

interface EventsResolver {
    fun handle(event: Event<*>)
}