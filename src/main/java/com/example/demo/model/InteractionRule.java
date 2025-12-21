@Entity
public class InteractionRule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    private ActiveIngredient ingredientA;

    @ManyToOne
    private ActiveIngredient ingredientB;

    private String severity;
    private String description;

    // ADD ALL THESE 👇

    public void setIngredientA(ActiveIngredient ingredientA) {
        this.ingredientA = ingredientA;
    }

    public void setIngredientB(ActiveIngredient ingredientB) {
        this.ingredientB = ingredientB;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
