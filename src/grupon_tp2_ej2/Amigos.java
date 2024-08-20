
package grupon_tp2_ej2;

public class Amigos {
    
    private String nombre;
    private String apodo;
    private String lugarDeResidencia;

    
    public Amigos(String nombre, String apodo, String lugarDeResidencia) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.lugarDeResidencia = lugarDeResidencia;
    }

   
    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getLugarDeResidencia() {
        return lugarDeResidencia;
    }

    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setLugarDeResidencia(String lugarDeResidencia) {
        this.lugarDeResidencia = lugarDeResidencia;
    }
}

