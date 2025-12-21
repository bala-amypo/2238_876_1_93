// src/test/java/com/example/demo/DrugInteractionCheckerTest.java
@ExtendWith(MockitoExtension.class)
class DrugInteractionCheckerTest {

    @Mock
    private InteractionRuleRepository interactionRuleRepository;

    @InjectMocks
    private RuleServiceImpl ruleService;

    @InjectMocks
    private InteractionServiceImpl interactionService;
}
