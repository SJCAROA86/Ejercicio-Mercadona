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
public class Bebidalcoholica extends Bebida {

    double graduacion;

    public void mostrar(){
        super.mostrar();
        System.out.println(this.graduacion);
    }
    public double getGraduacion() {
        return graduacion;
    }

    public void setGraduacion(double graduacion) {
        this.graduacion = graduacion;
    }

    public Bebidalcoholica(double graduacion, String azucar, int fechacaducidad, String codigo) {
        super(azucar, fechacaducidad, codigo);
        this.graduacion = graduacion;
    }

    public Bebidalcoholica() {
    }

}
