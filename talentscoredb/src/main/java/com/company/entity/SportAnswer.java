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
@Table(name = "sport_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class SportAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "sport_answers")
    String sportAnswers;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "sportAnswerId", cascade = CascadeType.ALL)
    List<SportUser> sportUsers;
}