package com.anton.hr_department.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.sql.Date;

@Entity
@Table(name = "vacancy")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
public class VacancyModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idVacancy;

    @Column(name = "job_title")
    private String jobTitle;

    @Column(name = "date_of_publication")
    private Date dateOfPublication;

    @Column(name = "salary")
    private double salary;

    @Column(name = "id_requirements")
    private long idRequirements;
}
