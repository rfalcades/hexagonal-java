package com.fts.hexagonal.application.ports.in;

import com.fts.hexagonal.application.core.domain.Customer;

public interface InsertCustomerInputPort {

    void insert(Customer customer, String zipCode);

}
