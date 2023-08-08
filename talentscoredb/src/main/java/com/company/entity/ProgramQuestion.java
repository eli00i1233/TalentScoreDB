package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "program_questions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProgramQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "program_questions")
    String programQuestions;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "programQuestionId", cascade = CascadeType.ALL)
    List<ProgramUser> programUsers;
}