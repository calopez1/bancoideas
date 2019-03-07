package com.unilever.bancoideas.service;

import com.unilever.bancoideas.dto.TipoIdentificacionDTO;
import com.unilever.bancoideas.modelo.TipoIdentificacion;

import java.math.*;

import java.util.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface TipoIdentificacionService {
    public List<TipoIdentificacion> getTipoIdentificacion()
        throws Exception;

    /**
         * Save an new TipoIdentificacion entity
         */
    public void saveTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    /**
         * Delete an existing TipoIdentificacion entity
         *
         */
    public void deleteTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    /**
        * Update an existing TipoIdentificacion entity
        *
        */
    public void updateTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    /**
         * Load an existing TipoIdentificacion entity
         *
         */
    public TipoIdentificacion getTipoIdentificacion(Integer tiidId)
        throws Exception;

    public List<TipoIdentificacion> findByCriteria(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoIdentificacion> findPageTipoIdentificacion(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberTipoIdentificacion() throws Exception;

    public List<TipoIdentificacionDTO> getDataTipoIdentificacion()
        throws Exception;

    public void validateTipoIdentificacion(
        TipoIdentificacion tipoIdentificacion) throws Exception;
}
