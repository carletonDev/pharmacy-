package com.example.application.spring.backend;

import PharmacyDataAccess.tables.daos.EmployeeDao;
import PharmacyDataAccess.tables.pojos.Employee;
import PharmacyDataAccess.tables.pojos.Users;
import com.vaadin.flow.component.button.Button;
import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.*;
import org.jooq.exception.*;
import org.jooq.impl.DAOImpl;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import java.io.OutputStream;
import java.io.Writer;
import java.sql.ResultSet;
import java.util.*;
import java.util.Comparator;

@Service
public class BackendService {


    //my actual backend methods not auto gen from Vaadin
    public Configuration GetConfiguration(){
        HikariConfig config = new HikariConfig();
        config.setJdbcUrl("jdbc:sqlserver://carletonserver.database.windows.net:1433;database=Pharmacy;encrypt=true;trustServerCertificate=false;hostNameInCertificate=*.database.windows.net;loginTimeout=30;");
        config.setUsername("carl@carletonserver");
        config.setPassword("5611S@ddle");
        config.setAutoCommit(true);
        return new DefaultConfiguration().set(new HikariDataSource(config)).set(SQLDialect.DEFAULT);

    }
    public DSLContext DSL(){

      DSLContext context= DSL.using(GetConfiguration());
      return context;
    }



}
