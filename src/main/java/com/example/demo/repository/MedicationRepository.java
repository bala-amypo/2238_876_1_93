public interface MedicationRepository {
    Medication save(Medication m);
    Optional<Medication> findById(Long id);
    List<Medication> findAll();
}
