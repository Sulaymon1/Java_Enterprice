package ru.info.tech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.info.tech.models.Doctor;
import ru.info.tech.repositories.DoctorRepository;

import java.util.List;

/**
 * Created by Sulaymon on 03.11.2017.
 */
@Controller
public class DoctorController {

    @Autowired
    private DoctorRepository doctorRepository;

    @GetMapping("/doctors")
    public String geDoctors(@ModelAttribute("model")ModelMap model){
        List<Doctor> doctors = doctorRepository.findAll();
        model.addAttribute("doctors", doctors);
        return "doctors_page";
    }

    @PostMapping("/doctors")
    public String addDoctor(@ModelAttribute Doctor doctor){
        doctorRepository.save(doctor);
        return "redirect:/doctors";
    }
}
