/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;


/**
 *
 * @author Estudio
 */

public class Perro implements SeresVivos{
    
    @Override
    public void aire(){
        System.out.println("El perro respira");
    }
    @Override
    public void caminar(){
        System.out.println("El perro camina");
    }
    @Override
    public void nadar(){
    }
    @Override
    public void respirarBajoAgua(){
    }
}
