package com.company.entity;

import lombok.*;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "education_questions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EducationQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "education_questions")
    String educationQuestions;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "educationQuestionId", cascade = CascadeType.ALL)
    List<EducationUser> educationUsers;


}
