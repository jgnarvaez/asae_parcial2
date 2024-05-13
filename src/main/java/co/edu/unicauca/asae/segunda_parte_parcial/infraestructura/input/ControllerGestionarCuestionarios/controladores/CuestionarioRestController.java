package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.controladores;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.input.GestionarCuestionarioCUIntPort;
import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTOPeticion.CuestionarioDTOPeticion;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.DTORespuesta.CuestionarioDTORespuesta;
import co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.input.ControllerGestionarCuestionarios.mappers.CuestionarioMapperInfraestructuraDominio;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
public class CuestionarioRestController {

    private final GestionarCuestionarioCUIntPort objGestionarCuestionarioCUIntPort;
    private final CuestionarioMapperInfraestructuraDominio objMappeador;

    @PostMapping("/cuestionarios")
    public ResponseEntity<CuestionarioDTORespuesta> create(@RequestBody CuestionarioDTOPeticion objCuestionario) {
        Cuestionario objCuestionarioCrear = objMappeador.mappearDePeticionACuestionario(objCuestionario);
        Cuestionario objCuestionarioCreado = objGestionarCuestionarioCUIntPort.crear(objCuestionarioCrear);
        ResponseEntity<CuestionarioDTORespuesta> objRespuesta = new ResponseEntity<CuestionarioDTORespuesta>(objMappeador.mappearDeCuestionarioARespuesta(objCuestionarioCreado),HttpStatus.CREATED);
        
        return objRespuesta;
    }
    

}
