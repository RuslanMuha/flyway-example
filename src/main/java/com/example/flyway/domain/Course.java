package com.example.flyway.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@EqualsAndHashCode(exclude = "id")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String  id;
    private String name;
    private int workload;
    private short rate;
    @ManyToOne
    @JoinColumn(name = "teacher_id")
    private Teacher teacher;
}
