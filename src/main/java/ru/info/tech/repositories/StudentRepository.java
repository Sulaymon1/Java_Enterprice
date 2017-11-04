package ru.info.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.info.tech.models.Student;

/**
 * Created by Sulaymon on 03.11.2017.
 */
public interface StudentRepository extends JpaRepository<Student, Long> {
}
