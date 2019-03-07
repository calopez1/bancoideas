package com.unilever.bancoideas.controller;

import com.unilever.bancoideas.dto.DepartamentoDTO;
import com.unilever.bancoideas.mapper.DepartamentoMapper;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.service.DepartamentoService;

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
@RequestMapping("/departamento")
public class DepartamentoRestController {
    private static final Logger log = LoggerFactory.getLogger(DepartamentoRestController.class);
    @Autowired
    private DepartamentoService departamentoService;
    @Autowired
    private DepartamentoMapper departamentoMapper;

    @PostMapping(value = "/saveDepartamento")
    public void saveDepartamento(@RequestBody
    DepartamentoDTO departamentoDTO) throws Exception {
        try {
            Departamento departamento = departamentoMapper.departamentoDTOToDepartamento(departamentoDTO);

            departamentoService.saveDepartamento(departamento);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @DeleteMapping(value = "/deleteDepartamento/{depaId}")
    public void deleteDepartamento(@PathVariable("depaId")
    Integer depaId) throws Exception {
        try {
            Departamento departamento = departamentoService.getDepartamento(depaId);

            departamentoService.deleteDepartamento(departamento);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @PutMapping(value = "/updateDepartamento/")
    public void updateDepartamento(@RequestBody
    DepartamentoDTO departamentoDTO) throws Exception {
        try {
            Departamento departamento = departamentoMapper.departamentoDTOToDepartamento(departamentoDTO);

            departamentoService.updateDepartamento(departamento);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDataDepartamento")
    public List<DepartamentoDTO> getDataDepartamento()
        throws Exception {
        try {
            return departamentoService.getDataDepartamento();
        } catch (Exception e) {
            log.error(e.getMessage(), e);
            throw e;
        }
    }

    @GetMapping(value = "/getDepartamento/{depaId}")
    public DepartamentoDTO getDepartamento(
        @PathVariable("depaId")
    Integer depaId) throws Exception {
        try {
            Departamento departamento = departamentoService.getDepartamento(depaId);

            return departamentoMapper.departamentoToDepartamentoDTO(departamento);
        } catch (Exception e) {
            log.error(e.getMessage(), e);
        }

        return null;
    }
}
