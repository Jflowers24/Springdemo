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
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
            Student Jerm = new Student(

                            "Jerm",
                            "Jerm@Jerm.com",
                            LocalDate.of(2004, Month.DECEMBER, 5)

                    );
            Student Josh = new Student(

                    "Josh",
                    "Josh@Josh.com",
                    LocalDate.of(2005, Month.DECEMBER, 5)
            );

            repository.saveAll(
                    List.of(Josh, Jerm)
            );

        };
    }
}
