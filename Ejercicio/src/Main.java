public class Main {
    public static void main(String[] args) {
            Persona persona = new Persona();
            persona.setEdad(18);
            persona.setNumero(379);
            persona.setNombre("Martin");

            System.out.println(persona.getEdad());
            System.out.println(persona.getNumero());
            System.out.println(persona.getNombre());

    }
}


class Persona {
    private int edad;
    private int numero;
    private String nombre;

    public void setEdad (int edad) {
        this.edad = edad;
    }

    public int getEdad(){
        return this.edad;
    }

    public void setNumero (int numero) {
        this.numero = numero;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNombre (String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }
}