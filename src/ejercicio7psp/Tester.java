 
package ejercicio7psp;

public class Tester extends Thread {

    static int mensajes = 5;
    String movimientos;

    public Tester(String str) {
        super(str);
        this.movimientos = str;
    }

    synchronized void Escritura() {
        mensajes++;
        System.out.println("escribiendo");
        
        
    }

    synchronized void Borrado() {
        mensajes--;
        System.out.println("borrando");
        
    }

    public void run() {
        
        if ("Escritura".equals(movimientos)) {
            Escritura.notify();
           
        }
        if (!"Borrado".equals(movimientos)) {
            Borrado.wait();
       
        }
        
           
        }

       
    

}