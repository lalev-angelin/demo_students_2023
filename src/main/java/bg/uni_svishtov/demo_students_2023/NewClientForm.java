package bg.uni_svishtov.demo_students_2023;

import bg.uni_svishtov.demo_students_2023.model.Client;
import bg.uni_svishtov.demo_students_2023.model.ClientRepository;
import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.button.ButtonVariant;
import com.vaadin.flow.component.orderedlayout.FlexComponent;
import com.vaadin.flow.component.orderedlayout.HorizontalLayout;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;

@Route("/")
public class NewClientForm extends VerticalLayout {
    private ClientRepository repo;
    private TextField klientskiNomerField;
    private TextField imeField;
    private TextField telefonField;
    private TextField gradField;
    private TextField addressField;

    Button zapisButton;

    Button otkazButton;

    public NewClientForm(ClientRepository repo) {
        this.repo = repo;

        setAlignItems(FlexComponent.Alignment.STRETCH);

        klientskiNomerField = new TextField("Клиентски номер");
        klientskiNomerField.setValue("[Нов клиент]");
        klientskiNomerField.setReadOnly(true);
        add(klientskiNomerField);
        imeField = new TextField("Име на клиента");
        add(imeField);
        telefonField = new TextField("Телефон");
        add(telefonField);
        gradField = new TextField("Град");
        add(gradField);
        addressField = new TextField("Адрес");
        add(addressField);

        HorizontalLayout h = new HorizontalLayout();

        zapisButton = new Button("Запис", e->repo.save(new Client(null, imeField.getValue(),
                telefonField.getValue(), gradField.getValue(), addressField.getValue())));
        zapisButton.addThemeVariants(ButtonVariant.LUMO_PRIMARY);

        h.add(zapisButton);
        otkazButton = new Button("Отказ");
        h.add(otkazButton);
        add(h);
    }
}
