/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

/**
 *
 * @author mario
 */
public class Uea {
    
    private String name; 
    private String key;

    public Uea(String name, String key) {
        this.key = key;
        this.name = name;
    }
    
    
    @Override 
    
    public  String toString(){
        return "UEA: " + name + "\nClave de UEA: " + key;
    }
    
    
}
