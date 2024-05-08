package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Telefonos")
@Getter
@Setter
public class TelefonoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idTelefono;

    @Column(nullable = false, unique = false, length = 30)
    private String tipoTelefono;

    @Column(nullable = false, unique = true, length = 30)
    private String numero;

    @OneToOne(cascade = {CascadeType.PERSIST})
    @JoinColumn(name = "idTelefono", referencedColumnName = "idTelefono")
    private DocenteEntity objDocente;

}
