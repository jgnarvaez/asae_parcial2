package co.edu.unicauca.asae.segunda_parte_parcial.infraestructura.output.persistencia.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Departamentos")
@Getter
@Setter
@AllArgsConstructor
public class DepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idDepartamento;

    @Column(nullable = false, length = 100,unique = true, name = "nombreDep")
    private String nombre;

    @Column(nullable = false, length = 100)
    private String descripcion;

    public DepartamentoEntity() {

    }
    
}
