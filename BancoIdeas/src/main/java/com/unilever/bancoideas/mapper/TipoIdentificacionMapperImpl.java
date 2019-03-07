package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.TipoIdentificacionDTO;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.modelo.TipoIdentificacion;
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
public class TipoIdentificacionMapperImpl implements TipoIdentificacionMapper {
    private static final Logger log = LoggerFactory.getLogger(TipoIdentificacionMapperImpl.class);

    @Transactional(readOnly = true)
    public TipoIdentificacionDTO tipoIdentificacionToTipoIdentificacionDTO(
        TipoIdentificacion tipoIdentificacion) throws Exception {
        try {
            TipoIdentificacionDTO tipoIdentificacionDTO = new TipoIdentificacionDTO();

            tipoIdentificacionDTO.setTiidId(tipoIdentificacion.getTiidId());
            tipoIdentificacionDTO.setCodigo((tipoIdentificacion.getCodigo() != null)
                ? tipoIdentificacion.getCodigo() : null);
            tipoIdentificacionDTO.setEstadoRegistro((tipoIdentificacion.getEstadoRegistro() != null)
                ? tipoIdentificacion.getEstadoRegistro() : null);
            tipoIdentificacionDTO.setFechaCreacion(tipoIdentificacion.getFechaCreacion());
            tipoIdentificacionDTO.setFechaModificacion(tipoIdentificacion.getFechaModificacion());
            tipoIdentificacionDTO.setNombre((tipoIdentificacion.getNombre() != null)
                ? tipoIdentificacion.getNombre() : null);
            tipoIdentificacionDTO.setUsuCreador((tipoIdentificacion.getUsuCreador() != null)
                ? tipoIdentificacion.getUsuCreador() : null);
            tipoIdentificacionDTO.setUsuModificador((tipoIdentificacion.getUsuModificador() != null)
                ? tipoIdentificacion.getUsuModificador() : null);

            return tipoIdentificacionDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public TipoIdentificacion tipoIdentificacionDTOToTipoIdentificacion(
        TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception {
        try {
            TipoIdentificacion tipoIdentificacion = new TipoIdentificacion();

            tipoIdentificacion.setTiidId(tipoIdentificacionDTO.getTiidId());
            tipoIdentificacion.setCodigo((tipoIdentificacionDTO.getCodigo() != null)
                ? tipoIdentificacionDTO.getCodigo() : null);
            tipoIdentificacion.setEstadoRegistro((tipoIdentificacionDTO.getEstadoRegistro() != null)
                ? tipoIdentificacionDTO.getEstadoRegistro() : null);
            tipoIdentificacion.setFechaCreacion(tipoIdentificacionDTO.getFechaCreacion());
            tipoIdentificacion.setFechaModificacion(tipoIdentificacionDTO.getFechaModificacion());
            tipoIdentificacion.setNombre((tipoIdentificacionDTO.getNombre() != null)
                ? tipoIdentificacionDTO.getNombre() : null);
            tipoIdentificacion.setUsuCreador((tipoIdentificacionDTO.getUsuCreador() != null)
                ? tipoIdentificacionDTO.getUsuCreador() : null);
            tipoIdentificacion.setUsuModificador((tipoIdentificacionDTO.getUsuModificador() != null)
                ? tipoIdentificacionDTO.getUsuModificador() : null);

            return tipoIdentificacion;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<TipoIdentificacionDTO> listTipoIdentificacionToListTipoIdentificacionDTO(
        List<TipoIdentificacion> listTipoIdentificacion)
        throws Exception {
        try {
            List<TipoIdentificacionDTO> tipoIdentificacionDTOs = new ArrayList<TipoIdentificacionDTO>();

            for (TipoIdentificacion tipoIdentificacion : listTipoIdentificacion) {
                TipoIdentificacionDTO tipoIdentificacionDTO = tipoIdentificacionToTipoIdentificacionDTO(tipoIdentificacion);

                tipoIdentificacionDTOs.add(tipoIdentificacionDTO);
            }

            return tipoIdentificacionDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<TipoIdentificacion> listTipoIdentificacionDTOToListTipoIdentificacion(
        List<TipoIdentificacionDTO> listTipoIdentificacionDTO)
        throws Exception {
        try {
            List<TipoIdentificacion> listTipoIdentificacion = new ArrayList<TipoIdentificacion>();

            for (TipoIdentificacionDTO tipoIdentificacionDTO : listTipoIdentificacionDTO) {
                TipoIdentificacion tipoIdentificacion = tipoIdentificacionDTOToTipoIdentificacion(tipoIdentificacionDTO);

                listTipoIdentificacion.add(tipoIdentificacion);
            }

            return listTipoIdentificacion;
        } catch (Exception e) {
            throw e;
        }
    }
}
