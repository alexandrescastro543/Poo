/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Estudio
 */
public class PezPlata implements SeresVivos{
    
    @Override
    public void aire(){
    }
    @Override
    public void caminar(){
    }
    @Override
    public void nadar(){
        System.out.println("El pez plata nada");

    }
    @Override
    public void respirarBajoAgua(){
        System.out.println("El pez plata respira bajo el agua");
    }
    
}
