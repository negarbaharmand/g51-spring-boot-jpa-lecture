package se.lexicon.g51springbootjpa.repository;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.transaction.annotation.Transactional;
import se.lexicon.g51springbootjpa.entity.Student;

import java.util.Optional;

@DataJpaTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    @Transactional
    public void testSaveAndFindById() {
        //1. Arrange
        Student student = new Student("John", "Doe", "johndoe@test.se");

        //2. Act
        Student savedStudent = studentRepository.save(student);

        //3. Assert
        Assertions.assertNotNull(savedStudent);
        Assertions.assertNotNull(savedStudent.getId());

        Optional<Student> foundStudent = studentRepository.findById(savedStudent.getId());
        Assertions.assertTrue(foundStudent.isPresent());

    }


}
