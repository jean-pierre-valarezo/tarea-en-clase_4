/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ec.edu.ups.tarea.en.clase_4;

import ec.edu.ups.tarea.en.clase_4.controlador.StackControlador;
import ec.edu.ups.tarea.en.clase_4.modelo.StackModelo;
import ec.edu.ups.tarea.en.clase_4.vista.StackVista;



/**
 *
 * @author jeanp
 */
public class TareaEnClase_4 {

    public static void main(String[] args) {
        StackModelo modelo = new StackModelo();
        StackVista vista = new StackVista();
        StackControlador controlador = new StackControlador(modelo, vista);
        controlador.procesoEntrada();
    }
}


