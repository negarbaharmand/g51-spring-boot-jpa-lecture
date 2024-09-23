package se.lexicon.g51springbootjpa.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;

@Getter
//@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@ToString //(exclude = "createDate")
//@Data

@Entity //(name = "_students")
//@Table(name = " ")
public class Student {

    @Id
    //@GeneratedValue(strategy = GenerationType.IDENTITY)
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(updatable = false)
    private String id;

    @Column(nullable = false, length = 100)
    @Setter
    private String firstName;

    @Column(nullable = false, length = 100)
    @Setter
    private String lastName;

    @Column(nullable = false, unique = true)
    @Setter
    private String email;

    @Setter
    private boolean status;

    private LocalDateTime createDate;


    @Setter
    @OneToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER) //student.getAddress
    @JoinColumn(name = "address_id")
    private Address address;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @Setter
    private Course course;


    public Student(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.status = true;
        this.createDate = LocalDateTime.now();
    }

    public Student(String firstName, String lastName, String email, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.address = address;
        this.status = true;
        this.createDate = LocalDateTime.now();
    }
}
