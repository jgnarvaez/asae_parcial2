package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class TipoPreguntaDTOPeticion {

    private Integer idTipoPreguntaDTOPeticion;

    @NotNull(message = "{tipopregunta.nombre.emply}")
    @Size(min = 2, max = 200, message = "{tipopregunta.nombre.size}")
    private String nombre;

    @NotNull(message = "{tipopregunta.descripcion.emply}")
    @Size(min = 5, max = 200, message = "{tipopregunta.descripcion.size}")
    private String descripcion;

}
