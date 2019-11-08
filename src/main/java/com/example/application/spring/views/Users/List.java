package com.example.application.spring.views.Users;

import Pharmacy.dbo.tables.daos.UsersDao;
import Pharmacy.dbo.tables.pojos.Users;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

@Route(value="users")
public class List extends VerticalLayout {

    private UsersDao dao;
    public List(){
        Grid<Users> userList = new Grid<Users>();
        userList.setItems(dao.findAll());
        userList.removeColumnByKey("userId");
        userList.removeColumnByKey("roleId");
        userList.setColumns("city","firstName","lastName","userAddress","state","zip");
    }
}
