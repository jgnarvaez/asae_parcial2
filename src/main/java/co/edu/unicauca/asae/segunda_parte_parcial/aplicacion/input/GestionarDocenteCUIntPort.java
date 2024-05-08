package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.input;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Docente;

public interface GestionarDocenteCUIntPort {
    
    public Docente crear(Docente objDocente);
    
    public List<Docente> listar();
}