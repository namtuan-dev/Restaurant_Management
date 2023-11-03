package com.hcr.swd392g3.project.dto;

import java.util.Date;


import com.hcr.swd392g3.project.entity.Person;

public class WaitlistDTO {

    private com.hcr.swd392g3.project.entity.Table table;

    private Person person;

    private Date bookingHour;


    public com.hcr.swd392g3.project.entity.Table getTable() {
        return table;
    }

    public void setTable(com.hcr.swd392g3.project.entity.Table table) {
        this.table = table;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public Date getBookingHour() {
        return bookingHour;
    }

    public void setBookingHour(Date bookingHour) {
        this.bookingHour = bookingHour;
    }


}
