/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package interfaces;

/**
 *
 * @author Estudio
 */
public class Lagarto implements SeresVivos {
    
    @Override
    public void aire(){
        System.out.println("El lagarto respira");
    }
    @Override
    public void caminar(){
        System.out.println("El lagarto camina");
    }
    @Override
    public void nadar(){
        System.out.println("El lagarto nada");

    }
    @Override
    public void respirarBajoAgua(){
    }
    
}
