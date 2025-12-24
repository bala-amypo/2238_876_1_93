@Service
public class InteractionServiceImpl implements InteractionService {

    public InteractionServiceImpl() {
    }

    @Override
    public InteractionCheckResult checkInteractions(List<Long> medicationIds) {
        return new InteractionCheckResult();
    }

    @Override
    public InteractionCheckResult getResult(Long id) {
        return new InteractionCheckResult();
    }
}
