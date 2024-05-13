package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarDocente.DTOPeticion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class DepartamentoDTOPeticion {

    private Integer idDepartamento;
    
    @NotNull(message = "{departamento.nombre.emply}")
    @Size(min = 5, max = 100, message = "{departamento.nombre.size}")
    private String nombredep;

    @NotNull(message = "{departamento.descripcion.emply}")
    @Size(min = 5, max = 100, message = "{departamento.descripcion.size}")
    private String descripcion;
}
