package com.ibetar.chatgptspringboot;

import io.github.flashvayne.chatgpt.dto.ChatRequest;
import io.github.flashvayne.chatgpt.dto.ChatResponse;
import io.github.flashvayne.chatgpt.service.ChatgptService;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/chatbot")
public class ChatGPTController implements InitializingBean {
    @Autowired
    private ChatgptService chatgptService;
    @Override
    public void afterPropertiesSet() { System.out.println("===Chat GPT with Spring Boot Ibetar ==="); }

    @GetMapping("/chat")
    public String chatWith(@RequestParam String message) {
        System.out.println(message);
        return chatgptService.sendMessage(message);
    }

    @GetMapping("/prompt")
    public ChatResponse prompt(@RequestParam String message) {
        Integer maxTokens = 300;
        String model = "text-davinci-003";
        Double temperature = 0.5;
        Double topP = 1.0;

        ChatRequest chatRequest = new ChatRequest(model, message, maxTokens, temperature, topP);
        ChatResponse chatResponse = chatgptService.sendChatRequest(chatRequest);
        System.out.println("ChatGPT Response: " + chatResponse.toString());

        return chatResponse;
    }

}
