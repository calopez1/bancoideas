package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.UsuarioDTO;
import com.unilever.bancoideas.modelo.Usuario;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface UsuarioMapper {
    public UsuarioDTO usuarioToUsuarioDTO(Usuario usuario)
        throws Exception;

    public Usuario usuarioDTOToUsuario(UsuarioDTO usuarioDTO)
        throws Exception;

    public List<UsuarioDTO> listUsuarioToListUsuarioDTO(List<Usuario> usuarios)
        throws Exception;

    public List<Usuario> listUsuarioDTOToListUsuario(
        List<UsuarioDTO> usuarioDTOs) throws Exception;
}
