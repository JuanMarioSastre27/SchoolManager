/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package respaldos;

/**
 *
 * @author Usuario
 */
public class PersonaRespaldo {
    protected String name; 
    protected String surnameF;
    protected String surnameM;

    public PersonaRespaldo(String name, String surnameF, String surnameM) {
        this.name = name;
        this.surnameF = surnameF;
        this.surnameM = surnameM;
    }
    
    @Override
    public String toString(){
        return "\nNombre: " + name + "\nApellido Paterno: " + surnameF + "\nApellido Materno: " + surnameM;
    }
}
