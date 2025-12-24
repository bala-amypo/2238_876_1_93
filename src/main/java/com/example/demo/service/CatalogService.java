public interface CatalogService {

    Medication addMedication(Medication medication);

    List<Medication> getAllMedications();

    ActiveIngredient addIngredient(ActiveIngredient ingredient);
}
