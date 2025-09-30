/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Estudio
 */
public class Humano implements SeresVivos{
    
    public void hablar(){
        System.out.println("El humano habla");
    }
    @Override
    public void aire(){
        System.out.println("El humano respira");
    }
    @Override
    public void caminar(){
        System.out.println("El humano camina");
    }
    @Override
    public void nadar(){
    }
    @Override
    public void respirarBajoAgua(){
    }
    
}
