package pe.edu.upc.youngWorker.entities;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.*;



import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;

@Entity
@Table(name = "OfertaEmpleo")
public class OfertaEmpleo implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idOfertaEmpleo;

    @Column(name = "DescEmpleo", length = 60, nullable = false)
    private String descEmpleo;

    @Column(name = "PerfilTrabajo", length = 60, nullable = false)
    private String perfilTrabajo;

    @Column(name = "InformaEmpleo", length = 60, nullable = false)
    private String informaEmpleo;

    @Column(name = "HoraLaboral", length = 60, nullable = false)
    private String horaLaboral;

    @ManyToOne
    @JoinColumn(name = "idEncargado", nullable = false)
    private Encargado encargado;

    public OfertaEmpleo(int idOfertaEmpleo, String descEmpleo, String perfilTrabajo, String informaEmpleo, String horaLaboral, Encargado encargado) {
        this.idOfertaEmpleo = idOfertaEmpleo;
        this.descEmpleo = descEmpleo;
        this.informaEmpleo = informaEmpleo;
        this.horaLaboral = horaLaboral;
        this.encargado = encargado;
    }

    public OfertaEmpleo() {
        super();
    }


    public int getIdOfertaEmpleo() {
        return idOfertaEmpleo;
    }
    public void setIdOfertaEmpleo(int idOfertaEmpleo) {
        this.idOfertaEmpleo = idOfertaEmpleo;
    }

    public String getDescEmpleo() {
        return descEmpleo;
    }
    public void setDescEmpleo(String descEmpleo) {
        this.descEmpleo = descEmpleo;
    }

    public String getPerfilTrabajo() {
        return perfilTrabajo;
    }
    public void setPerfilTrabajo(String perfilTrabajo) {
        this.perfilTrabajo = perfilTrabajo;
    }

    public String getInformaEmpleo() {
        return informaEmpleo;
    }
    public void setInformaEmpleo(String informaEmpleo) {
        this.informaEmpleo = informaEmpleo;
    }

    public String getHoraLaboral() {
        return horaLaboral;
    }
    public void setHoraLaboral(String horaLaboral) {
        this.horaLaboral = horaLaboral;
    }

    public Encargado getEncargado() {
        return encargado;
    }
    public void setEncargado(Encargado encargado) {
        this.encargado = encargado;
    }
}