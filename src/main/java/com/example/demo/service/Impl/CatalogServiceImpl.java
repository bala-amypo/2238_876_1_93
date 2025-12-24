@Service
public class CatalogServiceImpl implements CatalogService {

    public CatalogServiceImpl() {
    }

    @Override
    public Medication addMedication(Medication medication) {
        return medication;
    }

    @Override
    public List<Medication> getAllMedications() {
        return new ArrayList<>();
    }

    @Override
    public ActiveIngredient addIngredient(ActiveIngredient ingredient) {
        return ingredient;
    }
}
