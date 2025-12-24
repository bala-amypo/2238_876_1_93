package com.example.demo.repository;

import com.example.demo.model.InteractionCheckResult;
import java.util.Optional;

public interface InteractionCheckResultRepository {

    InteractionCheckResult save(InteractionCheckResult result);

    Optional<InteractionCheckResult> findById(long id);
}
