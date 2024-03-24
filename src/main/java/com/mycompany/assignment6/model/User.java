/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.assignment6.model;

/**
 *
 * @author vrind
 */
public class User {
    private String Name;
    private Integer Age;
    private Integer Id;

    public User(String Name, Integer Age, Integer Id) {
        this.Name = Name;
        this.Age = Age;
        this.Id = Id;
    }

    public User() {
    }
    
    
    
    
    
    //Getters Setters

    public Integer getAge() {
        return Age;
    }

    public Integer getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public void setAge(Integer Age) {
        this.Age = Age;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
    
    
    
}
