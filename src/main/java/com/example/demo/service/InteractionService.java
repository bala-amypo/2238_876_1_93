public interface InteractionService {
    InteractionCheckResult checkInteractions(List<Long> ids);
    InteractionCheckResult getResult(Long id);
}
