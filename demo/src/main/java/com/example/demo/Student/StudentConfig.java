package com.example.demo.Student;

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
        return args->{
            Student Khalil =new Student(
                    1L,
                    "Khalil",

                    LocalDate.of(2000, Month.JANUARY,5),
                    "khaleelbader452278@gmail.com"
            );

            Student Ahmad =new Student(
                    2L,
                    "Ahmad",

                    LocalDate.of(2002, Month.JANUARY,5),
                    "Ahmad123@gmail.com"
            );

            repository.saveAll(
                    List.of(Khalil , Ahmad)
            );
        };
    }
}
