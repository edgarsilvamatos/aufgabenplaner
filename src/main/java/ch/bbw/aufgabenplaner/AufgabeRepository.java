package ch.bbw.aufgabenplaner;

import org.springframework.data.repository.CrudRepository;
import java.util.List;


public interface AufgabeRepository extends CrudRepository<Aufgabe, Long> {
    List<Aufgabe> findByBezeichnung(String bezeichnung);
}
