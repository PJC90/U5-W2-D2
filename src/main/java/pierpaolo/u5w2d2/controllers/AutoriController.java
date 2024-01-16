package pierpaolo.u5w2d2.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pierpaolo.u5w2d2.entities.Autore;
import pierpaolo.u5w2d2.services.AutoreService;

import java.util.List;

@RestController
@RequestMapping("/autori")
public class AutoriController {
    @Autowired
    private AutoreService autoreService;
    @GetMapping
    public List<Autore> getAutori(){ return autoreService.getAutori();}
}
