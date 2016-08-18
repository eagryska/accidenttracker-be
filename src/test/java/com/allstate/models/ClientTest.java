package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClientTest {
    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfClient() throws Exception {
        Client client = new Client();
        assertThat(client, instanceOf(Client.class));
    }

    @Test
    public void shouldGetAndSetNameOfClient() throws Exception {
        Client client = new Client();
        client.setName("Billy");
        assertThat(client.getName(), is("Billy"));
    }
    @Test
    public void shouldGetAndSetPaymentforClient() throws Exception {
        Client client = new Client();
        client.setPayment(60);
        assertThat(client.getPayment(), is(60));
    }
    @Test
    public void shouldGetAndSetAgeforClient() throws Exception {
        Client client = new Client();
        client.setAge(30);
        assertThat(client.getAge(), is(30));
    }
    @Test
    public void shouldGetAndSetGenderforClient() throws Exception {
        Client client = new Client();
        client.setGender("M");
        assertThat(client.getGender(), is("M"));
    }


}