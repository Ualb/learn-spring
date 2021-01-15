package ualb.com.HolaSpring; 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
 
import ualb.com.HolaSpring.service.IPersonService; 

@Controller 
public class InitialController {

    @Autowired
    private IPersonService iPersonService;

    @GetMapping("/")
    public String getInitial(Model model) {
        var persons = iPersonService.listPersons();
 
        model.addAttribute("persons", persons);

        return "index";
    }
}
