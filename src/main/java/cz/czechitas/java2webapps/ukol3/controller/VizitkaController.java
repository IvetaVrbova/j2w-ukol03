package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Vizitka;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
    private final List<Vizitka> seznamVizitek;
    private int vybranaVizitkaId;

    public VizitkaController() {
        seznamVizitek = new ArrayList<>();
        seznamVizitek.add(
                new Vizitka(
                        "Barbora Kaštylová",
                        "Czechitas z. s.",
                        "Škrobárenská 511/3",
                        "61700 Brno-jih",
                        "barbora.kastylova@czechitas.cz",
                        "+420 603 403 877",
                        "www.czechitas.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Pavlína Vencovská",
                        "Czechitas z. s.",
                        "Škrobárenská 511/3",
                        "61700 Brno",
                        "pavlina.vencovska@czechitas.cz",
                        null,
                        "www.czechitas.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Lenka Růžičková",
                        "Czechitas z. s.",
                        "Lipová 1789/9",
                        "37005 České Budějovice",
                        "lenka.ruzickova@czechitas.cz",
                        null,
                        "www.czechitas.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Michaela Hejnová",
                        "Czechitas z. s.",
                        "Václavské náměstí 837/11",
                        "11000 Praha 1",
                        "michaela.hejnova@czechitas.cz",
                        "+420 724 341 694",
                        "www.czechitas.cz"
                )
        );
        seznamVizitek.add(
                new Vizitka(
                        "Ilona Tandlerová",
                        "Czechitas z. s.",
                        "Jungmannova 3",
                        "77900 Olomouc",
                        "ilona.tandlerova@czechitas.cz",
                        "+420 734 172 403",
                        "www.czechitas.cz"
                )
        );

    }

    @GetMapping("/")
    public ModelAndView seznam() {
        ModelAndView result = new ModelAndView("seznam");
        result.addObject("seznam", seznamVizitek);
        return result;
    }

    @GetMapping(path = "/detail", params = "id")
    public ModelAndView detail(int id) {
        ModelAndView result = new ModelAndView("detail");
        result.addObject("vizitka", seznamVizitek.get(id));
        result.addObject("id", id);

        return result;
    }

    @GetMapping(path = "/nova")
    public ModelAndView nova() {
        ModelAndView result = new ModelAndView("nova");
        return result;
    }

    @PostMapping(value = "/nova", params = {"jmeno", "firma", "ulice", "obecPsc", "email", "telefon", "web"})
    public String nova(Vizitka vizitka) {
        seznamVizitek.add(vizitka);
        return "redirect:/";
    }

    @PostMapping(value = "/detail", params = {"id"})
    public String delete(int id) {
        seznamVizitek.remove(id);
        return "redirect:/";
    }
}
