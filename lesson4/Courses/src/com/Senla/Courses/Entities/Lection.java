package com.Senla.Courses.Entities;

import java.util.Calendar;
import java.util.Date;

public class Lection extends Entity {

    private Date date = new Date();
    private Calendar calendar = Calendar.getInstance();

    public Lection(String name) {
        super(name);
    }

    public void setDate(int month, int date, int hourOfDay, int minute) {
        int year = 2017;
        int second = 0;
        calendar.set(year, month, date, hourOfDay, minute, second);
    }

    public Date getDate() {
        return calendar.getTime();
    }

}
