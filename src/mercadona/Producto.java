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
public class Producto {

    public void mostrar(){
        System.out.println(this.codigo);
    }
    
    public Producto(String codigo) {
        this.codigo = codigo;
    }

    public Producto() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    
    protected String codigo;//con PROTECTED,  puedes acceder a los datos desde las clases hijas
    
}
