package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Data
@Entity
@Table(name = "foreign_language_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ForeignLanguageAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "foreign_language_answers")
    String foreignLanguageAnswers;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "foreignLanguageAnswerId", cascade = CascadeType.ALL)
    List<ForeignLanguageUser> foreignLanguageUsers;
}
