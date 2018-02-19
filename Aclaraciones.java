package utng.alejandrotrujillo.controlvehicular.ControlV;
import java.util.Date;

/**
 * Nombre Clase: Aclaraciones
 * Creado por: Alejandro on 14/02/2018.
 */

public class Aclaraciones {
    private String nombreCompleto;
    private Date fecha;
    private String descripcion;
    private int noIncidencia;
    private int estadoIncidencia;

    public Aclaraciones(String nombreCompleto,
                        Date fecha, String descripcion,
                        int noIncidencia, int estado) {
        this.nombreCompleto = nombreCompleto;
        this.fecha = fecha;
        this.descripcion = descripcion;
        this.noIncidencia = noIncidencia;
        this.estadoIncidencia = estadoIncidencia;
}
    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNoIncidencia() {
        return noIncidencia;
    }

    public void setNoIncidencia(int noIncidencia) {
        this.noIncidencia = noIncidencia;
    }

    public int getEstadoIncidencia() {
        return estadoIncidencia;
    }

    public void setEstado(int estadoIncidencia) {
        this.estadoIncidencia = estadoIncidencia;
    }

    public static void verificarVigencia (){

        System.out.println("Metodo verificarVigencia");
    }
}
