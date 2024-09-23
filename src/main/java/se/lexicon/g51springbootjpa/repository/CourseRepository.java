package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g51springbootjpa.entity.Course;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {

    //find course by instructor id

}
