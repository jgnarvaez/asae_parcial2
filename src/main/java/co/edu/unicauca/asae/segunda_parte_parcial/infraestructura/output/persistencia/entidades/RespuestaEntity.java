package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "Respuestas")
public class RespuestaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idRespuesta;

    @ManyToOne
    @JoinColumn(name = "idDocente", nullable = false)
    private DocenteEntity objDocente;

    @ManyToOne
    @JoinColumn(name = "idPregunta", nullable = false)
    private PreguntaEntity objPregunta;

    @Column(nullable = false, length = 200)
    private String descripcion;

}
