
package grupo2_tp2_ej2;

public class Test {

    public static void main(String[] args) {
        System.out.println("///// TP 2 - EJ 2 ,Grupo 2, Comision 2, por: /////");
        System.out.println("///// > Walter Alexander Vertacnik");
        System.out.println("///// > Ferro Julieta");
        System.out.println("///// > Maximo Quiroga");
        System.out.println("///// > Maycol Muñoz");
        System.out.println("///// > Villegas Loudres");
        System.out.println("///// > Patricia Pagnone");
        System.out.println("///// > Sosa Chirino Marcos Antonio");
        System.out.println("///// > Soto Vela Luciano Ezequiel");
        System.out.println("///// > Tremendo, genio Walter");
        
        Reloj reloj = new Reloj("19/08/2024","12:30","nuevo",456273);
        Persona persona = new Persona("Pedro",20,reloj);
        
        System.out.println("Aqui se encuentra "+persona.getNombre()+" el tiene "+persona.getEdad()+" anios de edad");
        persona.comer();
        persona.hablar();
        persona.decirHora(reloj);
        persona.getReloj().incrementarDia();
        persona.getReloj().incrementarHora();
        persona.decirHora(reloj);
        
    }
    
}
