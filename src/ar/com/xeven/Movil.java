package ar.com.xeven;

import java.text.DecimalFormat;

/*
Implementa la clase Movil como subclase de Terminal.
Cada móvil lleva asociada una tarifa que puede ser “rata”, “mono” o “bisonte”.
El coste por minuto es de 6, 12 y 30 céntimos respectivamente
Se tarifican los segundos exactos.
Obviamente,cuando un móvil llama a otro, se le cobra al que llama, no al que recibe la
llamada.
 */
public class Movil extends Terminall{
    //atributos
    private String tarifa;
    private double totalTarifado;

    //constructor
    public Movil(String numero, String tarifa) {
        super(numero);
        this.tarifa = tarifa;
        this.totalTarifado = 0;
    }

    //metodo llamar
    @Override
    public void llamar(Terminall t, int segundosLlamada) {
        super.llamar(t, segundosLlamada); //calcula los seg de llamada
        Double minutos = Double.valueOf(segundosLlamada / 60); //calculo los minutos de llamada

        switch (this.tarifa){
            case "rata":
                this.totalTarifado += minutos * 0.06;
                break;
            case "mono":
                this.totalTarifado += minutos * 0.12;
                break;
            case "bisonte":
                this.totalTarifado += minutos * 0.30;
                break;
            default:
        }
    }

    @Override
    public String toString() {
        DecimalFormat formatoEuros = new DecimalFormat("0.00");
        return "Nro "+getNumero()+" - "+getTiempoDeConveracion()+
                " seg de conversacion - tarifados "
                +formatoEuros.format(totalTarifado)+" euros";
    }
}
