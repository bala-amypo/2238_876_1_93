package com.example.demo.repository;

import com.example.demo.model.InteractionCheckResult;
import java.util.Optional;

public interface InteractionCheckResultRepository {

    Optional<InteractionCheckResult> findById(Long id);
}
