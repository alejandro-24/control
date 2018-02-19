package utng.alejandrotrujillo.controlvehicular.ControlV;

/**
 * Created by Alejandro on 18/02/2018.
 */

public class Bicicleta extends Vehiculo {
    private int rodada;
    private String tipoFrenos;
    private int noVelocidades;
    private boolean suspencionDelantera;
    private boolean suspencionTrasera;
    private String tipoLlantas;

    public Bicicleta(String color, String marca, String estadoVehiculo) {
        super(color, marca, estadoVehiculo);
    }

    public Bicicleta(String color, String marca, String estadoVehiculo,
                     int rodada, String tipoFrenos, int noVelocidades,
                     boolean suspencionDelantera, boolean suspencionTrasera,
                     String tipoLlantas) {

        super(color, marca, estadoVehiculo);
        this.rodada = rodada;
        this.tipoFrenos = tipoFrenos;
        this.noVelocidades = noVelocidades;
        this.suspencionDelantera = suspencionDelantera;
        this.suspencionTrasera = suspencionTrasera;
        this.tipoLlantas = tipoLlantas;
    }

    public int getRodada() {
        return rodada;
    }

    public void setRodada(int rodada) {
        this.rodada = rodada;
    }

    public String getTipoFrenos() {
        return tipoFrenos;
    }

    public void setTipoFrenos(String tipoFrenos) {
        this.tipoFrenos = tipoFrenos;
    }

    public int getNoVelocidades() {
        return noVelocidades;
    }

    public void setNoVelocidades(int noVelocidades) {
        this.noVelocidades = noVelocidades;
    }

    public boolean isSuspencionDelantera() {
        return suspencionDelantera;
    }

    public void setSuspencionDelantera(boolean suspencionDelantera) {
        this.suspencionDelantera = suspencionDelantera;
    }

    public boolean isSuspencionTrasera() {
        return suspencionTrasera;
    }

    public void setSuspencionTrasera(boolean suspencionTrasera) {
        this.suspencionTrasera = suspencionTrasera;
    }

    public String getTipoLlantas() {
        return tipoLlantas;
    }

    public void setTipoLlantas(String tipoLlantas) {
        this.tipoLlantas = tipoLlantas;
    }
}
