package by.flameksandr.sms.repositories;

import by.flameksandr.sms.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
