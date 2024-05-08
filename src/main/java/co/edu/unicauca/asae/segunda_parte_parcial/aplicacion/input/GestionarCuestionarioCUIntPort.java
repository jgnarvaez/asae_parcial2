package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.input;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;

public interface GestionarCuestionarioCUIntPort{
    
    public Cuestionario crear(Cuestionario objCuestionario);
    
    public List<Cuestionario> listar();
}
