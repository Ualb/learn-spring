package ualb.com.HolaSpring.service;

import java.util.List;

import ualb.com.HolaSpring.domain.Person;

public interface IPersonService {
    public List<Person> listPersons();
    public void save(Person person);
    public void delete(Person person);
    public Person search(Person person);
}
