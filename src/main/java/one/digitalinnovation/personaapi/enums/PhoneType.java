package one.digitalinnovation.personaapi.enums;

import jdk.jfr.Description;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PhoneType {

    
    HOME( description: "Home"),
    MOBILE ( description: "Mobile"),
    COMMERCIAL ( description: "Commercial");

    private final String description;
    
}
