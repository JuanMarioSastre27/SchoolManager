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
public class Teacher extends Person {
    private String speciality;
    private String academicDegree;
    public Teacher(String name, String surnameF, String surnameM, String speciality, String academicDegree) {
        this.name = name;
        this.surnameF = surnameF;
        this.surnameM = surnameM;
        this.speciality = speciality;
        this.academicDegree = academicDegree;
    }
    
    @Override 
    public  String toString(){
        return super.toString() + "\nGrado academico: " + academicDegree; 
    }
    
    
}
