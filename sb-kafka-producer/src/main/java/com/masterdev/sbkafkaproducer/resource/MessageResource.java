package com.masterdev.sbkafkaproducer.resource;

import com.masterdev.sbkafkaproducer.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/message")
public class MessageResource {

    @Autowired
    private MessageService messageService;

    @PostMapping
    public ResponseEntity<String> sendMessage(@RequestBody String message) {
        messageService.sendMessage(message);
        return ResponseEntity.ok("Message sent successfully: " + message);
    }
}
