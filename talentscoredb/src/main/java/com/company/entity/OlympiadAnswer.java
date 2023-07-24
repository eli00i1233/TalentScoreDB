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
@Table(name = "olympiad_answers")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OlympiadAnswer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @Column(name = "olympiad_answers")
    String olympiadAnswer;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @OneToMany(mappedBy = "olympiadAnswerId", cascade = CascadeType.ALL)
    List<OlympiadUser> olympiadUsers;
}
