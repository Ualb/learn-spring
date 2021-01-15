package ualb.com.HolaSpring;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import lombok.extern.slf4j.Slf4j;
import ualb.com.HolaSpring.domain.Person;

@Controller
@Slf4j
public class InitialController {
    
    // Esta variable sirbe para obtener datos del .properties
    @Value("${index.saludo}")
    private String hi;

    @GetMapping("/")
    public String getInitial(Model model) {
        // log.info("ejecutando el controlador rest");
        var name = "Ulises López";
        // compartiendo variables con la pagina de inicio
        model.addAttribute("name", name);
        model.addAttribute("hi", hi);

        // Podemos usar una persona como ejemplo
        var ulises = new Person();
        ulises.setName("Ulises");
        ulises.setLastName("López");
        ulises.setEmail("ulises@uli.com");
        ulises.setPhone("86204040");

        var karla = new Person();
        karla.setName("Karla");
        karla.setLastName("Sequeira");
        karla.setEmail("karlas@uli.com");
        karla.setPhone("856204040");

        // var personArr = Arrays.asList(ulises, karla);
        var personArr = Arrays.asList();
        model.addAttribute("persons", personArr);

        return "index";
    }
}
