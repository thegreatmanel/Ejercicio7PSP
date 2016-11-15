/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7psp;

/**
 *
 * @author juchafernandez
 */
public class Movimientos {

    
    public static void main(String[] args) {
        
        for(int mensajes = 5;mensajes>=0;mensajes++){
        new Tester("Escritura").start();}
        for(int mensajes = 5;mensajes>0;mensajes--)
        {
        new Tester("Borrado").start();
        }
    }
    
}
    

