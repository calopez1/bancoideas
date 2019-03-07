package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.TipoIdentificacionDTO;
import com.unilever.bancoideas.modelo.TipoIdentificacion;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface TipoIdentificacionMapper {
    public TipoIdentificacionDTO tipoIdentificacionToTipoIdentificacionDTO(
        TipoIdentificacion tipoIdentificacion) throws Exception;

    public TipoIdentificacion tipoIdentificacionDTOToTipoIdentificacion(
        TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception;

    public List<TipoIdentificacionDTO> listTipoIdentificacionToListTipoIdentificacionDTO(
        List<TipoIdentificacion> tipoIdentificacions) throws Exception;

    public List<TipoIdentificacion> listTipoIdentificacionDTOToListTipoIdentificacion(
        List<TipoIdentificacionDTO> tipoIdentificacionDTOs)
        throws Exception;
}
