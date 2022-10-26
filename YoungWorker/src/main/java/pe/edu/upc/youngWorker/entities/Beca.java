package pe.edu.upc.youngWorker.entities;

import javax.persistence.*;

@Entity
@Table(name = "Beca")
public class Beca {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idBeca;
    @Column(name = "beneficioBeca",length = 45,nullable = false)
    private String beneficioBeca;
    @Column(name = "condicionBeca",length = 45,nullable = false)
    private String condicionBeca;

    public Beca() {
    }

    public Beca(int idBeca, String beneficioBeca, String condicionBeca) {
        this.idBeca = idBeca;
        this.beneficioBeca = beneficioBeca;
        this.condicionBeca = condicionBeca;
    }

    public int getIdBeca() {
        return idBeca;
    }

    public void setIdBeca(int idBeca) {
        this.idBeca = idBeca;
    }

    public String getBeneficioBeca() {
        return beneficioBeca;
    }

    public void setBeneficioBeca(String beneficioBeca) {
        this.beneficioBeca = beneficioBeca;
    }

    public String getCondicionBeca() {
        return condicionBeca;
    }

    public void setCondicionBeca(String condicionBeca) {
        this.condicionBeca = condicionBeca;
    }
}
