package com.example.application.spring.views.masterdetail;

import PharmacyDataAccess.tables.pojos.Employee;
import com.example.application.spring.backend.CRUDService;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.flow.component.AbstractField;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.grid.GridVariant;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;

import com.example.application.spring.MainView;

import java.util.List;
//the route will be replaced with Neptune View annotation on project
//all flow items were used in vaadin 8.5.1 just not imported from vaadin flow
@Route(value = "masterdetail", layout = MainView.class)
@PageTitle("MasterDetail")
@CssImport("styles/views/masterdetail/master-detail-view.css")
public class MasterDetailView extends Div implements AfterNavigationObserver {

    @Autowired
    private CRUDService service;
    private Grid<Employee> employees;

    private TextField firstname = new TextField();
    private TextField lastname = new TextField();
    private TextField email = new TextField();
    private TextField title = new TextField();

    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");

    private Binder<Employee> binder;

    public MasterDetailView() {
        setId("master-detail-view");
        // Configure Grid
        employees = new Grid<>(Employee.class);
        employees.addThemeVariants(GridVariant.LUMO_NO_BORDER);
        employees.setHeightFull();
        employees.removeColumnByKey("employeeid");
        //when a row is selected or deselected, populate form
        employees.asSingleSelect().addValueChangeListener(event -> populateForm(event.getValue()));

        // Configure Form
        binder = new Binder<>(Employee.class);

        // Bind fields. This where you'd define e.g. validation rules
        binder.bindInstanceFields(this);
        // note that password field isn't bound since that property doesn't exist in
        // Employee

        // the grid valueChangeEvent will clear the form too
        cancel.addClickListener(e -> employees.asSingleSelect().clear());

        save.addClickListener(e -> {
            Save();
        });

        SplitLayout splitLayout = new SplitLayout();
        splitLayout.setSizeFull();

        createGridLayout(splitLayout);
        createEditorLayout(splitLayout);

        add(splitLayout);
    }

    public void Save() {
        Employee employee = Map(firstname,lastname,email,title);
        //data validation
        dataValidation(employee);
        CheckInsert(employee);
    }

    public void CheckInsert(Employee employee) {
        List<Employee> checkInsert = service.EmployeeDAO().findAll();
        //check if user was added by looking at first and last name against the database list
        //java doesnt use two equals signs goes wonky you need .equals on lambdas
        if(checkInsert.stream().anyMatch(e-> e.getFirstname().equals(employee.getFirstname())
                && e.getLastname().equals(employee.getLastname())))
        {
            Notification.show("User Added!");
        }
        else{
            Notification.show("User Not Added");
        }
    }

    public void dataValidation(Employee employee) {
        if(employee.getFirstname().isEmpty() || employee.getLastname().isEmpty()){
            Notification.show("Please Enter first and last name of employee");
        }
        else{
            service.InsertEmployee(employee);
        }
    }

    private Employee Map(TextField firstname, TextField lastname, TextField email, TextField title) {

        return new Employee(firstname.getValue(),lastname.getValue(),email.getValue(),title.getValue());
    }

    private void createEditorLayout(SplitLayout splitLayout) {
        Div editorDiv = new Div();
        editorDiv.setId("editor-layout");
        FormLayout formLayout = new FormLayout();
        addFormItem(editorDiv, formLayout, firstname, "First name");
        addFormItem(editorDiv, formLayout, lastname, "Last name");
        addFormItem(editorDiv, formLayout, email, "Email");
        addFormItem(editorDiv, formLayout, title, "Title");
        createButtonLayout(editorDiv);
        splitLayout.addToSecondary(editorDiv);
    }

    private void createButtonLayout(Div editorDiv) {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.setId("button-layout");
        buttonLayout.setWidthFull();
        buttonLayout.setSpacing(true);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(cancel, save);
        editorDiv.add(buttonLayout);
    }

    private void createGridLayout(SplitLayout splitLayout) {
        Div wrapper = new Div();
        wrapper.setId("wrapper");
        wrapper.setWidthFull();
        splitLayout.addToPrimary(wrapper);
        wrapper.add(employees);
    }

    private void addFormItem(Div wrapper, FormLayout formLayout,
            AbstractField field, String fieldName) {
        formLayout.addFormItem(field, fieldName);
        wrapper.add(formLayout);
        field.getElement().getClassList().add("full-width");
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Lazy init of the grid items, happens only when we are sure the view will be
        // shown to the user
        employees.setItems(service.EmployeeDAO().findAll());
    }

    private void populateForm(Employee value) {
        // Value can be null as well, that clears the form
        binder.readBean(value);

        // The password field isn't bound through the binder, so handle that
        title.setValue("");
    }
}
