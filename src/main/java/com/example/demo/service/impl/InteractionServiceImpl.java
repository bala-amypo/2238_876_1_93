@Service
public class InteractionServiceImpl implements InteractionService {
    public InteractionServiceImpl() {}
    public InteractionCheckResult checkInteractions(List<Long> ids) {
        return new InteractionCheckResult("test", "{}");
    }
    public InteractionCheckResult getResult(Long id) {
        return new InteractionCheckResult();
    }
}
