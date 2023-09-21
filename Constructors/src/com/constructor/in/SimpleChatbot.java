package com.constructor.in;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class SimpleChatbot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<String, String> responses = getResponses();

        System.out.println("Chatbot: Hi! How can I help you today?");
        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                System.out.println("Chatbot: Goodbye!");
                break;
            }

            String response = getResponse(input, responses);
            System.out.println("Chatbot: " + response);
        }
    }

    private static Map<String, String> getResponses() {
        Map<String, String> responses = new HashMap<>();
        responses.put("hello", "Hello! How are you?");
        responses.put("how are you", "I'm just a chatbot, but I'm here to help!");
        responses.put("bye", "Goodbye! Have a great day!");
        responses.put("name", "I'm just a simple chatbot. What's your name?");
        responses.put("age", "I don't have an age. How old are you?");
        return responses;
    }

    private static String getResponse(String input, Map<String, String> responses) {
        for (Map.Entry<String, String> entry : responses.entrySet()) {
            if (input.toLowerCase().contains(entry.getKey())) {
                return entry.getValue();
            }
        }
        return "I'm sorry, I don't understand that.";
    }
}
