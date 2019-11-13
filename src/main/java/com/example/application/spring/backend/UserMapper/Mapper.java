package com.example.application.spring.backend.UserMapper;

import PharmacyDataAccess.tables.pojos.Users;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;


//class that maps the Database Objects
@Service
public class Mapper {
   public Users SetUsers(TextField firstname, TextField lastname, TextField city, TextField state, TextField userAddress) {
       return Map(firstname, lastname, city, state, userAddress);
   }

    private static Users Map(TextField firstname, TextField lastname, TextField city, TextField state, TextField userAddress) {
        Users userMap = new Users();
        userMap.setFirstname(firstname.getValue());
        userMap.setLastname(lastname.getValue());
        userMap.setCity(city.getValue());
        userMap.setState(state.getValue());
        userMap.setUseraddress(userAddress.getValue());
        return userMap;
    }

    public List<TextField> TexboxList(TextField firstname, TextField lastname, TextField city, TextField state, TextField userAddress){
        return MapList(firstname, lastname, city, state, userAddress);
    }

    private static List<TextField> MapList(TextField firstname, TextField lastname, TextField city, TextField state, TextField userAddress) {
        List<TextField> textboxes = new ArrayList<>();
        textboxes.add(firstname);
        textboxes.add(lastname);
        textboxes.add(city);
        textboxes.add(state);
        textboxes.add(userAddress);
        return textboxes;
    }

    public List<String>UserLabels(){
        return MapUserLabels();
    }

    private static List<String> MapUserLabels() {
        List<String> fieldNames = new ArrayList<>();
        fieldNames.add("First Name");
        fieldNames.add("Last Name");
        fieldNames.add("City");
        fieldNames.add("State");
        fieldNames.add("Address");
        return fieldNames;
    }

}
