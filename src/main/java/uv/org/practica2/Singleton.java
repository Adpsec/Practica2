/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uv.org.practica2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kali
 */
public class Singleton {
    
    private static Singleton s = null;
    public static Singleton getInstance(){
        if(s==null){
            s = new Singleton();
        }
        return s;
    }
    
    private Singleton(){
    }
    public void imprimir(){
        Logger.getLogger(Practica2.class.getName()).log(Level.INFO, "Imprimiendo");
    }
}
