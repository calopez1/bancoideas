package com.unilever.bancoideas.view;

import com.unilever.bancoideas.dto.DepartamentoDTO;
import com.unilever.bancoideas.dto.PersonaDTO;
import com.unilever.bancoideas.dto.TipoIdentificacionDTO;
import com.unilever.bancoideas.dto.TipoUsuarioDTO;
import com.unilever.bancoideas.dto.UsuarioDTO;
import com.unilever.bancoideas.modelo.Departamento;
import com.unilever.bancoideas.modelo.Persona;
import com.unilever.bancoideas.modelo.TipoIdentificacion;
import com.unilever.bancoideas.modelo.TipoUsuario;
import com.unilever.bancoideas.modelo.Usuario;

import java.math.*;

import java.util.*;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface BusinessDelegator {
    public List<Persona> getPersona() throws Exception;

    public void savePersona(Persona entity) throws Exception;

    public void deletePersona(Persona entity) throws Exception;

    public void updatePersona(Persona entity) throws Exception;

    public Persona getPersona(Integer persId) throws Exception;

    public List<Persona> findByCriteriaInPersona(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Persona> findPagePersona(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberPersona() throws Exception;

    public List<PersonaDTO> getDataPersona() throws Exception;

    public void validatePersona(Persona persona) throws Exception;

    public List<Usuario> getUsuario() throws Exception;

    public void saveUsuario(Usuario entity) throws Exception;

    public void deleteUsuario(Usuario entity) throws Exception;

    public void updateUsuario(Usuario entity) throws Exception;

    public Usuario getUsuario(Integer usuaId) throws Exception;

    public List<Usuario> findByCriteriaInUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Usuario> findPageUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberUsuario() throws Exception;

    public List<UsuarioDTO> getDataUsuario() throws Exception;

    public void validateUsuario(Usuario usuario) throws Exception;

    public List<TipoUsuario> getTipoUsuario() throws Exception;

    public void saveTipoUsuario(TipoUsuario entity) throws Exception;

    public void deleteTipoUsuario(TipoUsuario entity) throws Exception;

    public void updateTipoUsuario(TipoUsuario entity) throws Exception;

    public TipoUsuario getTipoUsuario(Integer tiusId) throws Exception;

    public List<TipoUsuario> findByCriteriaInTipoUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<TipoUsuario> findPageTipoUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberTipoUsuario() throws Exception;

    public List<TipoUsuarioDTO> getDataTipoUsuario() throws Exception;

    public void validateTipoUsuario(TipoUsuario tipoUsuario)
        throws Exception;

    public List<Departamento> getDepartamento() throws Exception;

    public void saveDepartamento(Departamento entity) throws Exception;

    public void deleteDepartamento(Departamento entity)
        throws Exception;

    public void updateDepartamento(Departamento entity)
        throws Exception;

    public Departamento getDepartamento(Integer depaId)
        throws Exception;

    public List<Departamento> findByCriteriaInDepartamento(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception;

    public List<Departamento> findPageDepartamento(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception;

    public Long findTotalNumberDepartamento() throws Exception;

    public List<DepartamentoDTO> getDataDepartamento()
        throws Exception;

    public void validateDepartamento(Departamento departamento)
        throws Exception;

    public List<TipoIdentificacion> getTipoIdentificacion()
        throws Exception;

    public void saveTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    public void deleteTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    public void updateTipoIdentificacion(TipoIdentificacion entity)
        throws Exception;

    public TipoIdentificacion getTipoIdentificacion(Integer tiidId)
        throws Exception;

    public List<TipoIdentificacion> findByCriteriaInTipoIdentificacion(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception;

    public List<TipoIdentificacion> findPageTipoIdentificacion(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception;

    public Long findTotalNumberTipoIdentificacion() throws Exception;

    public List<TipoIdentificacionDTO> getDataTipoIdentificacion()
        throws Exception;

    public void validateTipoIdentificacion(
        TipoIdentificacion tipoIdentificacion) throws Exception;
}
