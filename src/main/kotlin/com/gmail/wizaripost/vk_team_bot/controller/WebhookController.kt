package com.gmail.wizaripost.vk_team_bot.controller


import com.gmail.wizaripost.vk_team_bot.dto.VkTeamEvent
import com.gmail.wizaripost.vk_team_bot.service.BotService
import org.springframework.beans.factory.annotation.Value
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/api/vk-team")
class WebhookController(
    private val botService: BotService
) {

    @Value("\${vk-team.confirmation-token}")
    private lateinit var confirmationToken: String

    @PostMapping("/webhook")
    fun handleWebhook(@RequestBody event: VkTeamEvent): ResponseEntity<Any> {
        return when (event.type) {
            "confirmation" -> {
                // Подтверждение сервера при настройке вебхука
                ResponseEntity.ok(confirmationToken)
            }

            "message_new" -> {
                // Обработка нового сообщения
                botService.handleMessageNew(event.`object`)
                ResponseEntity.ok("ok")
            }

            else -> {
                // Для других типов событий
                ResponseEntity.ok("ok")
            }
        }
    }

    // GET endpoint для проверки работы (опционально)
    @GetMapping("/health")
    fun healthCheck(): ResponseEntity<String> {
        return ResponseEntity.ok("Bot is running!")
    }
}