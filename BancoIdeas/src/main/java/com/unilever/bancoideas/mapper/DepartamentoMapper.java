package com.unilever.bancoideas.mapper;

import com.unilever.bancoideas.dto.DepartamentoDTO;
import com.unilever.bancoideas.modelo.Departamento;

import java.util.List;


/**
* @author Zathura Code Generator http://zathuracode.org/
* www.zathuracode.org
*
*/
public interface DepartamentoMapper {
    public DepartamentoDTO departamentoToDepartamentoDTO(
        Departamento departamento) throws Exception;

    public Departamento departamentoDTOToDepartamento(
        DepartamentoDTO departamentoDTO) throws Exception;

    public List<DepartamentoDTO> listDepartamentoToListDepartamentoDTO(
        List<Departamento> departamentos) throws Exception;

    public List<Departamento> listDepartamentoDTOToListDepartamento(
        List<DepartamentoDTO> departamentoDTOs) throws Exception;
}
