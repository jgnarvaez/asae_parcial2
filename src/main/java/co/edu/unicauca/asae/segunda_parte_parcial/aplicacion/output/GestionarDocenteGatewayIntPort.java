package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Docente;

public interface GestionarDocenteGatewayIntPort{
    
    public boolean existeDocentePorId(Integer idPersona);

    public Docente guardar(Docente objDocente);

    public List<Docente> listar();
}
