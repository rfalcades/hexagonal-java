package com.fts.hexagonal.application.ports.out;

import com.fts.hexagonal.application.core.domain.Address;

public interface FindAddressByZipCodeOutputPort {

    Address find(String zipCode);
}
