package co.edu.unicauca.asae.segunda_parte_parcial.aplicacion.output;

public interface FormateadorResultadosIntPort {
    
    public void retornarRespuestaErrorEntidadExiste(String mensaje);

    public void retornarRespuestaErrorReglaDeNegocio(String mensaje);
}
