package ch.bbw.aufgabenplaner;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

public class AufgabeController {
    @GetMapping("/aufgabe")
    public String form(Model model) {
        model.addAttribute("Aufgabe", new Aufgabe());
        return "aufgabe";
    }
}


