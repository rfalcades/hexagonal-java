package com.fts.hexagonal.application.ports.out;

import com.fts.hexagonal.application.core.domain.Customer;

public interface InsertCustomerOutputPort {

    void insert(Customer customer);

}
