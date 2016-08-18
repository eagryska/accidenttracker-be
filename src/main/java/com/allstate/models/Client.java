package com.allstate.models;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "clients")
public class Client {

    @Id
    @GeneratedValue
    private int id;

    private String name;
    private int payment;
    private int age;
    private String gender;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client")
    private List<Car> cars;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getPayment() {
        return payment;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGender() {
        return gender;
    }

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }
}
