package ch.bbw.aufgabenplaner;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

import java.time.LocalDate;

@Data
@Entity
public class Aufgabe {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    public String bezeichnung;
    public String notizen;
    public LocalDate datum;

    public String getBezeichnung() {
        return bezeichnung;
    }

    public void setBezeichnung(String bezeichnung) {
        this.bezeichnung = bezeichnung;
    }

    public String getNotizen() {
        return notizen;
    }

    public void setNotizen(String notizen) {
        this.notizen = notizen;
    }

    public LocalDate getDatum() {
        return datum;
    }

    public void setDatum(LocalDate datum) {
        this.datum = datum;
    }
    public Aufgabe() {
        this.bezeichnung = "bezeichnung";
        this.notizen = "notizen";
        this.datum = LocalDate.now();
    }

    public Aufgabe(String bezeichnung, String notizen, LocalDate datum) {
        this.bezeichnung = bezeichnung;
        this.notizen = notizen;
        this.datum = datum;
    }

    @Override
    public String toString() {
        return "Aufgabe{" +
                "bezeichnung='" + bezeichnung + '\'' +
                ", notizen='" + notizen + '\'' +
                ", datum=" + datum +
                '}';
    }
}
