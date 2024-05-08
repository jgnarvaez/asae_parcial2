package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.input;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Respuesta;

public interface GestionarRespuestasCUIntPort {
    
    public Respuesta crear(Respuesta objRespuesta);
    
    public List<Respuesta> listar();
}
