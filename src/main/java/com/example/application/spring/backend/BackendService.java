package com.example.application.spring.backend;

import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.pojos.Users;
import PharmacyDataAccess.tables.records.UsersRecord;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.*;
import org.jooq.impl.DSL;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.DriverManager;
import java.util.*;

@Service
public class BackendService {

    private org.jooq.Configuration configuration;
    //TODO figure out how to access through application properties file maybe with Enviroment variable

    private List<Employee> employees;{
    // Init dummy data

        employees = new ArrayList<>();
        employees.add(new Employee("Rowena", "Leeming", "rleeming0@bbc.co.uk", "Food Chemist"));
        employees.add(new Employee("Alvinia", "Delong", "adelong1@altervista.org", "Recruiting Manager"));
        employees.add(new Employee("Leodora", "Burry", "lburry2@example.com", "Food Chemist"));
        employees.add(new Employee("Karen", "Oaten", "koaten3@ihg.com", "VP Sales"));
        employees.add(new Employee("Mariele", "Huke", "mhuke4@washingtonpost.com", "Research Assistant IV"));
        employees.add(new Employee("Grata", "Widdowes", "gwiddowes5@cargocollective.com", "Actuary"));
        employees.add(new Employee("Donna", "Roadknight", "droadknight6@apache.org", "Mechanical Systems Engineer"));
        employees.add(new Employee("Tommi", "Nowland", "tnowland7@biblegateway.com", "Senior Developer"));
        employees.add(new Employee("Tonya", "Teresia", "tteresia8@boston.com", "Assistant Manager"));
        employees.add(new Employee("Steffen", "Yon", "syon9@ocn.ne.jp", "Senior Sales Associate"));
        employees.add(new Employee("Consalve", "Willes", "cwillesa@linkedin.com", "Programmer I"));
        employees.add(new Employee("Jeanelle", "Lambertz", "jlambertzb@nymag.com", "Operator"));
        employees.add(new Employee("Odelia", "Loker", "olokerc@gov.uk", "Developer I"));
        employees.add(new Employee("Briano", "Shawell", "bshawelld@posterous.com", "Research Assistant IV"));
        employees.add(new Employee("Tarrance", "Mainston", "tmainstone@cmu.edu", "Research Nurse"));
        employees.add(new Employee("Torrence", "Gehring", "tgehringf@a8.net", "Geological Engineer"));
        employees.add(new Employee("Augie", "Pionter", "apionterg@ehow.com", "Senior Financial Analyst"));
        employees.add(new Employee("Marillin", "Aveson", "mavesonh@shop-pro.jp", "Technical Writer"));
        employees.add(new Employee("Jacquelyn", "Moreby", "jmorebyi@slashdot.org", "Executive Secretary"));
        employees.add(new Employee("Glenn", "Bangley", "gbangleyj@prlog.org", "Account Executive"));
        employees.add(new Employee("Isidoro", "Glave", "iglavek@tamu.edu", "Compensation Analyst"));
        employees.add(new Employee("Cchaddie", "Spatarul", "cspatarull@sun.com", "Business Systems Development Analyst"));
    }

    public List<Employee> getEmployees() {
        return employees;
    }


    public Configuration GetConfiguration(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:sqlserver://carletonserver.database.windows.net:1433;database=Pharmacy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        config.setUsername("carl@carletonserver");
        config.setPassword("5611S@ddle");
        config.setAutoCommit(true);
        return configuration.set(new HikariDataSource(config));

    }


}
