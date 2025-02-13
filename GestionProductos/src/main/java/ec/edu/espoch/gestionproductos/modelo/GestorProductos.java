/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.modelo;

/**
 *
 * @author jordy
 */
public class GestorProductos {
    int tamanoVector = 10;
    Producto[] productos = new Producto[tamanoVector];
    
    public String agregarProductos(Producto producto){
        int cont=0;
        String msg= "Ingreso exitoso";
        for (int i = 0; i < productos.length; i++) {
            if (productos[i]== null) {
                productos[i].setId(i++);
                productos[i].setNombre(producto.getNombre());
                productos[i].setPrecio(producto.getPrecio());
                productos[i].setDisponible(producto.isDisponible());
            }else{
                cont++;
            }    
        }
        if (cont==productos.length) {
            msg="El vector esta lleno";
        }
        return msg;
    }
    
    
    public Producto[] listarProductos(){
        
        Producto[] auxProductos = new Producto[tamanoVector];
        for (int i = 0; i < productos.length; i++) {
            if (productos[i].isDisponible()) {
                auxProductos[i].setId(productos[i].getId());
                auxProductos[i].setNombre(productos[i].getNombre());
                auxProductos[i].setPrecio(productos[i].getPrecio());
                auxProductos[i].setDisponible(productos[i].isDisponible());
            }
        }
        return auxProductos;
    }
}
