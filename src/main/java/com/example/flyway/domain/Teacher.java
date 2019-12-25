package com.example.flyway.domain;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Getter
@EqualsAndHashCode(exclude = "id")
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    private String name;
    private String surname;
    private String pictureURL;

    @OneToMany(mappedBy = "teacher")
    private List<Contact> contacts;


}
