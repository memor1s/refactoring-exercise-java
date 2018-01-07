package com.greatersum.rental;

import org.approvaltests.Approvals;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;

public class RentalTests {
    @Test
    public void MartinTest() {
        Customer customer = new Customer("martin", Arrays.asList(new MovieRental("F001", 3),
                new MovieRental("F002", 1)));
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement(customer);
        Approvals.verify(actualResult);
    }

    @Test
    public void CarlTest() {
        Customer customer = new Customer("carl", Arrays.asList(new MovieRental("F001", 3),
                new MovieRental("F002", 1),
                new MovieRental("F003", 4),
                new MovieRental("F004", 5)));
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement(customer);
        Approvals.verify(actualResult);
    }

    @Test
    public void TroyTest() {
        Customer customer = new Customer("Troy", Collections.emptyList());
        RentalInfo info = new RentalInfo();
        String actualResult = info.statement(customer);
        Approvals.verify(actualResult);
    }
}
