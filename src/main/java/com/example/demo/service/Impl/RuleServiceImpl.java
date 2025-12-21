@Service
public class RuleServiceImpl implements RuleService {

    private final InteractionRuleRepository repository;

    public RuleServiceImpl(InteractionRuleRepository repository) {
        this.repository = repository;
    }

    // ADD THIS 👇
    public RuleServiceImpl() {
        this.repository = null;
    }
}
