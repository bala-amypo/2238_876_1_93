// src/main/java/com/example/demo/service/InteractionService.java
package com.example.demo.service;

import com.example.demo.model.InteractionCheckResult;
import java.util.List;

public interface InteractionService {
    InteractionCheckResult checkInteractions(List<Long> medicationIds);
}
