/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Estudio
 */
public class Canario implements SeresVivos{
    
    
    public void volar(){
        System.out.println("El canario vuela");
    }
    
    @Override
    public void aire(){
        System.out.println("El canario respira");
    }
    @Override
    public void caminar(){
    }
    @Override
    public void nadar(){
    }
    @Override
    public void respirarBajoAgua(){
    }
    
}
