package com.collegeapp.model;

/**
 *
 * @author Prithivi
 */
public class StudentModel {
    private int lmuId;
    private String name;
    private String program;
    private String contact;
    private short age;

    public StudentModel() {
    }

    public StudentModel(int lmuId, String name, String program, String contact, short age) {
        this.lmuId = lmuId;
        this.name = name;
        this.program = program;
        this.contact = contact;
        this.age = age;
    }
    
    public int getLmuId() {
        return lmuId;
    }

    public void setLmuId(int lmuId) {
        this.lmuId = lmuId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProgram() {
        return program;
    }

    public void setProgram(String program) {
        this.program = program;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public short getAge() {
        return age;
    }

    public void setAge(short age) {
        this.age = age;
    }    
}