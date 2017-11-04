package ru.info.tech.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import ru.info.tech.models.Student;
import ru.info.tech.repositories.StudentRepository;

import java.util.List;

/**
 * Created by Sulaymon on 03.11.2017.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    @GetMapping("/students")
    public String getStudents(@ModelAttribute("model")ModelMap modelMap){
        List<Student> students = studentRepository.findAll();
        modelMap.addAttribute("students", students);
        return "students_page";
    }

    @PostMapping("/students")
    public String addStudent(@ModelAttribute Student student){
        studentRepository.save(student);
        return "redirect:/students";
    }
}
