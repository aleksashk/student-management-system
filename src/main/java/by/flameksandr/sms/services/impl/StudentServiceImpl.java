package by.flameksandr.sms.services.impl;

import by.flameksandr.sms.entities.Student;
import by.flameksandr.sms.repositories.StudentRepository;
import by.flameksandr.sms.services.StudentService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

    private StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }
}
