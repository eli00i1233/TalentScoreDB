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
@Table(name = "experience_questions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExperienceQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "experience_questions")
    String experienceQuestions;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "experienceQuestionId", cascade = CascadeType.ALL)
    List<ExperienceUser> experienceUsers;
}
