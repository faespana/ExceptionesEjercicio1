package personaapp;

import personaapp.exceptions.PersonaException;
import personaapp.services.PersonaService;

public class PersonaApp {

    public static void main(String[] args) {

        PersonaService personaService = new PersonaService();

        try {
            personaService.crearPersona("Felipe", 30, "Masculino", 70, 170);

            personaService.imprimirListaDePersonas();

        } catch (PersonaException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
