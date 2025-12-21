@Entity
public class InteractionCheckResult {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String interactions;

    private LocalDateTime checkedAt = LocalDateTime.now();

    // ADD 👇
    public void setInteractions(String interactions) {
        this.interactions = interactions;
    }

    public String getInteractions() {
        return interactions;
    }

    public LocalDateTime getCheckedAt() {
        return checkedAt;
    }
}
