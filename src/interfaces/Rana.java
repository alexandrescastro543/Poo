/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Estudio
 */
public class Rana implements SeresVivos{
    
    @Override
    public void aire(){
        System.out.println("La rana respira");
    }
    @Override
    public void caminar(){
        System.out.println("La rana camina");
    }
    @Override
    public void nadar(){
        System.out.println("La rana nada");

    }
    @Override
    public void respirarBajoAgua(){
        System.out.println("La rana respira bajo el agua");
    }
    
}
