package com.example.application.spring.views.Users;

import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.interfaces.IUsers;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.BackendService;
import com.example.application.spring.backend.FormCreatorService;
import com.example.application.spring.backend.UserMapper.Mapper;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.data.binder.Binder;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;
import java.util.List;

@Route(layout = MainView.class)
@PageTitle("UpdateUser")
@CssImport("styles/views/masterdetail/master-detail-view.css")
@Log
public class Update extends VerticalLayout {

    @Autowired
    private FormCreatorService service;
    @Autowired
    private Mapper mapper;
    @Autowired
    private BackendService dataAccess;
    //create text fields and buttons for forms
    private TextField firstname = new TextField();
    private TextField lastname = new TextField();
    private TextField city = new TextField();
    private TextField state = new TextField();
    private TextField userAddress = new TextField();
    //    private TextField zip = new TextField();
    private Button cancel = new Button("Cancel");
    private Button save = new Button("Save");
    public IUsers users;
    //create binder for form submission
    private Binder<Users> binder;
    //add Textboxes and fields
    public Update(IUsers user){
        //inject dependency
        this.users=user;
        //create vertical layout
        VerticalLayout wrapper = service.createWrapper();
        setId("Update Form");
        //set the textboxes to the values in the object
        SetTextBoxes(users);
        //create title form and button layout to match style from vaadin you made
        service.createTitle(wrapper,"Update");
        //get a List of textboxes and field labels to format the forms layout
        StyleForm(wrapper, ListOfTextBoxes(),mapper.UserLabels());
        binder = new Binder<>(Users.class);
        binder.bindInstanceFields(this);
        add(wrapper);


    }

    public void StyleForm(VerticalLayout wrapper, List<TextField> textboxes, List<String> fieldNames) {
        //create form
        service.createFormLayout(wrapper,textboxes,fieldNames);
        //create button layout
        service.createButtonLayout(wrapper,cancel,save);
        save.addClickListener(e->{
            //create User
            Users userUpdate =MapTextBoxes();
            //Update User
            UpdateUser(userUpdate);
        });

    }

    public void SetTextBoxes(IUsers user){
        firstname.setValue(user.getFirstname());
        lastname.setValue(user.getLastname());
        city.setValue(user.getCity());
        state.setValue(user.getState());
        userAddress.setValue(user.getUseraddress());

    }

    public List<TextField> ListOfTextBoxes() {
        return mapper.TexboxList(firstname, lastname, city, state, userAddress);
    }
    public Users MapTextBoxes() {

        return mapper.SetUsers(firstname, lastname, city, state, userAddress);
    }



    public void UpdateUser(Users user){
        //create the dao object add the configuration from the backend service service
        UsersDao dao = new UsersDao(dataAccess.GetConfiguration());
        //update the user
        dao.update(user);
    }

}
