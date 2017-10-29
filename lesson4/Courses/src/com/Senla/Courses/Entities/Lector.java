package com.Senla.Courses.Entities;

import com.Senla.Courses.Entities.Entity;

public class Lector extends Entity {

    private Lection lection;

    public Lector(String name, Lection lection) {
        super(name);
        this.lection = lection;
    }

    Lection getLection() {
        return lection;
    }

}
