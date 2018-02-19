package utng.alejandrotrujillo.controlvehicular.ControlV;

import java.util.Date;

/**
 * Created by Alejandro on 18/02/2018.
 */

public class Administrador extends Usuario {
    private String rfc;
    private String noEmpleado;
    public Administrador(String nombre, String apellidoPaterno,
                         String apellidoMaterno, String curp,
                         int edad, String direccion, String ciudad,
                         String pais, String email) {

        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad,
                direccion, ciudad, pais, email);
    }

    public Administrador(String nombre, String apellidoPaterno,
                         String apellidoMaterno, String curp,
                         int edad, String direccion, String ciudad,
                         String pais, String email, String rfc,
                         String noEmpleado) {
        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad,
                direccion, ciudad, pais, email);

        this.rfc = rfc;
        this.noEmpleado = noEmpleado;
    }

    public String getRfc() {
        return rfc;
    }

    public void setRfc(String rfc) {
        this.rfc = rfc;
    }

    public String getNoEmpleado() {
        return noEmpleado;
    }

    public void setNoEmpleado(String noEmpleado) {
        this.noEmpleado = noEmpleado;
    }

    public static void generarTarjeta (){

        System.out.println("Metodo generarTarjeta");
    }

    public static int getTotalVehiculos (Date fechaInicial, Date fechaFinal){

        System.out.println("Metodo getTotalVehiculos");
        return 0;
    }

    public static int getAutosHoraPico (Date fecha){

        System.out.println("Metodo getAutosHoraPico");
        return 0;
    }

    public static int getTotalVehiculosTipo (Date fecha, String tipoVehiculo){

        System.out.println("Metodo getTotalVehiculosTipo");
        return 0;
    }

    public static String getDatosVehiculo (String placa, String motor, String NombreAutomovilista){

        System.out.println("Metodo getDatosVehiculo");
        return null;
    }
}
