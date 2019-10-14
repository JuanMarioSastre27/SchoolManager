/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

import abstractas.Person;

/**
 *
 * @author mario
 */
public class Student extends Person{
    private String bachelorsDegree;

    public Student(String name, String surnameF, String surnameM, String bachelorsDegree) {
        this.name = name; 
        this.surnameF = surnameF;
        this.surnameM = surnameM;
        this.bachelorsDegree = bachelorsDegree;
    }
    
    @Override
    public  String toString(){
        return super.toString() + " \nLicenciatura: " + bachelorsDegree;
    }

    
    
    
}
