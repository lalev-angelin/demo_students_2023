package bg.uni_svishtov.demo_students_2023;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.dialog.Dialog;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;
import com.vaadin.flow.component.html.H3;

@Route("/")
public class EnrollmentForm extends VerticalLayout {

    Button helloButton;
    public EnrollmentForm() {
        Dialog d = new Dialog();
        VerticalLayout layout = new VerticalLayout();
        d.add(layout);
        layout.add(new H3("Здравей, Свят!"));
        d.getFooter().add(new Button("ОК", e->d.close()));

        helloButton = new Button("Здравей, Свят!", e->d.open());
        add(helloButton);
    }
}
