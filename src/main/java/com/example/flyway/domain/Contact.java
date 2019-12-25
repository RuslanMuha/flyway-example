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
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;

    @ManyToOne
    @JoinColumn (name = "teacher_id")
    private Teacher teacher;
    private String email;
    private String phone;


}
