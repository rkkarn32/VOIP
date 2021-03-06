package org.voip.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.voip.model.Customer;

/**
 * DAO for Customer
 * 
 * @author malalanayake
 *
 */
@Repository
public interface CustomerDAO extends CrudRepository<Customer, Long> {

}
