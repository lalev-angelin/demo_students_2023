package bg.uni_svishtov.demo_students_2023;

import bg.uni_svishtov.demo_students_2023.model.Client;
import bg.uni_svishtov.demo_students_2023.model.ClientRepository;
import com.vaadin.flow.component.grid.ColumnTextAlign;
import com.vaadin.flow.component.grid.Grid;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.router.Route;

import java.util.List;

@Route("/clients")
public class ClientsGrid extends VerticalLayout {

    private ClientRepository repo;

    private Grid<Client> grid;
    public ClientsGrid(ClientRepository repo) {
        this.repo = repo;

        grid = new Grid<>(Client.class, false);
        grid.addColumn(Client::getId)
                .setHeader("Клиентски номер")
                .setAutoWidth(true)
                .setTextAlign(ColumnTextAlign.END);
        grid.addColumn(Client::getIme)
                        .setHeader("Име")
                        .setAutoWidth(true);
        grid.addColumn(Client::getTelefon)
                .setHeader("Телефон")
                .setAutoWidth(true);
        grid.addColumn(Client::getGrad)
                        .setHeader("Град")
                        .setAutoWidth(true);
        grid.addColumn(Client::getAddress)
                        .setHeader("Адрес")
                        .setAutoWidth(false);
        add(grid);
        List<Client> clients = repo.findAll();
        grid.setItems(clients);
    }
}
