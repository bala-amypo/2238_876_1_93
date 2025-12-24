public interface InteractionRuleRepository {
    InteractionRule save(InteractionRule r);
    Optional<InteractionRule> findById(Long id);
    List<InteractionRule> findByIngredientId(Long id);
    Optional<InteractionRule> findRuleBetweenIngredients(Long a, Long b);
}
