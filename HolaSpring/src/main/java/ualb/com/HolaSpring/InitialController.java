package ualb.com.HolaSpring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class InitialController {
    
    @GetMapping("/")
    public String getInitial() {
        // log.info("ejecutando el controlador rest");
        return "¡Hell, Word! with spring";
    }
}
