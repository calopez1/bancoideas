package com.unilever.bancoideas.controller;

import com.unilever.bancoideas.dto.TipoUsuarioDTO;
import com.unilever.bancoideas.mapper.TipoUsuarioMapper;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.service.TipoUsuarioService;

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
@RequestMapping("/tipoUsuario")
public class TipoUsuarioRestController {
    private static final Logger log = LoggerFactory.getLogger(TipoUsuarioRestController.class);
    @Autowired
    private TipoUsuarioService tipoUsuarioService;
    @Autowired
    private TipoUsuarioMapper tipoUsuarioMapper;

    @PostMapping(value = "/saveTipoUsuario")
    public void saveTipoUsuario(@RequestBody
    TipoUsuarioDTO tipoUsuarioDTO) throws Exception {
        try {
            TipoUsuario tipoUsuario = tipoUsuarioMapper.tipoUsuarioDTOToTipoUsuario(tipoUsuarioDTO);

            tipoUsuarioService.saveTipoUsuario(tipoUsuario);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTipoUsuario/{tiusId}")
    public void deleteTipoUsuario(@PathVariable("tiusId")
    Integer tiusId) throws Exception {
        try {
            TipoUsuario tipoUsuario = tipoUsuarioService.getTipoUsuario(tiusId);

            tipoUsuarioService.deleteTipoUsuario(tipoUsuario);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTipoUsuario/")
    public void updateTipoUsuario(@RequestBody
    TipoUsuarioDTO tipoUsuarioDTO) throws Exception {
        try {
            TipoUsuario tipoUsuario = tipoUsuarioMapper.tipoUsuarioDTOToTipoUsuario(tipoUsuarioDTO);

            tipoUsuarioService.updateTipoUsuario(tipoUsuario);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTipoUsuario")
    public List<TipoUsuarioDTO> getDataTipoUsuario() throws Exception {
        try {
            return tipoUsuarioService.getDataTipoUsuario();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTipoUsuario/{tiusId}")
    public TipoUsuarioDTO getTipoUsuario(@PathVariable("tiusId")
    Integer tiusId) throws Exception {
        try {
            TipoUsuario tipoUsuario = tipoUsuarioService.getTipoUsuario(tiusId);

            return tipoUsuarioMapper.tipoUsuarioToTipoUsuarioDTO(tipoUsuario);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
