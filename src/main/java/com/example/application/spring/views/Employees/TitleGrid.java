package com.example.application.spring.views.Employees;

import PharmacyDataAccess.tables.pojos.Employee;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.CRUDService;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route(value="title", layout= MainView.class)
public class TitleGrid implements AfterNavigationObserver{

    @Autowired
    private CRUDService service;
    private Grid<Employee> employees;
    private String title;
    //drop down list

    public TitleGrid(String title){
        this.title=title;
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Lazy init of the grid items, happens only when we are sure the view will be
        // shown to the user
        employees.setItems(service.GetUsersByTitle(title));
    }

}
