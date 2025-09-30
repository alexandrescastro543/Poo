/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package interfaces;

/**
 *
 * @author Sergio Alexander - Valentina Ortiz 
 */
public class Interfaces {

    public static void main(String[] args) {
        
        SeresVivos p = new Perro();
        p.aire();
        p.caminar();
        
        SeresVivos h = new Humano();
        Humano hu = new Humano();
        hu.hablar();
        h.aire();
        h.caminar();
        
        SeresVivos c = new Canario();
        Canario ca = new Canario();
        ca.volar();
        c.aire();
       
        SeresVivos pp = new PezPlata();
        pp.nadar();
        pp.respirarBajoAgua();
        
        SeresVivos l = new Lagarto();
        l.nadar();
        l.aire();
        l.caminar();
        
        SeresVivos r = new Rana();
        r.nadar();
        r.aire();
        r.caminar();
        r.respirarBajoAgua();
        
    }
    
}


