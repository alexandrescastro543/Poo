/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tallerlagartijas;

/**
 *
 * @author Estudio
 */
public class TallerLagartijas {

    
    public static void main(String[] args) {
        Alimentos alimentos = new Alimentos();
        Lagartijas lagartija = new Lagartijas();

        
        lagartija.comerMoscaAzul();
        lagartija.viva();
        lagartija.hambre();

        lagartija.comerMoscaVerde();
        lagartija.comerDona();
        lagartija.viva();
        lagartija.hambre();

        lagartija.comerDona();
        lagartija.comerDona();
        lagartija.zombie();

        lagartija.comerMoscaVerde();
        lagartija.viva();

    }
    
}
