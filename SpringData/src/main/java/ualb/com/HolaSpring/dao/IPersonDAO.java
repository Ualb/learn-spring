package ualb.com.HolaSpring.dao;

import org.springframework.data.repository.CrudRepository;

import ualb.com.HolaSpring.domain.Person;

public interface IPersonDAO extends CrudRepository<Person, Long> {
    
}
