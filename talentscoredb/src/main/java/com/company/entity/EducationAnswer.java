package com.company.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "education_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EducationAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "education_answers")
    String educationAnswers;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "educationAnswerId", cascade = CascadeType.ALL)
    List<EducationUser> educationUsers;


}
