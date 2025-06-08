package com.mcp.server.gpt_langchain_java.config;

import dev.langchain4j.model.chat.ChatLanguageModel;
import dev.langchain4j.model.ollama.OllamaChatModel;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LLMConfig {

    @Bean
    public ChatLanguageModel chatModel() {
        return OllamaChatModel.builder()
                .baseUrl("http://localhost:11434")  // Ensure Ollama is running
                .modelName("phi")              // or any other installed model
                .build();
    }
}
