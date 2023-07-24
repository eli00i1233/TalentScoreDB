package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;

import javax.persistence.*;

@Data
@Entity
@Table(name = "olympiad_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OlympiadUser {
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
    @JoinColumn(name = "olympiad_answer_id", referencedColumnName = "id")
    OlympiadAnswer olympiadAnswerId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "olympiad_question_id", referencedColumnName = "id")
    OlympiadQuestion olympiadQuestionId;
}
