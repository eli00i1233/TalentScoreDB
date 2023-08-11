package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "experience_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExperienceUser {
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
    @JoinColumn(name = "experience_answer_id", referencedColumnName = "id")
    ExperienceAnswer experienceAnswerId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "experience_question_id", referencedColumnName = "id")
    ExperienceQuestion experienceQuestionId;
    @Column(name = "experience_answers_string")
    String experienceAnswerString;
    @Column(name = "experience_answers_date")
    Date experienceAnswerDate;
}
