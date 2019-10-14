/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import modelos.*;
/**
 *
 * @author mario
 */
public class PruebaUno {
    public static void main(String[] args) {
        //Creamos el profesor
        Teacher teacher1 = new Teacher("Jose", "Lopez", "Hernandez", "Matematicas", " Dr. Matematicas");
       //Creamos la uea
       Uea uea = new Uea("Calculo integral", "1213314");
       //Limite de estudiantes
       int limit = 6;
       //Creamos la clave del grupo
       String groupKey = "CTG01";
       Manager manager = new Manager(uea, teacher1, limit, groupKey);
       //Agregamos a los alumnos al grupo 
       manager.addStudent(new Student("Mario", "Sastre", "Cuahutle", "ING Computacion"));
       manager.addStudent(new Student("Juan", "Martinez", "Perez", "ING Fisica"));
       manager.addStudent(new Student("Carlos", "Hernandez", "Juarez", "ING Ambiental"));
       manager.addStudent(new Student("Karla", "Samperio", "Leon", "ING Electronica"));
       manager.addStudent(new Student("Luis", "Flores", "Cortes", "ING Computacion"));
       manager.addStudent(new Student("Monserrat", "Olivos", "Martinez", "ING Electrica"));
       manager.addStudent(new Student("Jorge", "Perez", "Solis", "ING Quimica"));
       manager.addStudent(new Student("Brenda", "Leon", "Solis", "ING Computacion"));
       
       manager.addGroup();
       manager.showGroups();
    }
}
