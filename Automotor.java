package utng.alejandrotrujillo.controlvehicular.ControlV;

/**
 * Created by Alejandro on 18/02/2018.
 */

public class Automotor extends Vehiculo{
    private String placa;
    private String serieMotor;
    private String tipoVehiculo;
    private String modelo;
    private int anio;

    public Automotor(String color, String marca, String estadoVehiculo) {
        super(color, marca, estadoVehiculo);
    }

    public Automotor(String color, String marca,
                     String estadoVehiculo, String placa,
                     String serieMotor, String tipoVehiculo,
                     String modelo, int anio) {

        super(color, marca, estadoVehiculo);
        this.placa = placa;
        this.serieMotor = serieMotor;
        this.tipoVehiculo = tipoVehiculo;
        this.modelo = modelo;
        this.anio = anio;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getSerieMotor() {
        return serieMotor;
    }

    public void setSerieMotor(String serieMotor) {
        this.serieMotor = serieMotor;
    }

    public String getTipoVehiculo() {
        return tipoVehiculo;
    }

    public void setTipoVehiculo(String tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }
}
