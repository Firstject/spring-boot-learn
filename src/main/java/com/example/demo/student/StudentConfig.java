package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.util.List;

import static java.time.Month.APRIL;
import static java.time.Month.MARCH;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository studentRepository) {
        return args -> {
            Student jason = new Student(
                    "Jason",
                    "Jason.jefa@gmail.com",
                    LocalDate.of(2000, APRIL, 5)
            );

            Student alex = new Student(
                    "Alex",
                    "Alex.abcd@gmail.com",
                    LocalDate.of(2001, MARCH, 23)
            );

            studentRepository.saveAll(
                    List.of(jason, alex)
            );
        };
    }
}
