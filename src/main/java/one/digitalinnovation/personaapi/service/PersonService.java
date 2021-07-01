package one.digitalinnovation.personaapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import one.digitalinnovation.personaapi.repository.PersonRepository;
import one.digitalinnovation.personaapi.enity.Person;
import one.digitalinnovation.personaapi.dto.MessageResponseDTO;

@Service
public class PersonService {
    
    private PersonRepository personRepository;

    @Autowired
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }

	public MessageResponseDTO createPerson(Person person){
        Person savedPerson = personRepository.save(person);
		return MessageResponseDTO.builder().message("Created Person with ID" + savedPerson.getId()).build();
	}
}
