public interface InteractionService {
    InteractionCheckResult checkInteractions(List<Long> medicationIds);
    InteractionCheckResult getResult(Long id);
}
