package grupo2_tp2_ej2;

public class Perro {
    
    private String nombre;
    private String raza;///gato o perro
    private int edad;

    public Perro(String nombre, String raza, int edad) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza.toLowerCase();;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre "+nombre);
        System.out.println("Raza "+raza);
        System.out.println("edad "+edad);
    }
    
    public void sonido(){
        switch (raza) {
            case "perro":
                System.out.println("¡Guau, guau!");
                break;
            case "gato":
                System.out.println("¡Miau, miau!");
                break;
            default:
                System.out.println("Este animal no hace un sonido conocido.");
                break;
        }
    
    }
}
