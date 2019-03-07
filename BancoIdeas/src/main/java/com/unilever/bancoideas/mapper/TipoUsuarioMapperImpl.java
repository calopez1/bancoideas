package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.TipoUsuarioDTO;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.modelo.TipoUsuario;
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
public class TipoUsuarioMapperImpl implements TipoUsuarioMapper {
    private static final Logger log = LoggerFactory.getLogger(TipoUsuarioMapperImpl.class);

    @Transactional(readOnly = true)
    public TipoUsuarioDTO tipoUsuarioToTipoUsuarioDTO(TipoUsuario tipoUsuario)
        throws Exception {
        try {
            TipoUsuarioDTO tipoUsuarioDTO = new TipoUsuarioDTO();

            tipoUsuarioDTO.setTiusId(tipoUsuario.getTiusId());
            tipoUsuarioDTO.setCodigo((tipoUsuario.getCodigo() != null)
                ? tipoUsuario.getCodigo() : null);
            tipoUsuarioDTO.setDescripcion((tipoUsuario.getDescripcion() != null)
                ? tipoUsuario.getDescripcion() : null);
            tipoUsuarioDTO.setEstadoRegistro((tipoUsuario.getEstadoRegistro() != null)
                ? tipoUsuario.getEstadoRegistro() : null);
            tipoUsuarioDTO.setFechaCreacion(tipoUsuario.getFechaCreacion());
            tipoUsuarioDTO.setFechaModificacion(tipoUsuario.getFechaModificacion());
            tipoUsuarioDTO.setNombre((tipoUsuario.getNombre() != null)
                ? tipoUsuario.getNombre() : null);
            tipoUsuarioDTO.setUsuCreador((tipoUsuario.getUsuCreador() != null)
                ? tipoUsuario.getUsuCreador() : null);
            tipoUsuarioDTO.setUsuModifica((tipoUsuario.getUsuModifica() != null)
                ? tipoUsuario.getUsuModifica() : null);

            return tipoUsuarioDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public TipoUsuario tipoUsuarioDTOToTipoUsuario(
        TipoUsuarioDTO tipoUsuarioDTO) throws Exception {
        try {
            TipoUsuario tipoUsuario = new TipoUsuario();

            tipoUsuario.setTiusId(tipoUsuarioDTO.getTiusId());
            tipoUsuario.setCodigo((tipoUsuarioDTO.getCodigo() != null)
                ? tipoUsuarioDTO.getCodigo() : null);
            tipoUsuario.setDescripcion((tipoUsuarioDTO.getDescripcion() != null)
                ? tipoUsuarioDTO.getDescripcion() : null);
            tipoUsuario.setEstadoRegistro((tipoUsuarioDTO.getEstadoRegistro() != null)
                ? tipoUsuarioDTO.getEstadoRegistro() : null);
            tipoUsuario.setFechaCreacion(tipoUsuarioDTO.getFechaCreacion());
            tipoUsuario.setFechaModificacion(tipoUsuarioDTO.getFechaModificacion());
            tipoUsuario.setNombre((tipoUsuarioDTO.getNombre() != null)
                ? tipoUsuarioDTO.getNombre() : null);
            tipoUsuario.setUsuCreador((tipoUsuarioDTO.getUsuCreador() != null)
                ? tipoUsuarioDTO.getUsuCreador() : null);
            tipoUsuario.setUsuModifica((tipoUsuarioDTO.getUsuModifica() != null)
                ? tipoUsuarioDTO.getUsuModifica() : null);

            return tipoUsuario;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<TipoUsuarioDTO> listTipoUsuarioToListTipoUsuarioDTO(
        List<TipoUsuario> listTipoUsuario) throws Exception {
        try {
            List<TipoUsuarioDTO> tipoUsuarioDTOs = new ArrayList<TipoUsuarioDTO>();

            for (TipoUsuario tipoUsuario : listTipoUsuario) {
                TipoUsuarioDTO tipoUsuarioDTO = tipoUsuarioToTipoUsuarioDTO(tipoUsuario);

                tipoUsuarioDTOs.add(tipoUsuarioDTO);
            }

            return tipoUsuarioDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<TipoUsuario> listTipoUsuarioDTOToListTipoUsuario(
        List<TipoUsuarioDTO> listTipoUsuarioDTO) throws Exception {
        try {
            List<TipoUsuario> listTipoUsuario = new ArrayList<TipoUsuario>();

            for (TipoUsuarioDTO tipoUsuarioDTO : listTipoUsuarioDTO) {
                TipoUsuario tipoUsuario = tipoUsuarioDTOToTipoUsuario(tipoUsuarioDTO);

                listTipoUsuario.add(tipoUsuario);
            }

            return listTipoUsuario;
        } catch (Exception e) {
            throw e;
        }
    }
}
