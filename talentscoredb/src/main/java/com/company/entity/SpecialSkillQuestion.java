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
@Table(name = "special_skills_questions")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SpecialSkillQuestion {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "special_skill_questions")
    String specialSkillQuestion;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "specialSkillQuestionId", cascade = CascadeType.ALL)
    List<SpecialSkillUser> specialSkillUsers;
}
