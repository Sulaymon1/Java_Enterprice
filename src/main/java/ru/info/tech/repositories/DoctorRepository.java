package ru.info.tech.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.info.tech.models.Doctor;

import java.util.List;

/**
 * Created by Sulaymon on 03.11.2017.
 */
public interface DoctorRepository extends JpaRepository<Doctor, Long> {
    List<Doctor> findAllById(Long id);
}
