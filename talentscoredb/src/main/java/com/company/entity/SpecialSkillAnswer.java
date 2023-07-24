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
@Table(name = "special_skills_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SpecialSkillAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "special_skills_answers")
    String specialSkillsAnswer;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "specialSkillAnswerId", cascade = CascadeType.ALL)
    List<SpecialSkillUser> specialSkillUsers;
}
