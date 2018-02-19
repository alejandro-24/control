package utng.alejandrotrujillo.controlvehicular.ControlV;

import java.util.Date;
/**
 * Created by Alejandro on 18/02/2018.
 */

public class Movimientos {
    private String tipoMovimiento;
    private Date fechaMovimiento;
    private String placa;
    private String nombreGuardia;

    public Movimientos(String tipoMovimiento,
                       Date fechaMovimiento,
                       String placa,
                       String nombreGuardia) {
        this.tipoMovimiento = tipoMovimiento;
        this.fechaMovimiento = fechaMovimiento;
        this.placa = placa;
        this.nombreGuardia = nombreGuardia;
    }

    public String getTipoMovimiento() {
        return tipoMovimiento;
    }

    public void setTipoMovimiento(String tipoMovimiento) {
        this.tipoMovimiento = tipoMovimiento;
    }

    public Date getFechaMovimiento() {
        return fechaMovimiento;
    }

    public void setFechaMovimiento(Date fechaMovimiento) {
        this.fechaMovimiento = fechaMovimiento;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombreGuardia() {
        return nombreGuardia;
    }

    public void setNombreGuardia(String nombreGuardia) {
        this.nombreGuardia = nombreGuardia;
    }

    public static void registraUbicacionAutomovilista (){
        System.out.println("Metodo registraUbicacionAutomovilista");
    }
}