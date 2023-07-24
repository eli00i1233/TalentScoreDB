package com.company.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.ToString;
import lombok.experimental.FieldDefaults;
import org.hibernate.type.IntegerType;

import javax.persistence.*;

@Data
@Entity
@Table(name = "foreign_language_users")
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ForeignLanguageUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    Integer id;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "id")
    User userId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "foreign_language_answers_id", referencedColumnName = "id")
    ForeignLanguageAnswer foreignLanguageAnswerId;
    @ToString.Exclude
    @EqualsAndHashCode.Exclude
    @ManyToOne
    @JoinColumn(name = "foreign_language_questions_id", referencedColumnName = "id")
    ForeignLanguageQuestion foreignLanguageQuestionId;
}
