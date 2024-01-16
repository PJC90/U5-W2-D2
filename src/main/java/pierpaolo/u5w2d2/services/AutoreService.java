package pierpaolo.u5w2d2.services;

import org.springframework.stereotype.Service;
import pierpaolo.u5w2d2.entities.Autore;

import java.util.ArrayList;
import java.util.List;

@Service
public class AutoreService {
    private List<Autore> autori = new ArrayList<>();
    public List<Autore> getAutori(){ return this.autori;}
}
