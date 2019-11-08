package com.example.application.spring;


import org.jooq.codegen.GenerationTool;
import org.jooq.meta.jaxb.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * The entry point of the Spring Boot application.
 */
@SpringBootApplication
public class Application extends SpringBootServletInitializer {

    public static void main(String[] args) throws Exception {
//        Configuration configuration = new Configuration()
////                .withJdbc(new Jdbc()
////                        .withDriver("com.microsoft.sqlserver.jdbc.SQLServerDriver")
////                        .withUrl("jdbc:sqlserver://carletonserver.database.windows.net:1433;database=Pharmacy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;")
////                        .withUsername("carl")
////                        .withPassword("5611S@ddle")
////                        .withUser("carl@carletonserver")
////                        .withAutoCommit(true))
////                .withGenerator(new Generator()
////                        .withDatabase(new Database().withIncludes("Pharmacy|Medicine|PharmacyMedicine|Roles|Salary|Transactions|Users"))
////                        .withGenerate(new Generate()
////                                .withRelations(true)
////                                .withPojos(true)
////                                .withJpaAnnotations(true)
////                                .withInterfaces(true)
////                                .withDaos(true)
////                                .withSpringAnnotations(true)
////                                .withDeprecated(false)
////                        )
////                        .withTarget(new Target()
////                                .withPackageName("Pharmacy")
////                                .withDirectory("src/main/java")));
////       GenerationTool.generate(configuration);
        SpringApplication.run(Application.class, args);


    }

}
