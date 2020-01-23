/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ca.sheridancollege.week1.softwarefundamentals;

/**
 *
 * @author sidhu376 The date is January 23rd, 2020.
 */
public class Student {
    
    private String name;
    private String iD;
    private String email;
    private String program;
    private int age;
    
    public void setAge(int age){
        this.age = age;
    }
    public int getAge(){
        return age;
    }
    
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public void setProgram(String program){
        this.program = program;
    }
    
    public String getProgram(){
        return program;
    }
    

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getiD() {
        return iD;
    }

    /**
     * Get the value of name
     *
     * @return the value of name
     */
    public String getName() {
        return name;
    }

    /**
     * Set the value of name
     *
     * @param name new value of name
     */
    public void setName(String name) {
        this.name = name;
    }

}
 
   
