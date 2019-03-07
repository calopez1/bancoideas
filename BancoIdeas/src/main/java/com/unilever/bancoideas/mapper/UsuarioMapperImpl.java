package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.UsuarioDTO;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.modelo.Usuario;
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
public class UsuarioMapperImpl implements UsuarioMapper {
    private static final Logger log = LoggerFactory.getLogger(UsuarioMapperImpl.class);

    /**
    * Service injected by Spring that manages Departamento entities
    *
    */
    @Autowired
    DepartamentoService serviceDepartamento1;

    /**
    * Service injected by Spring that manages Persona entities
    *
    */
    @Autowired
    PersonaService servicePersona2;

    /**
    * Service injected by Spring that manages TipoUsuario entities
    *
    */
    @Autowired
    TipoUsuarioService serviceTipoUsuario3;

    @Transactional(readOnly = true)
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario)
        throws Exception {
        try {
            UsuarioDTO usuarioDTO = new UsuarioDTO();

            usuarioDTO.setUsuaId(usuario.getUsuaId());
            usuarioDTO.setContrasena((usuario.getContrasena() != null)
                ? usuario.getContrasena() : null);
            usuarioDTO.setEstadoRegistro((usuario.getEstadoRegistro() != null)
                ? usuario.getEstadoRegistro() : null);
            usuarioDTO.setFechaCreacion(usuario.getFechaCreacion());
            usuarioDTO.setFechaModificacion(usuario.getFechaModificacion());
            usuarioDTO.setUsuCreador((usuario.getUsuCreador() != null)
                ? usuario.getUsuCreador() : null);
            usuarioDTO.setUsuModifica((usuario.getUsuModifica() != null)
                ? usuario.getUsuModifica() : null);
            usuarioDTO.setUsuario((usuario.getUsuario() != null)
                ? usuario.getUsuario() : null);
            usuarioDTO.setDepaId_Departamento((usuario.getDepartamento()
                                                      .getDepaId() != null)
                ? usuario.getDepartamento().getDepaId() : null);
            usuarioDTO.setPersId_Persona((usuario.getPersona().getPersId() != null)
                ? usuario.getPersona().getPersId() : null);
            usuarioDTO.setTiusId_TipoUsuario((usuario.getTipoUsuario()
                                                     .getTiusId() != null)
                ? usuario.getTipoUsuario().getTiusId() : null);

            return usuarioDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO)
        throws Exception {
        try {
            Usuario usuario = new Usuario();

            usuario.setUsuaId(usuarioDTO.getUsuaId());
            usuario.setContrasena((usuarioDTO.getContrasena() != null)
                ? usuarioDTO.getContrasena() : null);
            usuario.setEstadoRegistro((usuarioDTO.getEstadoRegistro() != null)
                ? usuarioDTO.getEstadoRegistro() : null);
            usuario.setFechaCreacion(usuarioDTO.getFechaCreacion());
            usuario.setFechaModificacion(usuarioDTO.getFechaModificacion());
            usuario.setUsuCreador((usuarioDTO.getUsuCreador() != null)
                ? usuarioDTO.getUsuCreador() : null);
            usuario.setUsuModifica((usuarioDTO.getUsuModifica() != null)
                ? usuarioDTO.getUsuModifica() : null);
            usuario.setUsuario((usuarioDTO.getUsuario() != null)
                ? usuarioDTO.getUsuario() : null);

            Departamento departamento = new Departamento();

            if (usuarioDTO.getDepaId_Departamento() != null) {
                departamento = serviceDepartamento1.getDepartamento(usuarioDTO.getDepaId_Departamento());
            }

            if (departamento != null) {
                usuario.setDepartamento(departamento);
            }

            Persona persona = new Persona();

            if (usuarioDTO.getPersId_Persona() != null) {
                persona = servicePersona2.getPersona(usuarioDTO.getPersId_Persona());
            }

            if (persona != null) {
                usuario.setPersona(persona);
            }

            TipoUsuario tipoUsuario = new TipoUsuario();

            if (usuarioDTO.getTiusId_TipoUsuario() != null) {
                tipoUsuario = serviceTipoUsuario3.getTipoUsuario(usuarioDTO.getTiusId_TipoUsuario());
            }

            if (tipoUsuario != null) {
                usuario.setTipoUsuario(tipoUsuario);
            }

            return usuario;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<UsuarioDTO> listUsuarioToListUsuarioDTO(
        List<Usuario> listUsuario) throws Exception {
        try {
            List<UsuarioDTO> usuarioDTOs = new ArrayList<UsuarioDTO>();

            for (Usuario usuario : listUsuario) {
                UsuarioDTO usuarioDTO = usuarioToUsuarioDTO(usuario);

                usuarioDTOs.add(usuarioDTO);
            }

            return usuarioDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Usuario> listUsuarioDTOToListUsuario(
        List<UsuarioDTO> listUsuarioDTO) throws Exception {
        try {
            List<Usuario> listUsuario = new ArrayList<Usuario>();

            for (UsuarioDTO usuarioDTO : listUsuarioDTO) {
                Usuario usuario = usuarioDTOToUsuario(usuarioDTO);

                listUsuario.add(usuario);
            }

            return listUsuario;
        } catch (Exception e) {
            throw e;
        }
    }
}
