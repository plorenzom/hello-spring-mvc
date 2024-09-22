package es.thefactory.hellospringmvc.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.logging.Logger;

/**
 * @author Pablo Lorenzo Manzano.
 */
@Controller
public class HelloWorldController {
    
    /**
     *
     */
    private static final Logger LOGGER = Logger.getLogger(HelloWorldController.class.getName());
    
    /**
     *
     * @return String
     */
    @GetMapping(path = "/helloworld")
    public String helloWorld(Model model) {
        LOGGER.info("Entering method helloWorld()");
        model.addAttribute("message", "¡Hola mundo!");
        LOGGER.info("Exiting method helloWorld()");
        
        return "helloworld";
    }
}
