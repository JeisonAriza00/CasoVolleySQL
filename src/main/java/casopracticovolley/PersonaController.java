package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PersonaController {

    @RequestMapping("/persona")
    public String index() {
        return "Greetings from PersonaController!";
    }

}
