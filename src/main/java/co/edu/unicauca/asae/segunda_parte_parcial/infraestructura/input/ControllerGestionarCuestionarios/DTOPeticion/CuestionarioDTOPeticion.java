package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class CuestionarioDTOPeticion {

    private Integer idCuestionario;

    @NotNull(message = "{cuestionario.titulo.emptly}")
    @Size(min = 5, max = 30, message = "{cuestionario.titulo.size}")
    private String titulo;

    @NotNull(message = "{cuestionario.descripcion.emptly}")
    @Size(min = 5, max = 30, message = "{cuestionario.titulo.size}")
    private String descripcion;


   private List<PreguntaDTOPeticion> preguntasDTOsPeticion;

   public CuestionarioDTOPeticion() {
    this.preguntasDTOsPeticion = new ArrayList<>();
   }
}
