package com.tacticamz.javaflux.ui.view;

import com.tacticamz.javaflux.security.SecuredByRole;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import org.springframework.beans.factory.annotation.Autowired;

@Route("admin")
@SecuredByRole("ROLE_Admin")
public class AdminView extends VerticalLayout {
    @Autowired
    public AdminView() {
        Label label = new Label("Looks like you are admin!");
        add(label);
    }

}
