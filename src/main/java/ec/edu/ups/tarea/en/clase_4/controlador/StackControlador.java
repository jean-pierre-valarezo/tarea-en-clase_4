/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase_4.controlador;

import ec.edu.ups.tarea.en.clase_4.modelo.StackModelo;
import ec.edu.ups.tarea.en.clase_4.vista.StackVista;

/**
 *
 * @author jeanp
 */
public class StackControlador {
   private StackModelo modelo;
    private StackVista vista;

    public StackControlador(StackModelo modelo, StackVista vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void procesoEntrada() {
        while (true) {
            String entrada = vista.getEntrada();

            if (entrada.equals("q")) {
                break;
            }

            char c = entrada.charAt(0);

            if (esAbiertoCaracter(c)) {
                modelo.pushCaracter(c);
            } else if (esCerradoCaracter(c)) {
                if (!modelo.isEmpty() && esParCoincidente(modelo.getStack().peek(), c)) {
                    modelo.popCaracter();
                } else {
                    vista.mostrarError();
                }
            }

            vista.mostrarEstadoAgrupación(modelo.getStack());
        }
    }

    private boolean esAbiertoCaracter(char c) {
        return c == '{' || c == '[' || c == '(';
    }

    private boolean esCerradoCaracter(char c) {
        return c == '}' || c == ']' || c == ')';
    }

    private boolean esParCoincidente(char abrir, char cerrar) {
        return (abrir == '{' && cerrar == '}') ||
                (abrir == '[' && cerrar == ']') ||
                (abrir == '(' && cerrar == ')');
    } 

    
}
