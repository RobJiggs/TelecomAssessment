/**
 * 
 */
package com.telecom.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.telecom.entity.CustomerCare;

/**
 * @author Robert Joasilus
 *
 * @date: Oct 25, 2022
 */
@Repository
public interface CustomerCareRepo extends JpaRepository<CustomerCare, Integer>{

}
