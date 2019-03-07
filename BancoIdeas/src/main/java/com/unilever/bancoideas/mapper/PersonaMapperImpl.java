package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.PersonaDTO;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.modelo.Persona;
import com.unilever.bancoideas.service.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Component
@Scope("singleton")
public class PersonaMapperImpl implements PersonaMapper {
    private static final Logger log = LoggerFactory.getLogger(PersonaMapperImpl.class);

    /**
    * Service injected by Spring that manages TipoIdentificacion entities
    *
    */
    @Autowired
    TipoIdentificacionService serviceTipoIdentificacion1;

    @Transactional(readOnly = true)
    public PersonaDTO personaToPersonaDTO(Persona persona)
        throws Exception {
        try {
            PersonaDTO personaDTO = new PersonaDTO();

            personaDTO.setPersId(persona.getPersId());
            personaDTO.setEmail((persona.getEmail() != null)
                ? persona.getEmail() : null);
            personaDTO.setEstadoRegistro((persona.getEstadoRegistro() != null)
                ? persona.getEstadoRegistro() : null);
            personaDTO.setFechaCreacion(persona.getFechaCreacion());
            personaDTO.setFechaModificacion(persona.getFechaModificacion());
            personaDTO.setIdentificacion((persona.getIdentificacion() != null)
                ? persona.getIdentificacion() : null);
            personaDTO.setPrimerApellido((persona.getPrimerApellido() != null)
                ? persona.getPrimerApellido() : null);
            personaDTO.setPrimerNombre((persona.getPrimerNombre() != null)
                ? persona.getPrimerNombre() : null);
            personaDTO.setSegundoApellido((persona.getSegundoApellido() != null)
                ? persona.getSegundoApellido() : null);
            personaDTO.setSegundoNombre((persona.getSegundoNombre() != null)
                ? persona.getSegundoNombre() : null);
            personaDTO.setUsuCreador((persona.getUsuCreador() != null)
                ? persona.getUsuCreador() : null);
            personaDTO.setUsuModifica((persona.getUsuModifica() != null)
                ? persona.getUsuModifica() : null);
            personaDTO.setTiidId_TipoIdentificacion((persona.getTipoIdentificacion()
                                                            .getTiidId() != null)
                ? persona.getTipoIdentificacion().getTiidId() : null);

            return personaDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Persona personaDTOToPersona(PersonaDTO personaDTO)
        throws Exception {
        try {
            Persona persona = new Persona();

            persona.setPersId(personaDTO.getPersId());
            persona.setEmail((personaDTO.getEmail() != null)
                ? personaDTO.getEmail() : null);
            persona.setEstadoRegistro((personaDTO.getEstadoRegistro() != null)
                ? personaDTO.getEstadoRegistro() : null);
            persona.setFechaCreacion(personaDTO.getFechaCreacion());
            persona.setFechaModificacion(personaDTO.getFechaModificacion());
            persona.setIdentificacion((personaDTO.getIdentificacion() != null)
                ? personaDTO.getIdentificacion() : null);
            persona.setPrimerApellido((personaDTO.getPrimerApellido() != null)
                ? personaDTO.getPrimerApellido() : null);
            persona.setPrimerNombre((personaDTO.getPrimerNombre() != null)
                ? personaDTO.getPrimerNombre() : null);
            persona.setSegundoApellido((personaDTO.getSegundoApellido() != null)
                ? personaDTO.getSegundoApellido() : null);
            persona.setSegundoNombre((personaDTO.getSegundoNombre() != null)
                ? personaDTO.getSegundoNombre() : null);
            persona.setUsuCreador((personaDTO.getUsuCreador() != null)
                ? personaDTO.getUsuCreador() : null);
            persona.setUsuModifica((personaDTO.getUsuModifica() != null)
                ? personaDTO.getUsuModifica() : null);

            TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

            if (personaDTO.getTiidId_TipoIdentificacion() != null) {
                tipoIdentificacion = serviceTipoIdentificacion1.getTipoIdentificacion(personaDTO.getTiidId_TipoIdentificacion());
            }

            if (tipoIdentificacion != null) {
                persona.setTipoIdentificacion(tipoIdentificacion);
            }

            return persona;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<PersonaDTO> listPersonaToListPersonaDTO(
        List<Persona> listPersona) throws Exception {
        try {
            List<PersonaDTO> personaDTOs = new ArrayList<PersonaDTO>();

            for (Persona persona : listPersona) {
                PersonaDTO personaDTO = personaToPersonaDTO(persona);

                personaDTOs.add(personaDTO);
            }

            return personaDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Persona> listPersonaDTOToListPersona(
        List<PersonaDTO> listPersonaDTO) throws Exception {
        try {
            List<Persona> listPersona = new ArrayList<Persona>();

            for (PersonaDTO personaDTO : listPersonaDTO) {
                Persona persona = personaDTOToPersona(personaDTO);

                listPersona.add(persona);
            }

            return listPersona;
        } catch (Exception e) {
            throw e;
        }
    }
}
