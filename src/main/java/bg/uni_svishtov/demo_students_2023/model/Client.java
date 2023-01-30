package bg.uni_svishtov.demo_students_2023.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String ime;
    private String telefon;
    private String grad;
    private String address;

    public Client(Integer id, String ime, String telefon, String grad, String address) {
        this.id = id;
        this.ime = ime;
        this.telefon = telefon;
        this.grad = grad;
        this.address = address;
    }

    public Client() {};

    public Integer getId() {
        return id;
    }

    public String getIme() {
        return ime;
    }

    public String getTelefon() {
        return telefon;
    }

    public String getGrad() {
        return grad;
    }

    public String getAddress() {
        return address;
    }
}
