
package grupon_tp2_ej2;

import animales.Gato;


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
        System.out.println("///// > Tremendo, genio Walter\n");
        
        Reloj reloj = new Reloj("19/08/2024","12:30","nuevo",456273);
        Persona persona = new Persona("Pedro",20,reloj);
        Auto auto = new Auto("rojo","Toyota",2016);
        Casa casa = new Casa(2,"Maipu, casa 22, mz2");
        Perro perro = new Perro("Piolin","Caniche",2);
        Gato gato = new Gato("Pomberito","Birmano",1,"negro");
        Amigos amigo = new Amigos("Marielo Morreno","Enano","Maipu, casa 4");
        
        System.out.println("Aqui se encuentra "+persona.getNombre()+" el tiene "+persona.getEdad()+" anios de edad");
        persona.comer();
        persona.hablar();
        persona.decirHora(reloj);
        persona.getReloj().incrementarDia();
        persona.getReloj().incrementarHora();
        persona.decirHora(reloj);
        
        System.out.println("\n"+persona.getNombre()+" tiene un auto "+auto.getMarca()+" "+auto.getColor()+" del "+auto.getAño());
        System.out.println(persona.getNombre()+" vive en una casa de "+casa.getHabitaciones()+" Habitaciones en "+casa.getDomicilio());
        System.out.println(persona.getNombre()+" tiene un "+perro.getRaza()+" llamado "+perro.getNombre()+" de "+perro.getEdad()+" años de edad");
        System.out.println(persona.getNombre()+" tiene un gato "+gato.getRaza()+" de color "+gato.getColor()+" llamado "+gato.getNombre()+" de "+gato.getEdad()+" añito de edad");
        System.out.println("y "+persona.getNombre()+" tiene un amigo llamado "+amigo.getNombre()+" al que llama "+amigo.getApodo()+" que vive en "+amigo.getLugarDeResidencia());
    }
    
}
