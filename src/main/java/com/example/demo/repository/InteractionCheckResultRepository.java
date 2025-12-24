public interface InteractionCheckResultRepository {
    InteractionCheckResult save(InteractionCheckResult r);
    Optional<InteractionCheckResult> findById(Long id);
}
