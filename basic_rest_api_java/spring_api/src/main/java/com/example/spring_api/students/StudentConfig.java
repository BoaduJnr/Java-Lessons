package com.example.spring_api.students;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student sarah = new Student(1L, "Sarah", "sarah.doe@gmail.com", LocalDate.of(2000, Month.FEBRUARY, 6));
            Student moses = new Student("Moses", "moses.ndi@gmail.com", LocalDate.of(2004, Month.MAY, 6));
            repository.saveAll(
                    List.of(sarah, moses));
        };
    }
}
