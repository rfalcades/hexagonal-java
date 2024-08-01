package com.fts.hexagonal.adapters.out;

import com.fts.hexagonal.adapters.out.client.FindByAddressByZipCodeClient;
import com.fts.hexagonal.adapters.out.client.mapper.AddressResponseMapper;
import com.fts.hexagonal.application.core.domain.Address;
import com.fts.hexagonal.application.ports.out.FindAddressByZipCodeOutputPort;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class FindAddressByZipCodeAdapter implements FindAddressByZipCodeOutputPort {

    @Autowired
    private FindByAddressByZipCodeClient findByAddressByZipCodeClient;

    @Autowired
    private AddressResponseMapper addressResponseMapper;

    @Override
    public Address find(String zipCode) {
        var addressResponse = findByAddressByZipCodeClient.find(zipCode);

        return addressResponseMapper.toAddress(addressResponse);
    }
}