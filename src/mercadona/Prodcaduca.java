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
public class Prodcaduca extends Producto {

    public Prodcaduca() {
    }

    public void mostrar() {
        super.mostrar();//SUPER, se usa para sobrecarga de método en las clases, muestra los atributos de la CLASE PADRE
        System.out.println(this.fechacaducidad);
    }

    public Prodcaduca(int fechacaducidad, String codigo) {
        super(codigo);
        this.fechacaducidad = fechacaducidad;
    }

    public int getFechacaducidad() {
        return fechacaducidad;
    }

    public void setFechacaducidad(int fechacaducidad) {
        this.fechacaducidad = fechacaducidad;
    }

    protected int fechacaducidad;
}
