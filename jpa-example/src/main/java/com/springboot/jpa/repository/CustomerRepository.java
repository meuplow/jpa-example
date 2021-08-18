/**
 * 
 */
package com.springboot.jpa.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springboot.jpa.entity.Customer;

/**
 * @author Gabriel
 *
 */

public interface CustomerRepository extends CrudRepository<Customer, Long> {

  List<Customer> findByLastName(String lastName);

  Customer findById(long id);
}