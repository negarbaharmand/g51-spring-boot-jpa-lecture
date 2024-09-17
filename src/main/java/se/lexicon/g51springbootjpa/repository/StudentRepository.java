package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g51springbootjpa.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {


}
