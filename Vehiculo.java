package utng.alejandrotrujillo.controlvehicular.ControlV;


/**
 * Created by Alejandro on 18/02/2018.
 */

public abstract class Vehiculo {
    private String color;
    private String marca;
    private String estadoVehiculo;

    public Vehiculo(String color, String marca, String estadoVehiculo) {
        this.color = color;
        this.marca = marca;
        this.estadoVehiculo = estadoVehiculo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstadoVehiculo() {
        return estadoVehiculo;
    }

    public void setEstadoVehiculo(String estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }
}
