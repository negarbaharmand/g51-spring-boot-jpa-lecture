package se.lexicon.g51springbootjpa.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Entity
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(updatable = false)
    private Long id;

    @Column(nullable = false, length = 100)
    private String courseName;

    @OneToMany(mappedBy = "course")
    private Set<Student> students = new HashSet<>();

    public Course(String courseName) {
        this.courseName = courseName;
    }
}
