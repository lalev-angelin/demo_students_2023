package bg.uni_svishtov.demo_students_2023.model;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ClientRepository extends CrudRepository<Client, Integer> {
    @Override
    List<Client> findAll();
}
