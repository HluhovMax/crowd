package com.company.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by 38066 on 14.02.2019.
 */
@Entity
@Table(name = "employee")
@Data
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;
    private String patronymic;
}
