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
@Table(name = "program_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProgramAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "program_answers")
    String programAnswers;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "programAnswerId", cascade = CascadeType.ALL)
    List<ProgramUser> programUsers;
}
