package com.gmail.wizaripost.vk_team_bot.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.client.RestTemplate

@Configuration
class BotConfig {

    @Bean
    fun restTemplate(): RestTemplate {
        return RestTemplate()
    }
}