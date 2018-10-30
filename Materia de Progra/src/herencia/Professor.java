/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia;

/**
 *@version 23/octubre/2018
 * @author Kevin Trejos
 */
public class Professor extends Person{
    private String department;
    private int salary;

    public Professor() {
        this("","","",0);
    }

    public Professor(String name, String lastName,String department, int salary) {
        super(name,lastName);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Professor{" + "department=" + department + ", salary=" + salary + '}';
    }    
}
