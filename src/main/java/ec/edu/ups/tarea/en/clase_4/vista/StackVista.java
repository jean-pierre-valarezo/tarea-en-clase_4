/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase_4.vista;

import java.util.Scanner;
import java.util.Stack;

/**
 *
 * @author jeanp
 */
public class StackVista {
    public String getEntrada() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un signo de agrupación (o 'q' para salir): ");
        return scanner.nextLine();
    }

    public void mostrarError() {
        System.out.println("Error: el signo de agrupación no coincide.");
    }

    public void mostrarEstadoAgrupación(Stack<Character> stack) {
        StringBuilder estadoAgrupación = new StringBuilder();

        for (char c : stack) {
            estadoAgrupación.append(c).append(" , ");
        }

        System.out.println("Agrupación actual: " + estadoAgrupación.toString());
    } 
}
