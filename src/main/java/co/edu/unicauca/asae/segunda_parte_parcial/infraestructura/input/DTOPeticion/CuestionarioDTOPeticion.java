package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.DTOPeticion;

import java.util.List;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CuestionarioDTOPeticion {

    private Integer idCuestionario;

    @NotNull(message = "{cuestionario.titulo.emptly}")
    private String titulo;

    @NotNull(message = "{cuestionario.descripcion.emptly}")
    private String descripcion;

    @Size(min = 1)
    List<PreguntaDTOPeticion> preguntasDTOsPeticion;
}
