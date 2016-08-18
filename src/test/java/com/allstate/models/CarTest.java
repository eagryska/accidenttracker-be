package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class CarTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfCar() throws Exception {
        Car car = new Car();
        assertThat(car, instanceOf(Car.class));
    }

    @Test
    public void shouldGetAndSetMakeOfCar() throws Exception {
        Car car = new Car();
        car.setMake("Honda");
        assertThat(car.getMake(), is("Honda"));
    }

    @Test
    public void shouldGetAndSetModelOfCar() throws Exception {
        Car car = new Car();
        car.setModel("Accord");
        assertThat(car.getModel(), is("Accord"));
    }

    @Test
    public void shouldGetAndSetYearOfCar() throws Exception {
        Car car = new Car();
        car.setYear("2012");
        assertThat(car.getYear(), is("2012"));
    }

    @Test
    public void shouldGetAndSetColorOfCar() throws Exception {
        Car car = new Car();
        car.setColor("Red");
        assertThat(car.getColor(), is("Red"));
    }

    @Test
    public void shouldGetAndSetClientIdOfCar() throws Exception {
        Car car = new Car();
        Client client = new Client();
        client.setName("Bob");
        car.setClient(client);
        assertThat(car.getClient().getName(), is("Bob"));
    }

}