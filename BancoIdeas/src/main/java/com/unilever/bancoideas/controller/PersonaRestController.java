package com.unilever.bancoideas.controller;

import com.unilever.bancoideas.dto.PersonaDTO;
import com.unilever.bancoideas.mapper.PersonaMapper;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.service.PersonaService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
@RequestMapping("/persona")
public class PersonaRestController {
    private static final Logger log = LoggerFactory.getLogger(PersonaRestController.class);
    @Autowired
    private PersonaService personaService;
    @Autowired
    private PersonaMapper personaMapper;

    @PostMapping(value = "/savePersona")
    public void savePersona(@RequestBody
    PersonaDTO personaDTO) throws Exception {
        try {
            Persona persona = personaMapper.personaDTOToPersona(personaDTO);

            personaService.savePersona(persona);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deletePersona/{persId}")
    public void deletePersona(@PathVariable("persId")
    Integer persId) throws Exception {
        try {
            Persona persona = personaService.getPersona(persId);

            personaService.deletePersona(persona);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updatePersona/")
    public void updatePersona(@RequestBody
    PersonaDTO personaDTO) throws Exception {
        try {
            Persona persona = personaMapper.personaDTOToPersona(personaDTO);

            personaService.updatePersona(persona);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataPersona")
    public List<PersonaDTO> getDataPersona() throws Exception {
        try {
            return personaService.getDataPersona();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getPersona/{persId}")
    public PersonaDTO getPersona(@PathVariable("persId")
    Integer persId) throws Exception {
        try {
            Persona persona = personaService.getPersona(persId);

            return personaMapper.personaToPersonaDTO(persona);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
