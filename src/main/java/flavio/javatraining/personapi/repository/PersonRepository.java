package flavio.javatraining.personapi.repository;

import flavio.javatraining.personapi.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonRepository extends JpaRepository<Person, Long> {

}
