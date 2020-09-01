package casopracticovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class Libro de MiembrosController {

    @RequestMapping("/libro de miembros")
    public String index() {
        return "Greetings from Libro de MiembrosController!";
    }

}
