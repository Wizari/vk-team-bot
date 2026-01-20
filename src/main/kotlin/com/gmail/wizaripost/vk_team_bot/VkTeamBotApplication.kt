package com.gmail.wizaripost.vk_team_bot

import com.gmail.wizaripost.vk_team_bot.service.VkTeamsBotService
import org.springframework.beans.factory.getBean
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class VkTeamBotApplication

fun main(args: Array<String>) {
//	runApplication<VkTeamBotApplication>(*args)
	val application = runApplication<VkTeamBotApplication>(*args)
//	val sempleStart = application.getBean<SimpleStart>()
//	sempleStart.start()
	val sempleStart = application.getBean<VkTeamsBotService>()
	sempleStart.send("SS 123")



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