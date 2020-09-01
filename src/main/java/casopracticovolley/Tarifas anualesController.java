package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Tarifas anualesController {

    @RequestMapping("/tarifas anuales")
    public String index() {
        return "Greetings from Tarifas anualesController!";
    }

}
