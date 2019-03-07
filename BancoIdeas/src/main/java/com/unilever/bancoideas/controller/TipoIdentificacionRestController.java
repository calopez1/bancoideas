package com.unilever.bancoideas.controller;

import com.unilever.bancoideas.dto.TipoIdentificacionDTO;
import com.unilever.bancoideas.mapper.TipoIdentificacionMapper;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.service.TipoIdentificacionService;

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
@RequestMapping("/tipoIdentificacion")
public class TipoIdentificacionRestController {
    private static final Logger log = LoggerFactory.getLogger(TipoIdentificacionRestController.class);
    @Autowired
    private TipoIdentificacionService tipoIdentificacionService;
    @Autowired
    private TipoIdentificacionMapper tipoIdentificacionMapper;

    @PostMapping(value = "/saveTipoIdentificacion")
    public void saveTipoIdentificacion(
        @RequestBody
    TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception {
        try {
            TipoIdentificacion tipoIdentificacion = tipoIdentificacionMapper.tipoIdentificacionDTOToTipoIdentificacion(tipoIdentificacionDTO);

            tipoIdentificacionService.saveTipoIdentificacion(tipoIdentificacion);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteTipoIdentificacion/{tiidId}")
    public void deleteTipoIdentificacion(@PathVariable("tiidId")
    Integer tiidId) throws Exception {
        try {
            TipoIdentificacion tipoIdentificacion = tipoIdentificacionService.getTipoIdentificacion(tiidId);

            tipoIdentificacionService.deleteTipoIdentificacion(tipoIdentificacion);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateTipoIdentificacion/")
    public void updateTipoIdentificacion(
        @RequestBody
    TipoIdentificacionDTO tipoIdentificacionDTO) throws Exception {
        try {
            TipoIdentificacion tipoIdentificacion = tipoIdentificacionMapper.tipoIdentificacionDTOToTipoIdentificacion(tipoIdentificacionDTO);

            tipoIdentificacionService.updateTipoIdentificacion(tipoIdentificacion);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataTipoIdentificacion")
    public List<TipoIdentificacionDTO> getDataTipoIdentificacion()
        throws Exception {
        try {
            return tipoIdentificacionService.getDataTipoIdentificacion();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getTipoIdentificacion/{tiidId}")
    public TipoIdentificacionDTO getTipoIdentificacion(
        @PathVariable("tiidId")
    Integer tiidId) throws Exception {
        try {
            TipoIdentificacion tipoIdentificacion = tipoIdentificacionService.getTipoIdentificacion(tiidId);

            return tipoIdentificacionMapper.tipoIdentificacionToTipoIdentificacionDTO(tipoIdentificacion);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
