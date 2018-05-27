package pliki;

import com.fasterxml.jackson.databind.ObjectMapper;
import model.Sklep;

import java.io.File;

public class PlikiJson implements OperacjePlikowe {

    public void zapisz(Sklep sklep) throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        mapper.writeValue(new File("sklep.json"), sklep);
    }

    public Sklep wszytaj() throws Exception {
        ObjectMapper mapper = new ObjectMapper();
        Sklep sklep = mapper.readValue(new File("sklep.json"), Sklep.class);
        return sklep;
                

    }

    public void wczytaj() {
    }
}
