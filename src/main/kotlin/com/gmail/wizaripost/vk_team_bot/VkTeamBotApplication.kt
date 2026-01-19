package com.gmail.wizaripost.vk_team_bot

import com.gmail.wizaripost.vk_team_bot.service.SimpleStart
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VkTeamBotApplication

fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
	val application = runApplication<VkTeamBotApplication>(*args)
	val sempleStart = application.getBean<SimpleStart>()
	sempleStart.start()



}