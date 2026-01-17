package com.gmail.wizaripost.vk_team_bot.service

import org.springframework.beans.factory.annotation.Value
import org.springframework.http.HttpEntity
import org.springframework.http.HttpHeaders
import org.springframework.http.MediaType
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate
import com.fasterxml.jackson.databind.ObjectMapper

@Service
class VkTeamApiService(
    private val restTemplate: RestTemplate,
    private val objectMapper: ObjectMapper
) {

    @Value("\${vk-team.access-token}")
    private lateinit var accessToken: String

    @Value("\${vk-team.api-version}")
    private lateinit var apiVersion: String

    private val apiUrl = "https://api.vk-team.ru/method"

    fun sendMessage(peerId: Long, message: String, keyboard: String? = null): Map<String, Any>? {
        val url = "$apiUrl/messages.send"

        val params = mutableMapOf(
            "peer_id" to peerId.toString(),
            "message" to message,
            "random_id" to System.currentTimeMillis().toString(),
            "access_token" to accessToken,
            "v" to apiVersion
        )

        keyboard?.let {
            params["keyboard"] = it
        }

        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_FORM_URLENCODED

        val request = HttpEntity(params, headers)

        return try {
            val response = restTemplate.postForObject(url, request, Map::class.java)
            response as Map<String, Any>
        } catch (e: Exception) {
            println("Error sending message: ${e.message}")
            null
        }
    }

    // Метод для создания клавиатуры
    fun createKeyboard(buttons: List<List<Map<String, Any>>>): String {
        val keyboard = mapOf(
            "one_time" to false,
            "buttons" to buttons
        )
        return objectMapper.writeValueAsString(keyboard)
    }

    // Пример метода для других API вызовов
    fun getUsersInfo(userIds: List<Long>): Map<String, Any>? {
        val url = "$apiUrl/users.get"

        val params = mutableMapOf(
            "user_ids" to userIds.joinToString(","),
            "access_token" to accessToken,
            "v" to apiVersion
        )

        val headers = HttpHeaders()
        headers.contentType = MediaType.APPLICATION_FORM_URLENCODED

        val request = HttpEntity(params, headers)

        return restTemplate.postForObject(url, request, Map::class.java) as Map<String, Any>
    }
}