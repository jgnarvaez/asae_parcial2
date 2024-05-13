package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output;

import java.util.List;

import co.edu.unicauca.asae.segunda_parte_parcial.dominio.modelos.Cuestionario;

public interface GestionarCuestionarioGatewayIntPort {

    public Integer existeCuestionarioConNombre(String nombre);

    public Cuestionario crear(Cuestionario objCuestionario);

    public List<Cuestionario> listar();
}
