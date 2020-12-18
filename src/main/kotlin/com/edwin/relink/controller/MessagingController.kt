package com.edwin.relink.controller

import com.edwin.relink.MessagingConfig
import org.springframework.amqp.rabbit.core.RabbitTemplate
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController

@RestController
class MessagingController {
    @Autowired
    private val template: RabbitTemplate? = null

    @PostMapping("/send")
    fun bookOrder(@RequestBody message: String) {
        print("I'm sender and I'm triggered!!!")
        template!!.convertAndSend(MessagingConfig.EXCHANGE, MessagingConfig.ROUTING_KEY, message)
    }
}