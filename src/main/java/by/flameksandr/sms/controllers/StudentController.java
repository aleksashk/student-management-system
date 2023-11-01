package by.flameksandr.sms.controllers;

import by.flameksandr.sms.services.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StudentController {

    private StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students")
    public String listStudent(Model model){
        model.addAttribute("students", studentService.getAllStudents());
        return "students";
    }
}
