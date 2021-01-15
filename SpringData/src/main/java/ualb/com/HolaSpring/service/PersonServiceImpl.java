package ualb.com.HolaSpring.service;

import java.util.List;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ualb.com.HolaSpring.dao.IPersonDAO;
import ualb.com.HolaSpring.domain.Person;

@Service
public class PersonServiceImpl implements IPersonService {

    @Autowired
    private IPersonDAO personDao;

    @Override
    @Transactional(readOnly = true)
    public List<Person> listPersons() { 
        return (List<Person>) personDao.findAll();
    }

    @Override
    @Transactional
    public void save(Person person) {
        personDao.save(person);
    }

    @Override
    @Transactional
    public void delete(Person person) {
        personDao.save(person);

    }

    @Override
    @Transactional(readOnly = true)
    public Person search(Person person) {
        return personDao.findById(person.getIdPerson()).orElse(null);
    }

}