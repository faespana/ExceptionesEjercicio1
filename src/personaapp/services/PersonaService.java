package personaapp.services;

import java.util.ArrayList;
import personaapp.entities.Persona;

public class PersonaService {
    
    private ArrayList<Persona> listaPersona = new ArrayList();

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }
    
    public void crearPersona(){
    
    }
}
