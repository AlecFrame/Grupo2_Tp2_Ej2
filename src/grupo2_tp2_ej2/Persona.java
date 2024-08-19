
package grupo2_tp2_ej2;

public class Persona {
    
    private String nombre;
    private int edad;
    Reloj reloj; 
    
    public Persona(String nombre, int edad, Reloj reloj){
        this.nombre = nombre;
        this.edad = edad;
        this.reloj = reloj;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
