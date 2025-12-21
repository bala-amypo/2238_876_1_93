// src/main/java/com/example/demo/service/impl/InteractionServiceImpl.java
package com.example.demo.service.impl;

import com.example.demo.model.InteractionCheckResult;
import com.example.demo.service.InteractionService;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class InteractionServiceImpl implements InteractionService {

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        return new InteractionCheckResult("NO_INTERACTIONS");
    }
}
