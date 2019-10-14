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
public class Group {
    private Uea uea;
    private ArrayList <Student> students ;
    private ArrayList <Student> studentsRejected;
    private Teacher teacher;
    private  int studentsLimit;
    private  String groupKey;

    public Group(Uea uea, /*ArrayList <Student> students,*/ Teacher teacher, int studentsLimit, String groupKey) {
        this.uea = uea;
        //this.students = students;
        students = new ArrayList <>();
        studentsRejected = new ArrayList <>();
        this.teacher = teacher;
        this.studentsLimit = studentsLimit;
        
        this.groupKey = groupKey;
    }
    
    public ArrayList getStudents(){
        return students;
    }
    
     public ArrayList getStudentsRejected(){
        return studentsRejected;
    }
    
    public int getStudentsLimit(){
        return this.studentsLimit;
    }
    
    public boolean verify(int students, int studentsLimit){
        return students < studentsLimit;
    }
    
    public void addStudent(Student student){
        if(verify(students.size(), studentsLimit)){
            students.add(student);
        }else{
            //System.out.println("El grupo esta lleno.");
            studentsRejected.add(student);
        }
    }
    
    @Override 
    public String toString(){
        return "Clave grupo: " + groupKey + "\n" + uea.toString() + "\nCupo del grupo: " + studentsLimit + "\nEstudiantes inscritos: " + students.size() + "\nProfesor:" + teacher.toString()
                ;
    }
    
}
