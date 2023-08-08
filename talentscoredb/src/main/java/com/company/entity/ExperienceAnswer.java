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
@Table(name = "experience_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExperienceAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "experience_answers")
    String experienceAnswers;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "experienceAnswerId", cascade = CascadeType.ALL)
    List<ExperienceUser> experienceUsers;
}
