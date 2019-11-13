package com.example.application.spring;


import com.example.application.spring.backend.BackendService;
import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;


/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {

//        BackendService service = new BackendService();
//        service.InsertVaddinHardCode();
        SpringApplication.run(Application.class, args);
    }


}
