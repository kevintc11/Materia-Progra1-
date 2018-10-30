/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 * 
 * 
 *@version 23/octubre/2018
 * @author Kevin Trejos
 */
public class Student extends Person{
    private String career;
    private String id;
    
    
    public Student() {
        this("","", "", "");
    }

    public Student(String name, String lastName, String career, String id) {
        super(name, lastName);
        this.career = career;
        this.id = id;
    }

    public String getCareer() {
        return career;
    }

    public void setCareer(String career) {
        this.career = career;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return super.toString() + "Student{" + "career=" + career + ", id=" + id + '}';
    }    
}
