/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;
import java.util.ArrayList;
/**
 *
 * @author mario
 */
public class Manager {
    private Group group; 
    private ArrayList <Group> groups;
    //Gestion del grupo directo
    private Uea uea;
    private ArrayList <Student> students ;
    private Teacher teacher;
    private  int studentsLimit;
    private  String groupKey;
    
    
    
    
    public Manager(Uea uea, Teacher teacher, int studentsLimit, String groupKey) {
        this.uea = uea;
        this.students = students;
        this.teacher = teacher;
        this.studentsLimit = studentsLimit;
        this.groupKey = groupKey;
        group = new Group(uea, teacher, studentsLimit, groupKey);
        groups = new ArrayList <>();
    }
    
    public void addStudent(Student student){
        group.addStudent(student);
    }
    
    public  void addGroup(){                
        groups.add(group);
    }
    
    public void showGroups(){
        System.out.println("############## Grupos registrados #############");
        ArrayList <Student> students = new ArrayList<>();
        ArrayList <Student> studentsRejected = new ArrayList<>();
        for(Group group : groups){
            System.out.println("######################################");
            System.out.println("######################################");
            System.out.println(group.toString());
            students = group.getStudents();
            studentsRejected = group.getStudentsRejected();
            
            showStudents(students, studentsRejected);
            /*
            System.out.println("--------------------- ALUMNOS INSCRITOS -------------------");
            for(Student student : students){
                System.out.println("----------------------------------------------------");
                System.out.println(student.toString());
            }
           */
        }
    }
    
    public void showStudents(ArrayList <Student> students, ArrayList <Student> studentsRejected){
        System.out.println("***************************************************************");
        System.out.println("--------------------- ALUMNOS INSCRITOS -------------------");
        for(Student student : students){
            System.out.println("----------------------------------------------------");
            System.out.println(student.toString());
        }
        if(studentsRejected.size() > 0){
            System.out.println("***************************************************************");
            System.out.println("------------------ ALUMNOS RECHAZADOS POR CUPO ----------------");
            for(Student studentRejected : studentsRejected){
                System.out.println("----------------------------------------------------");
                System.out.println(studentRejected.toString());
            }
        }
        
    }
    
    @Override
    
    public String toString(){
        return null;
    }
}
