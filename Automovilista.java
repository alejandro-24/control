package utng.alejandrotrujillo.controlvehicular.ControlV;

/**
 * Created by Alejandro on 18/02/2018.
 */

public class Automovilista extends Usuario {
    private boolean esEmpleado;
    private int numeroIdentificacion;
    private String licencia;
    private String tarjetaCirculacion;
    private String celular;
    private String telefono;

    public Automovilista(String nombre, String apellidoPaterno,
                         String apellidoMaterno, String curp,
                         int edad, String direccion, String ciudad,
                         String pais, String email) {

        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad,
                direccion, ciudad, pais, email);
    }

    public Automovilista(String nombre, String apellidoPaterno,
                         String apellidoMaterno, String curp,
                         int edad, String direccion, String ciudad,
                         String pais, String email, boolean esEmpleado,
                         int numeroIdentificacion, String licencia,
                         String tarjetaCirculacion, String celular, String telefono) {

        super(nombre, apellidoPaterno, apellidoMaterno, curp, edad,
                direccion, ciudad, pais, email);
        this.esEmpleado = esEmpleado;
        this.numeroIdentificacion = numeroIdentificacion;
        this.licencia = licencia;
        this.tarjetaCirculacion = tarjetaCirculacion;
        this.celular = celular;
        this.telefono = telefono;
    }

    public boolean isEsEmpleado() {
        return esEmpleado;
    }

    public void setEsEmpleado(boolean esEmpleado) {
        this.esEmpleado = esEmpleado;
    }

    public int getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(int numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getLicencia() {
        return licencia;
    }

    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }

    public String getTarjetaCirculacion() {
        return tarjetaCirculacion;
    }

    public void setTarjetaCirculacion(String tarjetaCirculacion) {
        this.tarjetaCirculacion = tarjetaCirculacion;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public static void registrarDatos (){
        System.out.println("Metodo registrarDatos");
    }

    public static void ingresar (){
        System.out.println("Metodo ingresar");
    }

    public static void salir (){
        System.out.println("Metodo salir");
    }

}

