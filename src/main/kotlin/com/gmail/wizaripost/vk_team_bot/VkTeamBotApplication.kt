package com.gmail.wizaripost.vk_team_bot

import com.gmail.wizaripost.vk_team_bot.service.SimpleStart
import org.springframework.beans.factory.getBean
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.scheduling.annotation.EnableAsync
import org.springframework.scheduling.annotation.EnableScheduling
import ru.mail.im.botapi.BotApiClient
//import ru.mail.im.botapi.BotApiClient
import ru.mail.im.botapi.BotApiClientController


@SpringBootApplication
class VkTeamBotApplication

fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
	val application = runApplication<VkTeamBotApplication>(*args)
	val sempleStart = application.getBean<SimpleStart>()
	sempleStart.start()



}

//@SpringBootApplication
//@EnableAsync
//@EnableScheduling
//class VkTeamBotApplication{
//
//
//	@Bean
//	fun init(
//		client: BotApiClient,
//		handler: EventsResolver,
////		userRepository: UserRepository,
////		controller: BotApiClientController
//	): CommandLineRunner {
//
//		return CommandLineRunner {
//			client.addOnEventFetchListener { events ->
//				events?.forEach {
////					getLogger().info(it.toString())
////					handler.handle(it)
//				}
//			}
//		}
//	}
//}
//
//fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
//}



//@SpringBootApplication
//class VkTeamBotApplication

//fun main(args: Array<String>) {
////	runApplication<VkTeamBotApplication>(*args)
//	val application = runApplication<VkTeamBotApplication>(*args)
//	val sempleStart = application.getBean<SimpleStart>()
//	sempleStart.start()
//
//
//
//}