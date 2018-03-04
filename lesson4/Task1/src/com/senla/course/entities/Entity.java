package com.senla.course.entities;

public abstract class Entity {

    private int ID;
    private String name;

    public Entity(String name) {
        this.name = name;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    public String toString(){
        return getName() + getID();
    }

}
