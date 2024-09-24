package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import se.lexicon.g51springbootjpa.entity.Course;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends CrudRepository<Course, Long> {
    //1.find course by instructor id
    List<Course> findByInstructors_Id(Long instructorId);

    //2.@Query(value = "select * from course c join courses_instructors ci on c.id = ci.course_id join instructor i on i.id = ci.instructor_id where i.id = :instructorId", nativeQuery = true)
    //3.
    @Query("select c from Course c inner join c.instructors instructors where instructors.id = :instructorId")
    List<Course> findCoursesByInstructorId(Long instructorId);

    //find courses by student id
    Optional<Course> findByStudents_Id(String StudentId);

    //find all courses ordered by course name
    List<Course> findAllByOrderByCourseNameAsc();

    //find all courses with no enrolled students
    List<Course> findByStudentsIsEmpty();

}
