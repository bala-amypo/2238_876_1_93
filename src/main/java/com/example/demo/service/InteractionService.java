// src/main/java/com/example/demo/service/InteractionService.java
package com.example.demo.service;

import java.util.List;

public interface InteractionService {
    String getResult(long ruleId);
    String checkInteractions(List<Long> ingredientIds);
}
