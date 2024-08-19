
package grupo2_tp2_ej2;


public class Reloj {
    
    private String dia;
    private int conteoDia;
    private String hora;
    private String modelo;
    private long numSerie;
    
    public Reloj(){
        dia = "lunes";
        conteoDia = 1;
    }
    
    public String getDia(){
        return dia;
    }
    
    public String getHora(){
        return hora;
    }
    
    public void incrementarDia(){
        conteoDia += 1;
        if(conteoDia == 8){
            conteoDia = 1;
        }
        switch(conteoDia){
            case 1 ->{
                dia = "lunes";
            }
            case 2 ->{
                dia = "martes";
            }
            case 3 ->{
                dia = "miercoles";
            }
            case 4 ->{
                dia = "jueves";
            }
            case 5 ->{
                dia = "viernes";
            }
            case 6 ->{
                dia = "sabado";
            }
            case 7 ->{
                dia = "domingo";
            }
        }
    }    
    public void incrementarHora(){
        
    }
    public void limpiarPantalla(){
        
    }
}
