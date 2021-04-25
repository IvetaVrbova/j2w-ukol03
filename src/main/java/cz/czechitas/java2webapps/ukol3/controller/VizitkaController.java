package cz.czechitas.java2webapps.ukol3.controller;

import cz.czechitas.java2webapps.ukol3.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.Arrays;
import java.util.List;

/**
 * Kontroler obsluhující zobrazování vizitek.
 */
@Controller
public class VizitkaController {
  private final List<Person> persons;

  public VizitkaController() {
    persons = Arrays.asList(
            new Person("Barbora Kaštylová", "Škrobárenská 511/3", "61700 Brno-jih", "barbora.kastylova@czechitas.cz", "+420 603 403 877", "www.czechitas.cz", "Czechitas"),
            new Person("Pavlína Vencovská", "Škrobárenská 511/3", "61700 Brno-jih", "pavlina.vencovska@czechitas.cz", null, "www.czechitas.cz", "Czechitas"),
            new Person("Lenka Růžičková", "Lipová 1789/9", "37005 České Budějovice", "lenka.ruzickova@czechitas.cz", null, "www.czechitas.cz", "Czechitas"),
            new Person("Michaela Hejnová", "Václavské náměstí 837/11", "11000 Praha 1", "michaela.hejnova@czechitas.cz", "+420 724 341 694", null, "Czechitas"),
            new Person("Ilona Tandlerová", "Jungmannova 3", "77900 Olomouc", "ilona.tandlerova@czechitas.cz", "+420 734 172 403","www.czechitas.cz", "Czechitas")
    );
  }

  @GetMapping("/")
  public ModelAndView seznam() {
    ModelAndView modelAndView = new ModelAndView("seznam");
    modelAndView.addObject("persons", persons);
    return modelAndView;
  }

  @GetMapping("/detail")
  public ModelAndView detail(int id) {
    ModelAndView modelAndView = new ModelAndView("detail");
    modelAndView.addObject("person", persons.get(id));
    return modelAndView;

  }
}
