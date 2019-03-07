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
import com.unilever.bancoideas.service.DepartamentoService;
import com.unilever.bancoideas.service.PersonaService;
import com.unilever.bancoideas.service.TipoIdentificacionService;
import com.unilever.bancoideas.service.TipoUsuarioService;
import com.unilever.bancoideas.service.UsuarioService;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.context.annotation.Scope;

import org.springframework.stereotype.Component;

import java.math.BigDecimal;

import java.sql.*;

import java.util.Date;
import java.util.List;
import java.util.Set;


/**
* Use a Business Delegate to reduce coupling between presentation-tier clients and business services.
* The Business Delegate hides the underlying implementation details of the business service, such as lookup and access details of the EJB architecture.
*
* The Business Delegate acts as a client-side business abstraction; it provides an abstraction for, and thus hides,
* the implementation of the business services. Using a Business Delegate reduces the coupling between presentation-tier clients and
* the system's business services. Depending on the implementation strategy, the Business Delegate may shield clients from possible
* volatility in the implementation of the business service API. Potentially, this reduces the number of changes that must be made to the
* presentation-tier client code when the business service API or its underlying implementation changes.
*
* However, interface methods in the Business Delegate may still require modification if the underlying business service API changes.
* Admittedly, though, it is more likely that changes will be made to the business service rather than to the Business Delegate.
*
* Often, developers are skeptical when a design goal such as abstracting the business layer causes additional upfront work in return
* for future gains. However, using this pattern or its strategies results in only a small amount of additional upfront work and provides
* considerable benefits. The main benefit is hiding the details of the underlying service. For example, the client can become transparent
* to naming and lookup services. The Business Delegate also handles the exceptions from the business services, such as java.rmi.Remote
* exceptions, Java Messages Service (JMS) exceptions and so on. The Business Delegate may intercept such service level exceptions and
* generate application level exceptions instead. Application level exceptions are easier to handle by the clients, and may be user friendly.
* The Business Delegate may also transparently perform any retry or recovery operations necessary in the event of a service failure without
* exposing the client to the problem until it is determined that the problem is not resolvable. These gains present a compelling reason to
* use the pattern.
*
* Another benefit is that the delegate may cache results and references to remote business services. Caching can significantly improve performance,
* because it limits unnecessary and potentially costly round trips over the network.
*
* A Business Delegate uses a component called the Lookup Service. The Lookup Service is responsible for hiding the underlying implementation
* details of the business service lookup code. The Lookup Service may be written as part of the Delegate, but we recommend that it be
* implemented as a separate component, as outlined in the Service Locator pattern (See "Service Locator" on page 368.)
*
* When the Business Delegate is used with a Session Facade, typically there is a one-to-one relationship between the two.
* This one-to-one relationship exists because logic that might have been encapsulated in a Business Delegate relating to its interaction
* with multiple business services (creating a one-to-many relationship) will often be factored back into a Session Facade.
*
* Finally, it should be noted that this pattern could be used to reduce coupling between other tiers, not simply the presentation and the
* business tiers.
*
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
@Scope("singleton")
@Component("businessDelegator")
public class BusinessDelegatorImpl implements BusinessDelegator {
    private static final Logger log = LoggerFactory.getLogger(BusinessDelegatorImpl.class);
    @Autowired
    private PersonaService personaService;
    @Autowired
    private UsuarioService usuarioService;
    @Autowired
    private TipoUsuarioService tipoUsuarioService;
    @Autowired
    private DepartamentoService departamentoService;
    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;

    public List<Persona> getPersona() throws Exception {
        return personaService.getPersona();
    }

    public void savePersona(Persona entity) throws Exception {
        personaService.savePersona(entity);
    }

    public void deletePersona(Persona entity) throws Exception {
        personaService.deletePersona(entity);
    }

    public void updatePersona(Persona entity) throws Exception {
        personaService.updatePersona(entity);
    }

    public Persona getPersona(Integer persId) throws Exception {
        Persona persona = null;

        try {
            persona = personaService.getPersona(persId);
        } catch (Exception e) {
            throw e;
        }

        return persona;
    }

    public List<Persona> findByCriteriaInPersona(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return personaService.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Persona> findPagePersona(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return personaService.findPagePersona(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberPersona() throws Exception {
        return personaService.findTotalNumberPersona();
    }

    public List<PersonaDTO> getDataPersona() throws Exception {
        return personaService.getDataPersona();
    }

    public void validatePersona(Persona persona) throws Exception {
        personaService.validatePersona(persona);
    }

    public List<Usuario> getUsuario() throws Exception {
        return usuarioService.getUsuario();
    }

    public void saveUsuario(Usuario entity) throws Exception {
        usuarioService.saveUsuario(entity);
    }

    public void deleteUsuario(Usuario entity) throws Exception {
        usuarioService.deleteUsuario(entity);
    }

    public void updateUsuario(Usuario entity) throws Exception {
        usuarioService.updateUsuario(entity);
    }

    public Usuario getUsuario(Integer usuaId) throws Exception {
        Usuario usuario = null;

        try {
            usuario = usuarioService.getUsuario(usuaId);
        } catch (Exception e) {
            throw e;
        }

        return usuario;
    }

    public List<Usuario> findByCriteriaInUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return usuarioService.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Usuario> findPageUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return usuarioService.findPageUsuario(sortColumnName, sortAscending,
            startRow, maxResults);
    }

    public Long findTotalNumberUsuario() throws Exception {
        return usuarioService.findTotalNumberUsuario();
    }

    public List<UsuarioDTO> getDataUsuario() throws Exception {
        return usuarioService.getDataUsuario();
    }

    public void validateUsuario(Usuario usuario) throws Exception {
        usuarioService.validateUsuario(usuario);
    }

    public List<TipoUsuario> getTipoUsuario() throws Exception {
        return tipoUsuarioService.getTipoUsuario();
    }

    public void saveTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioService.saveTipoUsuario(entity);
    }

    public void deleteTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioService.deleteTipoUsuario(entity);
    }

    public void updateTipoUsuario(TipoUsuario entity) throws Exception {
        tipoUsuarioService.updateTipoUsuario(entity);
    }

    public TipoUsuario getTipoUsuario(Integer tiusId) throws Exception {
        TipoUsuario tipoUsuario = null;

        try {
            tipoUsuario = tipoUsuarioService.getTipoUsuario(tiusId);
        } catch (Exception e) {
            throw e;
        }

        return tipoUsuario;
    }

    public List<TipoUsuario> findByCriteriaInTipoUsuario(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return tipoUsuarioService.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<TipoUsuario> findPageTipoUsuario(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return tipoUsuarioService.findPageTipoUsuario(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoUsuario() throws Exception {
        return tipoUsuarioService.findTotalNumberTipoUsuario();
    }

    public List<TipoUsuarioDTO> getDataTipoUsuario() throws Exception {
        return tipoUsuarioService.getDataTipoUsuario();
    }

    public void validateTipoUsuario(TipoUsuario tipoUsuario)
        throws Exception {
        tipoUsuarioService.validateTipoUsuario(tipoUsuario);
    }

    public List<Departamento> getDepartamento() throws Exception {
        return departamentoService.getDepartamento();
    }

    public void saveDepartamento(Departamento entity) throws Exception {
        departamentoService.saveDepartamento(entity);
    }

    public void deleteDepartamento(Departamento entity)
        throws Exception {
        departamentoService.deleteDepartamento(entity);
    }

    public void updateDepartamento(Departamento entity)
        throws Exception {
        departamentoService.updateDepartamento(entity);
    }

    public Departamento getDepartamento(Integer depaId)
        throws Exception {
        Departamento departamento = null;

        try {
            departamento = departamentoService.getDepartamento(depaId);
        } catch (Exception e) {
            throw e;
        }

        return departamento;
    }

    public List<Departamento> findByCriteriaInDepartamento(Object[] variables,
        Object[] variablesBetween, Object[] variablesBetweenDates)
        throws Exception {
        return departamentoService.findByCriteria(variables, variablesBetween,
            variablesBetweenDates);
    }

    public List<Departamento> findPageDepartamento(String sortColumnName,
        boolean sortAscending, int startRow, int maxResults)
        throws Exception {
        return departamentoService.findPageDepartamento(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberDepartamento() throws Exception {
        return departamentoService.findTotalNumberDepartamento();
    }

    public List<DepartamentoDTO> getDataDepartamento()
        throws Exception {
        return departamentoService.getDataDepartamento();
    }

    public void validateDepartamento(Departamento departamento)
        throws Exception {
        departamentoService.validateDepartamento(departamento);
    }

    public List<TipoIdentificacion> getTipoIdentificacion()
        throws Exception {
        return tipoIdentificacionService.getTipoIdentificacion();
    }

    public void saveTipoIdentificacion(TipoIdentificacion entity)
        throws Exception {
        tipoIdentificacionService.saveTipoIdentificacion(entity);
    }

    public void deleteTipoIdentificacion(TipoIdentificacion entity)
        throws Exception {
        tipoIdentificacionService.deleteTipoIdentificacion(entity);
    }

    public void updateTipoIdentificacion(TipoIdentificacion entity)
        throws Exception {
        tipoIdentificacionService.updateTipoIdentificacion(entity);
    }

    public TipoIdentificacion getTipoIdentificacion(Integer tiidId)
        throws Exception {
        TipoIdentificacion tipoIdentificacion = null;

        try {
            tipoIdentificacion = tipoIdentificacionService.getTipoIdentificacion(tiidId);
        } catch (Exception e) {
            throw e;
        }

        return tipoIdentificacion;
    }

    public List<TipoIdentificacion> findByCriteriaInTipoIdentificacion(
        Object[] variables, Object[] variablesBetween,
        Object[] variablesBetweenDates) throws Exception {
        return tipoIdentificacionService.findByCriteria(variables,
            variablesBetween, variablesBetweenDates);
    }

    public List<TipoIdentificacion> findPageTipoIdentificacion(
        String sortColumnName, boolean sortAscending, int startRow,
        int maxResults) throws Exception {
        return tipoIdentificacionService.findPageTipoIdentificacion(sortColumnName,
            sortAscending, startRow, maxResults);
    }

    public Long findTotalNumberTipoIdentificacion() throws Exception {
        return tipoIdentificacionService.findTotalNumberTipoIdentificacion();
    }

    public List<TipoIdentificacionDTO> getDataTipoIdentificacion()
        throws Exception {
        return tipoIdentificacionService.getDataTipoIdentificacion();
    }

    public void validateTipoIdentificacion(
        TipoIdentificacion tipoIdentificacion) throws Exception {
        tipoIdentificacionService.validateTipoIdentificacion(tipoIdentificacion);
    }
}
