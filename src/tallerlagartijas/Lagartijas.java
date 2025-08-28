/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tallerlagartijas;

/**
 *
 * @author Estudio
 */
public class Lagartijas {
    
    String llena;
    String hambre;
    String zombie;
    String viva;
    int estomago;

    public Lagartijas() {
        llena = "LLENA";
        hambre = "CON HAMBRE";
        zombie = "ZOMBI";
        viva = "VIVA";
        estomago = 0;
    }

    public void comerMoscaAzul() {
        estomago += 1;
    }

    public void comerMoscaVerde() {
        estomago += 2;
        }

    public void comerDona() {
        estomago -= 3;
    }

    public void hambre() {
        if (estomago < 10 && estomago >= 0) {
            System.out.println(hambre + " (" + estomago + ")");
        }
    }

    public void viva() {
        if (estomago >= 0) {
            System.out.println(viva + " (" + estomago + ")");
        }
    }

    public void llena() {
        if (estomago >= 10) {
            System.out.println(llena + " (" + estomago + ")");
        }
    }
    
    public void zombie() {
        if (estomago < 0) {
            System.out.println(zombie + " (" + estomago + ")");
        }
    }
}
