package com.example.demo.repository;

import com.example.demo.model.ActiveIngredient;
import java.util.Optional;
import java.util.List;

public interface ActiveIngredientRepository {

    Optional<ActiveIngredient> findByName(String name);

    boolean existsByName(String name);
}
