package com.example.application.spring.backend;

import com.vaadin.flow.component.Component;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.formlayout.FormLayout;
import com.vaadin.flow.component.html.H1;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FormCreatorService {
    /*
Services for Forms to create a vertical layout and a Form in general
 */
    public VerticalLayout createWrapper() {
        VerticalLayout wrapper = new VerticalLayout();
        wrapper.setId("wrapper");
        wrapper.setSpacing(false);
        return wrapper;
    }
    public void createTitle(VerticalLayout wrapper, String title) {
        H1 h1 = new H1(title);
        wrapper.add(h1);
    }
    //creates layouts for forms
    public void createFormLayout(VerticalLayout editorDiv, List<TextField> textboxes, List<String> fieldNames) {

        FormLayout formLayout = new FormLayout();
        int x = 0;
        for(TextField text:textboxes){
            addFormItem(editorDiv, formLayout, text, fieldNames.get(x));
            x++;
        }
    }
    public void createButtonLayout(VerticalLayout wrapper, Button cancel, Button save) {
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
    //creates button and theme for list update delete
    public Button createButtonTheme(String name){
        Button createButton = new Button();
        createButton.setId(name);
        createButton.setWidthFull();
        createButton.addClassName("button-layout");
        if(createButton.getId().toString().equals("update")) {
            createButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);
            createButton.setText(name);
        }
        else if(createButton.getId().toString().equals("delete")) {
            createButton.addThemeVariants(ButtonVariant.LUMO_TERTIARY);
            createButton.setText(name);
        }
        return createButton;
    }
    public FormLayout.FormItem addFormItem(VerticalLayout wrapper,
                                           FormLayout formLayout, Component field, String fieldName) {
        FormLayout.FormItem formItem = formLayout.addFormItem(field, fieldName);
        wrapper.add(formLayout);
        field.getElement().getClassList().add("full-width");
        return formItem;
    }


//    //creates the form binder for submission
//    public Binder createBinder(Type types){
//        return new Binder<>(types.class);
//
//    }
}
