@RestController
@RequestMapping("/catalog")
public class CatalogController {

    private final CatalogService catalogService;

    public CatalogController(CatalogService catalogService) {
        this.catalogService = catalogService;
    }

    @PostMapping("/ingredient")
    public ActiveIngredient addIngredient(@RequestBody ActiveIngredient ingredient) {
        return catalogService.addIngredient(ingredient);
    }

    @PostMapping("/medication")
    public Medication addMedication(@RequestBody Medication medication) {
        return catalogService.addMedication(medication);
    }

    @GetMapping("/medications")
    public List<Medication> getAll() {
        return List.of();
    }
}
