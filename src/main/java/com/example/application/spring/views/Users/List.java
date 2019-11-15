package com.example.application.spring.views.Users;


import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.BackendService;
import com.example.application.spring.backend.CRUDService;
import com.example.application.spring.backend.FormCreatorService;
import com.vaadin.flow.component.UI;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.*;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;

//grids need the on intialization method need lazy loading to work!!
@Route(layout=MainView.class)
@PageTitle("Users")
@CssImport("styles/views/masterdetail/master-detail-view.css")
@Log
public class List extends VerticalLayout implements AfterNavigationObserver {

   @Autowired
   private BackendService service;
   @Autowired
   private CRUDService crud;
   @Autowired
   private FormCreatorService formMaker;
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

    private Button buildUpdateButton(Users users) {
        Button button = formMaker.createButtonTheme("update");
        button.setText("Update");
        button.addClickListener(e->{
            //link to update view with users object injected into the method


        });
        return button;
    }

    //add edit and delete button methods
    private Button buildDeleteButton(Users user){
        Button button = formMaker.createButtonTheme("delete");
        button.setText("Delete");
        button.addClickListener(e->{
            //show notification if user clicks delete
            CreateDialog(user);
        });
        return button;
    }

    public void CreateDialog(Users user) {
        ConfirmDialog deleteConfirm = new ConfirmDialog("Delete?",
                "Are you sure you want to delete?",
                "Ok",
                confirmEvent -> DeleteConfirmed(confirmEvent,user));
        deleteConfirm.open();
    }


    private void DeleteConfirmed(ConfirmDialog.ConfirmEvent confirmEvent,Users user) {
        if(confirmEvent.isFromClient()) {
            DeleteUser(user);
        }
        else{}
    }

    public void DeleteUser(Users user) {
        //userID in jooq auto gen is depreceated
        crud.UsersDAO().delete(user);
    }

    @Override
    public void afterNavigation(AfterNavigationEvent event) {

        // Lazy init of the grid items, happens only when we are sure the view will be
        // shown to the user
        UsersDao dao = new UsersDao(service.GetConfiguration());
        userList.setItems(dao.findAll());
        userList.addComponentColumn(this::buildDeleteButton);
        userList.addComponentColumn(this::buildUpdateButton);
        log.info(dao.findAll().toString());
    }

}
