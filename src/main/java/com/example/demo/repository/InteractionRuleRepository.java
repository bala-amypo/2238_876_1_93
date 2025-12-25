public interface InteractionRuleRepository extends JpaRepository<InteractionRule, Long> {
    List<InteractionRule> findByIngredientId(Long id);
    Optional<InteractionRule> findRuleBetweenIngredients(Long a, Long b);
}
