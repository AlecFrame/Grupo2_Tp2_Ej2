package animales;

public class Gato {

    private String nombre;
    private String raza;
    private int edad;
    private String color;

    public Gato(String nombre, String raza, int edad, String color) {
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Nombre: " + nombre +  "\n Raza: " + raza + " \n Edad: " + edad + "\naños \nColor: " + color + "";
    }

    public void maullar() {
        System.out.println(nombre + "Miau");
    }
}
