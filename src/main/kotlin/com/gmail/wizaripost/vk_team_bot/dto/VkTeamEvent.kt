package com.gmail.wizaripost.vk_team_bot.dto

import com.fasterxml.jackson.annotation.JsonProperty

data class VkTeamEvent(
    @JsonProperty("type")
    val type: String,

    @JsonProperty("object")
    val `object`: Map<String, Any>,

    @JsonProperty("group_id")
    val groupId: Long,

    @JsonProperty("event_id")
    val eventId: String
)

data class MessageNewObject(
    @JsonProperty("message")
    val message: Message,

    @JsonProperty("client_info")
    val clientInfo: ClientInfo
)

data class Message(
    @JsonProperty("id")
    val id: Long,

    @JsonProperty("from_id")
    val fromId: Long,

    @JsonProperty("peer_id")
    val peerId: Long,

    @JsonProperty("text")
    val text: String,

    @JsonProperty("payload")
    val payload: String? = null
)

data class ClientInfo(
    @JsonProperty("button_actions")
    val buttonActions: List<String>,

    @JsonProperty("keyboard")
    val keyboard: Boolean,

    @JsonProperty("inline_keyboard")
    val inlineKeyboard: Boolean
)