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
 * //the route will be replaced with Neptune View annotation on project
 * //all flow items were used in vaadin 8.5.1 just not imported from vaadin flow
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {


    public static void main(String[] args) throws Exception {

//        BackendService service = new BackendService();
//        service.InsertVaddinHardCode();
        SpringApplication.run(Application.class, args);
    }


}
