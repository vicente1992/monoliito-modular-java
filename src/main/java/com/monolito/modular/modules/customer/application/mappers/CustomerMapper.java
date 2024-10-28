package com.monolito.modular.modules.customer.application.mappers;

import org.mapstruct.Mapper;

import com.monolito.modular.modules.customer.domain.dtos.CustomerDTO;
import com.monolito.modular.modules.customer.domain.entities.Customer;

@Mapper(componentModel = "spring")
public interface CustomerMapper {

  
  CustomerDTO toDto(Customer customer);

  Customer toEntity(CustomerDTO dto);
}


// @Mapper(componentModel = "spring")
// public interface AdmisionResumenMapper {

//   @Mapping(target = "id", source = "admision.id")
//   @Mapping(target = "consecutivo", source = "admision.consecutivo")
//   @Mapping(target = "nombrePaciente", source = "admision.paciente.nombre")
//   @Mapping(target = "apellidosPaciente", source = "admision.paciente.apellidos")
//   @Mapping(target = "procedimiento", source = "admision.procedimiento")
//   @Mapping(target = "codigoProcedimiento", source = "admision.codigoProcedimiento")
//   @Mapping(target = "fechaInicio", source = "admision.fechaInicio")
//   @Mapping(target = "cantidadSesiones", source = "admision.cantidadSesiones")
//   @Mapping(target = "sesionesAsignadas", source = "sesionesAsignadas")

//   AdmisionResumenDTO toDto(Admision admision, long sesionesAsignadas);

//   Admision toEntity(AdmisionResumenDTO dto);
// }