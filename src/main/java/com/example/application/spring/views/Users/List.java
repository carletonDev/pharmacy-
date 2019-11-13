package com.example.application.spring.views.Users;


import PharmacyDataAccess.tables.daos.UsersDao;
import PharmacyDataAccess.tables.pojos.Users;
import com.example.application.spring.MainView;
import com.example.application.spring.backend.BackendService;
import com.example.application.spring.backend.FormCreatorService;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.confirmdialog.ConfirmDialog;
import com.vaadin.flow.component.dependency.CssImport;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.notification.Notification;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.AfterNavigationEvent;
import com.vaadin.flow.router.AfterNavigationObserver;
import com.vaadin.flow.router.PageTitle;
import com.vaadin.flow.router.Route;
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
   private FormCreatorService formMaker;
    private Grid<Users> userList;
    public List(){
        //create the layout
        VerticalLayout layout = new VerticalLayout();
        //create a new grid
        userList = new Grid<>(Users.class);
        //add update and delete button
        userList.addComponentColumn(this::buildDeleteButton);
        userList.addComponentColumn(this::buildUpdateButton);
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
        button.addClickListener(e->{
            //link to update view with users object injected into the method
        });
        return button;
    }

    //add edit and delete button methods
    private Button buildDeleteButton(Users user){
        Button button = formMaker.createButtonTheme("delete");
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
        service.DSL().deleteFrom(PharmacyDataAccess.tables.Users.USERS)
                .where(PharmacyDataAccess.tables.Users.USERS.FIRSTNAME.equal(user.getFirstname()),
                        PharmacyDataAccess.tables.Users.USERS.LASTNAME.equal(user.getLastname()));
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
