package com.allstate.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "claims")
public class Claim {
    @Id
    @GeneratedValue
    private int id;
    @Temporal(TemporalType.DATE)
    private Date date;
    private String photo;
    private String location;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPhoto() {
        return photo;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }
}
