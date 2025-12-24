public interface ActiveIngredientRepository {
    ActiveIngredient save(ActiveIngredient a);
    Optional<ActiveIngredient> findById(Long id);
    Optional<ActiveIngredient> findByName(String name);
    boolean existsByName(String name);
}
