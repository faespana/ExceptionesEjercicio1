package personaapp.entities;

public class Persona {
    private String name;
    private int edad;
    private String sexo;
    private int pesoKg;
    private int alturaCm;

    public Persona() {
    }

    public Persona(String name, int edad, String sexo, int pesoKg, int alturaCm) {
        this.name = name;
        this.edad = edad;
        this.sexo = sexo;
        this.pesoKg = pesoKg;
        this.alturaCm = alturaCm;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getPesoKg() {
        return pesoKg;
    }

    public void setPesoKg(int pesoKg) {
        this.pesoKg = pesoKg;
    }

    public int getAlturaCm() {
        return alturaCm;
    }

    public void setAlturaCm(int alturaCm) {
        this.alturaCm = alturaCm;
    }

    @Override
    public String toString() {
        return "Persona{" + "name=" + name + ", edad=" + edad + ", sexo=" + sexo + ", pesoKg=" + pesoKg + ", alturaCm=" + alturaCm + '}';
    }
}
