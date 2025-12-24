package com.example.demo.repository;

import com.example.demo.model.ActiveIngredient;
import java.util.Optional;

public interface ActiveIngredientRepository {

    ActiveIngredient save(ActiveIngredient ingredient);

    Optional<ActiveIngredient> findById(long id);
}
