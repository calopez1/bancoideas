package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.PersonaDTO;
import com.unilever.bancoideas.modelo.Persona;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface PersonaMapper {
    public PersonaDTO personaToPersonaDTO(Persona persona)
        throws Exception;

    public Persona personaDTOToPersona(PersonaDTO personaDTO)
        throws Exception;

    public List<PersonaDTO> listPersonaToListPersonaDTO(List<Persona> personas)
        throws Exception;

    public List<Persona> listPersonaDTOToListPersona(
        List<PersonaDTO> personaDTOs) throws Exception;
}
