package personaapp.services;

import java.util.ArrayList;
import personaapp.entities.Persona;
import personaapp.exceptions.PersonaException;

public class PersonaService {

    private ArrayList<Persona> listaPersona = new ArrayList();

    public ArrayList<Persona> getListaPersona() {
        return listaPersona;
    }

    public void setListaPersona(ArrayList<Persona> listaPersona) {
        this.listaPersona = listaPersona;
    }

    public void crearPersona(String name, int edad, String sexo, int pesoKg, int alturaCm) throws PersonaException {

        try {

            if (name.isEmpty()) {
                throw new PersonaException("Debes indicar el nombre de la persona");
            }

            if (edad < 0) {
                throw new PersonaException("La edad no puede ser menor que cero");
            }

            if (sexo.isEmpty()) {
                throw new PersonaException("Debes indicar el sexo de la persona");
            }

            if (pesoKg <= 0) {
                throw new PersonaException("El peso de la persona no puede ser cero o menos que cero");
            }

            if (alturaCm <= 0) {
                throw new PersonaException("La altura de la persona no puede ser cero o menos que cero");
            }

            Persona persona = new Persona();

            persona.setName(name);
            persona.setEdad(edad);
            persona.setSexo(sexo);
            persona.setPesoKg(pesoKg);
            persona.setAlturaCm(alturaCm);
            
            guardarPersona(persona);

        } catch (PersonaException e) {
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            throw new PersonaException("Error de sistema");
        }

    }
    
    public void guardarPersona(Persona persona) {
        listaPersona.add(persona);
    }
     public void imprimirListaDePersonas() throws PersonaException{
        try{
            if(listaPersona.isEmpty()) {
                throw new PersonaException("La lista de mascotas se encuentra vacia");
            }else{
                for(Persona p: listaPersona){
                    System.out.println("*******INICIO******");
                    System.out.println("Nombre de la persona: " + p.getName());
                    System.out.println("Edad de la persona: " + p.getEdad() + "años");
                    System.out.println("Sexo de la persona: " + p.getSexo());
                    System.out.println("Peso de la persona: " + p.getPesoKg() + "Kg");
                    System.out.println("Altura de la persona: " + p.getAlturaCm() + "cm");
                    System.out.println("*******FIN******");
                }
            }
        }catch(PersonaException e) {
            throw e;
        }catch(Exception e) {
            e.printStackTrace();
            throw new PersonaException("Error de sistema");
        }
    }

}
