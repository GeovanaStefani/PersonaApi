package one.digitalinnovation.personaapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import one.digitalinnovation.personaapi.enity.Person;

public interface PersonRepository extends JpaRepository <Person, Long>{
    
}
