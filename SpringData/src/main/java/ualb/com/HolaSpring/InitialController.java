package ualb.com.HolaSpring;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import ualb.com.HolaSpring.service.IPersonService; 
import ualb.com.HolaSpring.domain.*;

@Controller 
public class InitialController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping("/")
    public String getInitial(Model model, @AuthenticationPrincipal User user) {
        var persons = iPersonService.listPersons();
 
        model.addAttribute("persons", persons);
        
        return "index";
    }

    @GetMapping("/agregar")
    public String getAdd(Person person) {
        return "modify";
    }

    @PostMapping("/save")
    public String save(@Valid Person person, Errors errors) {
        if (errors.hasErrors()) {
            return "modify";
        }
        iPersonService.save(person);
        return "redirect:/";
    }

    @GetMapping("/edit/{idPerson}")
    public String edit(Person person, Model model) {
        person = iPersonService.search(person);
        model.addAttribute("person", person);
        return "modify";
    }

    @GetMapping("/del/")
    public String del(Person person) { 
        iPersonService.delete(person);
        return "redirect:/";
    }
}
