package com.codeway.devopscasestudy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {
    private final StudentRepository studentRepository;

    @Autowired
    public StudentService(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    public Student getStudent(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    public Student createStudent(String name, String surname, int period) {
        Student student = Student
                .builder()
                .name(name)
                .surname(surname)
                .period(period)
                .build();
        return studentRepository.save(student);
    }

    public Student updateStudent(Long id, int period) {
        Student student = studentRepository.findById(id).orElse(null);
        if (student == null) {
            return null;
        }
        student.setPeriod(period);
        return studentRepository.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }

    public void deleteAllStudents() {
        studentRepository.deleteAll();
    }
}
