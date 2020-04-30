import javax.swing.*;

public class Principal {

    public static void main(String []args) {

        Thread semaforoUno  = new semaforo("Semaforo-1","Green");
        Thread semaforoDos = new semaforo("Semaforo-2","Red");

        semaforoUno.start();
        semaforoDos.start();
    }
}
