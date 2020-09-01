package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Libro de cartasController {

    @RequestMapping("/libro de cartas")
    public String index() {
        return "Greetings from Libro de cartasController!";
    }

}
