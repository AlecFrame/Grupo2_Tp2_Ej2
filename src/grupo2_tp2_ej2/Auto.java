
package grupo2_tp2_ej2;


public class Auto {
    public String modelo;
    public String patente;
    public String color;
    public int añoM;
    
  
    //Sosa Chirino Marcos Antonio

    public Auto(String modelo, String patente, String color, int añoM) {
        this.modelo = modelo;
        this.patente = patente;
        this.color = color;
        this.añoM = añoM;
        
        
    }

    public String getModelo() {
        return modelo;
    }

    public String getPatente() {
        return patente;
    }

    public String getColor() {
        return color;
    }

    public int getAñoM() {
        return añoM;
    }
}
