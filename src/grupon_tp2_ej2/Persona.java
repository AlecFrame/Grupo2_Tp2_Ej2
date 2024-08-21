
package grupon_tp2_ej2;

import java.util.Random;

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
    
    public void comer(){
        //jajaja
        System.out.println("ñam ñam " + nombre + " esta comiendo");
    }
    
    public void hablar(){
        //Genera numeros aleatorios y en base a eso da una respuesta
        //cuando se llama al metodo
        Random Rando = new Random();
        int numeroAleatorio = Rando.nextInt(1,7);
        
        switch(numeroAleatorio){
            case 1 -> {
                System.out.println("Hola");
            }
            case 2 -> {
                System.out.println("Como estas");
            }
            case 3 -> {
                System.out.println("Como te encuentras?");
            }
            case 4 -> {
                System.out.println("Encantado de Verte");
            }
            case 5 -> {
                System.out.println("Que haras este fin de semana?");
            }
            case 6 -> {
                System.out.println("Veras la F1 este fin de semana?");
            }
        }       
        
    }

    public Reloj getReloj() {
        return reloj;
    }
    
    public void decirHora(Reloj r){
        System.out.println("En este momento son las: " + r.getHora() + " del dia " + r.getDia() );
    }
    //Colocar la marca del reloj en el toString()
    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", reloj=" + reloj.getModelo() + '}';
    }
    
    
}
