package com.Senla.Courses.Entities;

public class Lector extends Entity {

    private Lection lection;

    public Lector(String name, Lection lection) {
        super(name);
    }


    Lection getLection() {
        return lection;
    }
    
    public void setLection(Lection lection){
        this.lection=lection;
    }

}
