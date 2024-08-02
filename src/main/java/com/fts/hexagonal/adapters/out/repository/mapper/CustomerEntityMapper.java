package com.fts.hexagonal.adapters.out.repository.mapper;

import com.fts.hexagonal.adapters.out.repository.entity.CustomerEntity;
import com.fts.hexagonal.application.core.domain.Customer;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface CustomerEntityMapper {

    CustomerEntity toCustomerEntity(Customer customer);

}
