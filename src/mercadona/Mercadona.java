/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mercadona;

import java.util.ArrayList;

/**
 *
 * @author usuario
 */
public class Mercadona {

    static ArrayList<Empleado> empleados = new ArrayList<>();
    static ArrayList<Producto> productos = new ArrayList<>();

    public static void rellenarDatos() {

        for (int i = 0; i < 10; i++) {
            empleados.add(new Empleado("FULANITO" + i, (int) (Math.random() * (40 - 25) + 25)));
        }

        for (int i = 0; i < 50; i++) {
            if (i < 20) {
                productos.add(new Producfresco(15 + i, 201217 + i, "COD011" + i));
            } else if (i < 25) {
                productos.add(new Bebida("con azucar" + i, 121217 + i, "COD008" + i));
            } else if (i < 35) {
                productos.add(new Bebidalcoholica(25.5 + i, "sin azucar" + i, 200520 + i, "COD 004" + i));
            } else if (i < 50) {
                productos.add(new Prodcaduca(301216 + i, "COD 001"));
            }
        }

    }

    public static void mostrarTodosLosProductos() {
        for (Producto producto : productos) {
            producto.mostrar();

            System.out.println();
        }
    }

    public static void mostrarMediaGraduacionBebidasAlcoholicas() {
      
        double suma = 0;
        int elementos = 0;
        for (int i = 0; i < productos.size(); i++) {
            if (productos.get(i) instanceof Bebidalcoholica) {
                suma = suma + ((Bebidalcoholica)productos.get(i)).getGraduacion();
                elementos++;
            }
        }
        System.out.println(suma/elementos);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        rellenarDatos();
        mostrarTodosLosProductos();
        mostrarMediaGraduacionBebidasAlcoholicas();
    }

}
