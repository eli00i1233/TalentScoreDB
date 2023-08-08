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
@Table(name = "program_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ProgramUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "program_answer_id", referencedColumnName = "id")
    ProgramAnswer programAnswerId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "program_question_id", referencedColumnName = "id")
    ProgramQuestion programQuestionId;
}
