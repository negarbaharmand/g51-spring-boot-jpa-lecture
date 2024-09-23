package se.lexicon.g51springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g51springbootjpa.entity.Address;
import se.lexicon.g51springbootjpa.entity.Student;
import se.lexicon.g51springbootjpa.repository.AddressRepository;
import se.lexicon.g51springbootjpa.repository.StudentRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Autowired
    AddressRepository addressRepository;

    @Override
    public void run(String... args) throws Exception {
        Address address = new Address("Test Street", "Test City", "12345");
        //Address savedAddress = addressRepository.save(address);
        studentRepository.save(new Student("John", "Doe", "johndoe@test.se", address));


    }
}
