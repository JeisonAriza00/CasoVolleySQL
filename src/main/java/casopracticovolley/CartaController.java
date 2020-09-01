package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class CartaController {

    @RequestMapping("/carta")
    public String index() {
        return "Greetings from CartaController!";
    }

}
