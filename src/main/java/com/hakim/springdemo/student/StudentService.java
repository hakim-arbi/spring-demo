package com.hakim.springdemo.student;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;
@Service
public class StudentService {
    public List<Student> findAllStudents (){
        return List.of(
                new Student(
                        "hakim",
                        "arbi",
                        LocalDate.now(),
                        "hakimarbi525@gmail.com",
                        25

                ),
                new Student(
                        "student55",
                        "arbi",
                        LocalDate.now(),
                        "aymenarbi@gmail.com",
                        20

                )
        );
    }
}
