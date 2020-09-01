package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Tarjetas de miembrosController {

    @RequestMapping("/tarjetas de miembros")
    public String index() {
        return "Greetings from Tarjetas de miembrosController!";
    }

}
