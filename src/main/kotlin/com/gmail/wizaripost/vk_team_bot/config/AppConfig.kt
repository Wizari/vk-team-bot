//package com.gmail.wizaripost.vk_team_bot.config
//
//import com.didalgo.gpt3.Encoding
//import com.didalgo.gpt3.GPT3Tokenizer
//import com.example.vkteamsbot.domain.repository.MessageRepository
//import com.example.vkteamsbot.service.logic.HistoryMessagesService
//import com.example.vkteamsbot.service.logic.HistoryMessagesServiceImpl
//import io.github.oshai.kotlinlogging.KotlinLogging
//import org.h2.tools.Server
//import org.springframework.beans.factory.annotation.Value
//import org.springframework.context.annotation.Bean
//import org.springframework.context.annotation.Configuration
//import org.springframework.context.annotation.Profile
//import org.springframework.core.task.TaskExecutor
//import org.springframework.http.HttpHeaders
//import org.springframework.http.MediaType
//import org.springframework.http.client.reactive.ClientHttpConnector
//import org.springframework.http.client.reactive.ReactorClientHttpConnector
//import org.springframework.scheduling.concurrent.ThreadPoolTaskExecutor
//import org.springframework.web.reactive.function.client.WebClient
//import reactor.netty.http.client.HttpClient
//import reactor.netty.transport.ProxyProvider
//import ru.mail.im.botapi.BotApiClient
//import ru.mail.im.botapi.BotApiClientController
//import java.net.InetSocketAddress
//
//@Configuration
//class AppConfig {
//    private val log = KotlinLogging.logger {}
//
//    @Bean
//    fun taskExecutor(): TaskExecutor {
//        val executor = ThreadPoolTaskExecutor()
//        executor.corePoolSize = 200
//        executor.maxPoolSize = 200
//        executor.queueCapacity = 500
//        executor.initialize()
//        return executor
//    }
//
////    @Bean
////    fun getOpenAIApi(): OpenAIApi {
////        return OpenAIApiMock()
////    }
//
//
//    @Bean
//    fun getHistoryMessagesService(messageRepository: MessageRepository): HistoryMessagesService {
//        return HistoryMessagesServiceImpl(
//            messageRepository
//        )
//    }
//
//
//    @Bean
//    fun getBotApiClientController(client: BotApiClient): BotApiClientController {
//        return BotApiClientController.startBot(client)
//    }
//
//    @Bean
//    fun getBotApiClient(@Value("\${vkteams.token}") token: String): BotApiClient {
//        return BotApiClient(token)
//    }
//
//    @Bean
//    fun getWebClient(
//        @Value("\${openai.url}") openAiUrl: String,
//        @Value("\${openai.key}") openAiKey: String
//    ): WebClient {
//        val httpClient = HttpClient.create()
//            .tcpConfiguration { tcpClient ->
//                tcpClient.proxy { proxy ->
//                    proxy.type(ProxyProvider.Proxy.HTTP)
//                        .address(InetSocketAddress("transfer.gga-smart.com", 3128))
//                }
//            }
//
//        val connector: ClientHttpConnector = ReactorClientHttpConnector(httpClient.wiretap(true))
//        return WebClient.builder()
//            .clientConnector(connector)
//            .baseUrl(openAiUrl)
//            .defaultHeader(HttpHeaders.CONTENT_TYPE, MediaType.APPLICATION_JSON_VALUE)
//            .defaultHeader("Authorization", "Bearer $openAiKey")
//            .build();
//    }
//
//    @Bean
//    fun getTokenizer(): GPT3Tokenizer {
//        return GPT3Tokenizer(Encoding.CL100K_BASE)
//    }
//}