package ch.bbw.aufgabenplaner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Aufgabe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public Long id;

    public String bezeichnung;
    public String notizen;
    public LocalDate datum;

    @Override
    public String toString() {
        return "Aufgabe{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", notizen='" + notizen + '\'' +
                ", datum=" + datum +
                '}';
    }
}
