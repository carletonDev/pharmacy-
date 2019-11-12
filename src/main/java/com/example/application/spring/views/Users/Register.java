package com.example.application.spring.views.Users;

import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.interfaces.IUsers;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.backend.BackendService;
import com.example.application.spring.backend.Employee;
import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.Div;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.splitlayout.SplitLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import javax.management.Notification;

@Route
@PageTitle("AddUser")
@CssImport("styles/views/masterdetail/master-detail-view.css")
@Log
public class Register extends Div {


    //create DAO object for CRUD
    private UsersDao dao;
    //Autowire the Backend Service
    @Autowired
    BackendService service;
    //create an interface user object
    IUsers user;
    //create text fields and buttons for forms
    private TextField firstname = new TextField();
    private TextField lastname = new TextField();
    private TextField city = new TextField();
    private TextField state = new TextField();
    private TextField userAddress = new TextField();
//    private TextField zip = new TextField();
    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");
    //create binder for form submission
    private Binder<Users> binder;

    Register(){
        //instantiate vertical layout
        VerticalLayout wrapper = createWrapper();
        setId("CreateUser");
        //create title form and button layout to match style from vaadin you made
        createTitle(wrapper);
        createFormLayout(wrapper);
        createButtonLayout(wrapper);
        //instantiate binder for form group
        binder = new Binder<>(Users.class);
        // Bind fields. This where you'd define e.g. validation rules
        binder.bindInstanceFields(this);
        //create button event click methods
       save.addClickListener(e->{
           //instantiate a new User injecting the interface properties into the users object
           SetUsers(user);
           Users users = new Users(user);
           //add connection and insert
           dao = new UsersDao(service.GetConfiguration());
           dao.insert(users);
       });
        cancel.addClickListener(e->{
            //clear form
            binder.readBean(null);
        });

        add(wrapper);

    }
    //methods Named for what they do in constructor
    public void SetUsers(IUsers iUsers){
        iUsers.setFirstname(firstname.getValue());
        iUsers.setLastname(lastname.getValue());
        iUsers.setCity(city.getValue());
        iUsers.setState(state.getValue());
        iUsers.setUseraddress(userAddress.getValue());
    }
    private VerticalLayout createWrapper() {
        VerticalLayout wrapper = new VerticalLayout();
        wrapper.setId("wrapper");
        wrapper.setSpacing(false);
        return wrapper;
    }
    private void createTitle(VerticalLayout wrapper) {
        H1 h1 = new H1("Create New User");
        wrapper.add(h1);
    }
    private void createFormLayout(VerticalLayout editorDiv) {
        FormLayout formLayout = new FormLayout();
        addFormItem(editorDiv, formLayout, firstname, "First name");
        addFormItem(editorDiv, formLayout, lastname, "Last name");
        addFormItem(editorDiv,formLayout,userAddress,"Address");
        addFormItem(editorDiv, formLayout, city, "City");
        addFormItem(editorDiv, formLayout, state, "State");
    }
    private void createButtonLayout(VerticalLayout wrapper) {
        HorizontalLayout buttonLayout = new HorizontalLayout();
        buttonLayout.addClassName("button-layout");
        buttonLayout.setWidthFull();
        buttonLayout
                .setJustifyContentMode(FlexComponent.JustifyContentMode.END);
        cancel.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
        save.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
        buttonLayout.add(cancel);
        buttonLayout.add(save);
        wrapper.add(buttonLayout);
    }
    private FormLayout.FormItem addFormItem(VerticalLayout wrapper,
                                            FormLayout formLayout, Component field, String fieldName) {
        FormLayout.FormItem formItem = formLayout.addFormItem(field, fieldName);
        wrapper.add(formLayout);
        field.getElement().getClassList().add("full-width");
        return formItem;
    }

}
