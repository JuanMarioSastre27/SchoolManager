/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractas;

/**
 *
 * @author Usuario
 */
public abstract class Person {
    
    protected String name; 
    protected String surnameF;
    protected String surnameM;
     
    @Override
    public String toString(){
        return "\nNombre: " + name + "\nApellido Paterno: " + surnameF + "\nApellido Materno: " + surnameM;
    }
}
