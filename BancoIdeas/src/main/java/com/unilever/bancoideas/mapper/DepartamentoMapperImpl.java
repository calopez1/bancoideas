package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.DepartamentoDTO;
import com.unilever.bancoideas.modelo.*;
import com.unilever.bancoideas.modelo.Departamento;
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
public class DepartamentoMapperImpl implements DepartamentoMapper {
    private static final Logger log = LoggerFactory.getLogger(DepartamentoMapperImpl.class);

    @Transactional(readOnly = true)
    public DepartamentoDTO departamentoToDepartamentoDTO(
        Departamento departamento) throws Exception {
        try {
            DepartamentoDTO departamentoDTO = new DepartamentoDTO();

            departamentoDTO.setDepaId(departamento.getDepaId());
            departamentoDTO.setCodigo((departamento.getCodigo() != null)
                ? departamento.getCodigo() : null);
            departamentoDTO.setDescripcion((departamento.getDescripcion() != null)
                ? departamento.getDescripcion() : null);
            departamentoDTO.setEstadoRegistro((departamento.getEstadoRegistro() != null)
                ? departamento.getEstadoRegistro() : null);
            departamentoDTO.setFechaCreacion(departamento.getFechaCreacion());
            departamentoDTO.setFechaModificacion(departamento.getFechaModificacion());
            departamentoDTO.setNombre((departamento.getNombre() != null)
                ? departamento.getNombre() : null);
            departamentoDTO.setUsuCreador((departamento.getUsuCreador() != null)
                ? departamento.getUsuCreador() : null);
            departamentoDTO.setUsuModificador((departamento.getUsuModificador() != null)
                ? departamento.getUsuModificador() : null);

            return departamentoDTO;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public Departamento departamentoDTOToDepartamento(
        DepartamentoDTO departamentoDTO) throws Exception {
        try {
            Departamento departamento = new Departamento();

            departamento.setDepaId(departamentoDTO.getDepaId());
            departamento.setCodigo((departamentoDTO.getCodigo() != null)
                ? departamentoDTO.getCodigo() : null);
            departamento.setDescripcion((departamentoDTO.getDescripcion() != null)
                ? departamentoDTO.getDescripcion() : null);
            departamento.setEstadoRegistro((departamentoDTO.getEstadoRegistro() != null)
                ? departamentoDTO.getEstadoRegistro() : null);
            departamento.setFechaCreacion(departamentoDTO.getFechaCreacion());
            departamento.setFechaModificacion(departamentoDTO.getFechaModificacion());
            departamento.setNombre((departamentoDTO.getNombre() != null)
                ? departamentoDTO.getNombre() : null);
            departamento.setUsuCreador((departamentoDTO.getUsuCreador() != null)
                ? departamentoDTO.getUsuCreador() : null);
            departamento.setUsuModificador((departamentoDTO.getUsuModificador() != null)
                ? departamentoDTO.getUsuModificador() : null);

            return departamento;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<DepartamentoDTO> listDepartamentoToListDepartamentoDTO(
        List<Departamento> listDepartamento) throws Exception {
        try {
            List<DepartamentoDTO> departamentoDTOs = new ArrayList<DepartamentoDTO>();

            for (Departamento departamento : listDepartamento) {
                DepartamentoDTO departamentoDTO = departamentoToDepartamentoDTO(departamento);

                departamentoDTOs.add(departamentoDTO);
            }

            return departamentoDTOs;
        } catch (Exception e) {
            throw e;
        }
    }

    @Transactional(readOnly = true)
    public List<Departamento> listDepartamentoDTOToListDepartamento(
        List<DepartamentoDTO> listDepartamentoDTO) throws Exception {
        try {
            List<Departamento> listDepartamento = new ArrayList<Departamento>();

            for (DepartamentoDTO departamentoDTO : listDepartamentoDTO) {
                Departamento departamento = departamentoDTOToDepartamento(departamentoDTO);

                listDepartamento.add(departamento);
            }

            return listDepartamento;
        } catch (Exception e) {
            throw e;
        }
    }
}
