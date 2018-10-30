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
public class Administrative extends Person{
    private String job;
    private int salary;

    public Administrative() {
        this("","","",0);
    }

    public Administrative(String name, String lastName,String department, int salary) {
        super(name, lastName);
        this.job = department;
        this.salary = salary;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Administrative{" + "department=" + job + ", salary=" + salary + '}';
    }
}
