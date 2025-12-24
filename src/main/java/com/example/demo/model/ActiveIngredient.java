@Entity
public class ActiveIngredient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    public ActiveIngredient() {
    }

    public ActiveIngredient(String name) {
        this.name = name;
    }

    getters and setters
}
