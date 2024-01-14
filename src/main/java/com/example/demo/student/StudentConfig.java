package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student Nazanin = new Student(
                    "Nazanin",
                    "nazanin.ansari@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 10)
            );
            Student Negin = new Student(
                    "Negin",
                    "negin.Radka@gmail.com",
                    LocalDate.of(2001, Month.APRIL, 10)
            );
            repository.saveAll(List.of(Nazanin, Negin));
        };
    }
}
