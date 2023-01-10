package flavio.javatraining.personapi.controller;

import flavio.javatraining.personapi.dto.MessageResponseDTO;
import flavio.javatraining.personapi.model.Person;
import flavio.javatraining.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/v1/people")
public class PersonController {

    private PersonRepository personRepository;


    //injeção de dependencias.
    @Autowired
    public PersonController(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }

    @PostMapping
    public MessageResponseDTO createPerson(@RequestBody Person person){
       Person personSave = personRepository.save(person);
        return MessageResponseDTO.builder().message("Created person with ID" + personSave.getId()).build();
    }

}
