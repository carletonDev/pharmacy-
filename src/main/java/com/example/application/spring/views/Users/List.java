package com.example.application.spring.views.Users;


import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.interfaces.IUsers;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.BackendService;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.logging.LogRecord;
import java.util.logging.Logger;
//grids need the on intialization method need lazy loading to work!!
@Route
@PageTitle("Users")
@CssImport("styles/views/masterdetail/master-detail-view.css")
@Log
public class List extends VerticalLayout implements AfterNavigationObserver {

   @Autowired
   private BackendService service;
    private Grid<Users> userList;
    public List(){
        //create the layout
        VerticalLayout layout = new VerticalLayout();
        //create a new grid
        userList = new Grid<>(Users.class);
        //set size to full
        layout.setHeightFull();
        //remove role id and user id from table
        userList.removeColumnByKey("userid");
        userList.removeColumnByKey("roleid");
        //add to the vertical layout
        add(userList);
    }
    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Lazy init of the grid items, happens only when we are sure the view will be
        // shown to the user
        UsersDao dao = new UsersDao(service.GetConfiguration());
        userList.setItems(dao.findAll());
        log.info(dao.findAll().toString());
    }

}
