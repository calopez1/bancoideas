package com.unilever.bancoideas.service;

import com.unilever.bancoideas.dto.PersonaDTO;
import com.unilever.bancoideas.modelo.Persona;

import java.math.*;

import java.util.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface PersonaService {
    public List<Persona> getPersona() throws Exception;

    /**
         * Save an new Persona entity
         */
    public void savePersona(Persona entity) throws Exception;

    /**
         * Delete an existing Persona entity
         *
         */
    public void deletePersona(Persona entity) throws Exception;

    /**
        * Update an existing Persona entity
        *
        */
    public void updatePersona(Persona entity) throws Exception;

    /**
         * Load an existing Persona entity
         *
         */
    public Persona getPersona(Integer persId) throws Exception;

    public List<Persona> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Persona> findPagePersona(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPersona() throws Exception;

    public List<PersonaDTO> getDataPersona() throws Exception;

    public void validatePersona(Persona persona) throws Exception;
}
