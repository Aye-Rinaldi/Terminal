package ar.com.xeven;

public class Terminall {
    //atri
    private String numero;
    private int tiempoDeConveracion;

    //constructor
    public Terminall(String numero) {
        this.numero = numero;
        this.tiempoDeConveracion = 0;
    }

    //getters y setters
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public int getTiempoDeConveracion() {
        return tiempoDeConveracion;
    }

    public void setTiempoDeConveracion(int tiempoDeConveracion) {
        this.tiempoDeConveracion = tiempoDeConveracion;
    }

    //metodo llamar a otra terminal
    public void llamar(Terminall t, int segundosLlamada){
        this.tiempoDeConveracion += segundosLlamada;
        t.tiempoDeConveracion += segundosLlamada;
    }

    //toString
    @Override
    public String toString() {
        return numero+" - "+tiempoDeConveracion+" seg de conversacion";
    }
}
