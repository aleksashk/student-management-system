package by.flameksandr.sms;

import by.flameksandr.sms.repositories.StudentRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StudentManagementSystemApplication implements CommandLineRunner {

    public StudentManagementSystemApplication(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public static void main(String[] args) {
        SpringApplication.run(StudentManagementSystemApplication.class, args);
    }

    private final StudentRepository studentRepository;

    @Override
    public void run(String... args) throws Exception {
//        Student student1 = new Student("Aleks", "Flameks", "flameks@gmail.com");
//        Student student2 = new Student("Kate", "Limdaks", "kate@gmail.com");
//        Student student3 = new Student("Umma", "Turman", "umma@gmail.com");
//
//        studentRepository.saveAll(Arrays.asList(student1, student2, student3));
    }
}
