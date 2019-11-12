package com.example.application.spring.views.Users;


import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.interfaces.IUsers;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.BackendService;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.LogRecord;
import java.util.logging.Logger;

@Route(value = "user", layout = MainView.class)
@PageTitle("Users")
@CssImport("styles/views/masterdetail/master-detail-view.css")
@Log
public class List extends VerticalLayout {

   @Autowired
   private BackendService service;

    private UsersDao dao;

    private Grid<Users> userList;
    public List(){
        //create the layout
        VerticalLayout layout = Layout();
        //configure the dao object
        dao = new UsersDao(service.GetConfiguration());
        //create a new grid
        userList = new Grid<>();
        //use find all method to populate list
        userList.setItems(dao.findAll());
        //log data testing
        log.info(dao.findAll().toString());
        //remove role id and user id from table
        userList.removeColumnByKey("userId");
        userList.removeColumnByKey("roleId");
        //set columns to non id columns
        userList.setColumns("city","firstName","lastName","userAddress","state","zip");
        //set the layout size to full
        layout.setSizeFull();
        //add to the vertical layout
        add(userList);
    }
    //method that instantiates a vertical layout
    public VerticalLayout Layout(){
        VerticalLayout layout = new VerticalLayout();
        return layout;
    }

}
