package com.example.demo.dto;

import java.util.List;

public class InteractionRequestDto {

    private List<Long> ingredientIds;

    public List<Long> getIngredientIds() {
        return ingredientIds;
    }

    public void setIngredientIds(List<Long> ingredientIds) {
        this.ingredientIds = ingredientIds;
    }
}
