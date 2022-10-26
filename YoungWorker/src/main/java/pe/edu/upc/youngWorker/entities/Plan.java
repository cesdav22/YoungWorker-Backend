package pe.edu.upc.youngWorker.entities;

import javax.persistence.*;

@Entity
@Table(name = "Plan")
public class Plan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idPlan;
    private double precio;
    @Column(name = "descripcion",length = 45,nullable = false)
    private String descripcion;
    @Column(name = "beneficio",length = 45,nullable = false)
    private String beneficio;

    public Plan() {
    }

    public Plan(int idPlan, double precio, String descripcion, String beneficio) {
        this.idPlan = idPlan;
        this.precio = precio;
        this.descripcion = descripcion;
        this.beneficio = beneficio;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(String beneficio) {
        this.beneficio = beneficio;
    }
}
