package ru.info.tech.models;

import lombok.*;

import javax.persistence.*;

/**
 * Created by Sulaymon on 24.09.2017.
 */
@Setter
@Getter
@Builder
@ToString
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity
@Table(name = "doctors")
public class Doctor  {

   @Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   private Long id;

   private String name;
   private String surname;
   private String position;
}
