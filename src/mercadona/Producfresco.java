/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

/**
 *
 * @author usuario
 */
public class Producfresco extends Prodcaduca {

    double temperatura;

    public void mostrar() {
        super.mostrar();
        System.out.println(this.temperatura);
    }

    public double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public Producfresco(double temperatura, int fechacaducidad, String codigo) {
        super(fechacaducidad, codigo);
        this.temperatura = temperatura;
    }

    public Producfresco() {
    }

}
