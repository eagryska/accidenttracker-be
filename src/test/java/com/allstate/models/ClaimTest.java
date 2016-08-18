package com.allstate.models;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.text.SimpleDateFormat;

import static org.hamcrest.CoreMatchers.instanceOf;
import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.*;

public class ClaimTest {
    private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");

    @Before
    public void setUp() throws Exception {

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void shouldCreateAnInstanceOfClaim() throws Exception {
        Claim claim = new Claim();
        assertThat(claim, instanceOf(Claim.class));
    }

    @Test
    public void shouldGetAndSetDateOfClaim() throws Exception {
        Claim claim = new Claim();
        claim.setDate(format.parse("2015-03-11"));
        assertEquals("Wed Mar 11 00:00:00 CDT 2015", claim.getDate().toString());
    }

    @Test
    public void shouldGetAndSetphotolOfClaim() throws Exception {
        Claim claim = new Claim();
        claim.setPhoto("Accord");
        assertThat(claim.getPhoto(), is("Accord"));
    }

    @Test
    public void shouldGetAndSetlocationOfClaim() throws Exception {
        Claim claim = new Claim();
        claim.setLocation("Accord");
        assertThat(claim.getLocation(), is("Accord"));
    }
}