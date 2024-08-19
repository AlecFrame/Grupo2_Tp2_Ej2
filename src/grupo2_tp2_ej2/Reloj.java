
package grupo2_tp2_ej2;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;


public class Reloj {
    private String dia;
    private String hora;
    private String modelo;
    private long numSerie;

    public Reloj(String dia, String hora, String modelo, long numSerie) {
        this.dia = dia;
        this.hora = hora;
        this.modelo = modelo;
        this.numSerie = numSerie;
    }

    public String getDia() {
        return dia;
    }

    public String getHora() {
        return hora;
    }
    
    public void incrementarDia() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate fecha = LocalDate.parse(dia, formato);
        fecha = fecha.plusDays(1);
        dia = fecha.format(formato);
        System.out.println(" (Se incremento un dia al reloj)");
    }
    
    public void incrementarHora() {
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("HH:mm");
        LocalTime hora = LocalTime.parse(this.hora,formato);
        hora = hora.plusHours(1);
        this.hora = hora.format(formato);
        System.out.println(" (Se incremento una hora al reloj)");
    }
    
    public void limpiarPantalla() {
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }
    
    @Override
    public String toString() {
        return "modelo: "+modelo+",dia: "+dia+", hora: "+hora+", Numero de serie: "+numSerie;
    }
}
