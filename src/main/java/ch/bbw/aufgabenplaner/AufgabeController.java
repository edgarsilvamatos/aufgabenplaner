package ch.bbw.aufgabenplaner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import java.util.ArrayList;

@Controller
public class AufgabeController {

    @Autowired
    private AufgabeRepository aufgabeRepository;
    private ArrayList<Aufgabe> aufgaben = new ArrayList<>();

    @GetMapping("/")
    public String form(Model model) {
        model.addAttribute("aufgabe", new Aufgabe());
        return "aufgabe";
    }

    @PostMapping("/aufgabe_hinzugefuegt")
    public String form(Model model, @ModelAttribute Aufgabe finaleAufgabe){
        aufgaben.add(finaleAufgabe);
        model.addAttribute("aufgaben", aufgaben);
        return "result";
    }


}


