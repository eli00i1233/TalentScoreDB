package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Table(name = "special_skills_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SpecialSkillUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id",referencedColumnName = "id")
    User userId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "special_skills_answers_id", referencedColumnName = "id")
    SpecialSkillAnswer specialSkillAnswerId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "special_skills_questions_id", referencedColumnName = "id")
    SpecialSkillQuestion specialSkillQuestionId;
}
