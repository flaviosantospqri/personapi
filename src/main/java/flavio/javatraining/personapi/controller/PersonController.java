package flavio.javatraining.personapi.controller;

import flavio.javatraining.personapi.model.Person;
import flavio.javatraining.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;

    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public String createPerson(@RequestBody Person person){
       Person personSave = personRepository.save(person);
        return "Teste API";
    }

}
