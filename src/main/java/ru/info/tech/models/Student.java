package ru.info.tech.models;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Sulaymon on 24.09.2017.
 */
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name = "students")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String surname;
    private String group_number;
    private long telefon;
}
