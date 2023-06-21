/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ups.tarea.en.clase_4.modelo;

import java.util.Stack;

/**
 *
 * @author jeanp
 */
public class StackModelo {
   private Stack<Character> stack;

    public StackModelo() {
        stack = new Stack<>();
    }

    public void pushCaracter(char c) {
        stack.push(c);
    }

    public void popCaracter() {
        stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public Stack<Character> getStack() {
        return stack;
    } 
}
