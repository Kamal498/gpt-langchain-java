package com.mcp.server.gpt_langchain_java.service;

import com.mcp.server.gpt_langchain_java.model.Order;
import com.mcp.server.gpt_langchain_java.repository.OrderRepository;
import dev.langchain4j.model.chat.ChatLanguageModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChatService {

    @Autowired
    private ChatLanguageModel llm;

    @Autowired
    private OrderRepository orderRepo;

    public String analyzeOrders(String prompt) {
        List<Order> orders = orderRepo.findAll();

        // Prepare context
        StringBuilder context = new StringBuilder("Order Data:\n");
        for (Order order : orders) {
            context.append(String.format("Customer: %s, Amount: %.2f, Date: %s\n",
                    order.getCustomerName(), order.getAmount(), order.getOrderDate()));
        }

        // Build final prompt
        String fullPrompt = context + "\n\nUser Query: " + prompt;

        // Send to LLM
        return llm.generate(fullPrompt);
    }

}
