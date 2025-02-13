/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.espoch.gestionproductos.controlador;

import ec.edu.espoch.gestionproductos.modelo.GestorProductos;
import ec.edu.espoch.gestionproductos.modelo.Producto;
import ec.edu.espoch.gestionproductos.vista.ListarProductos;
import ec.edu.espoch.gestionproductos.vista.Principal;

/**
 *
 * @author jordy
 */
public class Controlador {

    private ListarProductos listar;
    private GestorProductos modelo;
    private Principal vista;

    public Controlador(Principal vista) {
        this.modelo = new GestorProductos();
        this.vista = vista;
    }

    public void agregarProducto() {

        try {
            if (this.vista != null) {               
                /*Producto objProducto = new Producto();
                objProducto.setNombre(this.vista.getNombre());
                objProducto.setPrecio(this.vista.getPrecio());
                objProducto.setDisponible(this.vista.getEstado());*/

            } else {
                vista.error("Ingresa los datos");
            }
        } catch (Exception e) {
            vista.error("llama al gerente");
        }

    }

    public void listarTareas() {
        try {
            Producto[] listarProductos = new Producto[5];
            listarProductos = modelo.listarProductos();
            listar.error("error");
        } catch (Exception e) {
            listar.error("Error: " + e.getMessage());
        }
    }
}
