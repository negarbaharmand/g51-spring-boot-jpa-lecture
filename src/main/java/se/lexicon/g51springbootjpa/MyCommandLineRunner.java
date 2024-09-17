package se.lexicon.g51springbootjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import se.lexicon.g51springbootjpa.entity.Student;
import se.lexicon.g51springbootjpa.repository.StudentRepository;

@Component
public class MyCommandLineRunner implements CommandLineRunner {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
        studentRepository.save(new Student("John", "Doe", "johndoe@test.se"));


    }
}
