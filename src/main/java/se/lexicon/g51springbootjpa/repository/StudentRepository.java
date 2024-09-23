package se.lexicon.g51springbootjpa.repository;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import se.lexicon.g51springbootjpa.entity.Student;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Repository
public interface StudentRepository extends CrudRepository<Student, String> {

    //1.
    // select * from student where first_name = ?;
    List<Student> findByFirstName(String firstName);

    //2.
    @Query("select s from Student s where s.firstName = :firstName")
    List<Student> findStudentByFullName(@Param("firstName") String name);


    //find students by their name containing a certain name
    //select * from student where first_name like '%name%';
    List<Student> findByFirstNameContaining(String name);

    //find student by creation date after a certain date
    List<Student> findByCreateDateAfter(LocalDateTime createDate);

    //find students by status true
    //select * from student where status = true;
    List<Student> findByStatusTrue();

    //find student by email (case-sensitive)
    Optional<Student> findByEmailIgnoreCase(String email);

    @Modifying
    //update the student status to true by student id
    @Query("update Student st set st.status = true where st.id = :studentId")
    void updateStudentStatusToTrue(@Param("studentId") String id);

    //find students by course id
    List<Student> findByCourse_Id(Long courseId);

    //find students by the course name
    List<Student> findByCourse_CourseName(String courseName);

}
