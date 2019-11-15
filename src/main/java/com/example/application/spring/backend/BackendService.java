package com.example.application.spring.backend;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;
import org.jooq.Configuration;
import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;
import org.jooq.impl.DefaultConfiguration;
import org.springframework.stereotype.Service;

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
