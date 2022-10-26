package pe.edu.upc.youngWorker.entities;

import javax.persistence.*;

@Entity
@Table(name="Usuario")
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idUsuario;
    @Column(name = "nameUsuario",length = 45,nullable = false)
    private String nameUsuario;
    @Column(name = "password",length = 45,nullable = false)
    private String password;

    public Usuario() {
    }

    public Usuario(int idUsuario, String nameUsuario, String password) {
        this.idUsuario = idUsuario;
        this.nameUsuario = nameUsuario;
        this.password = password;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNameUsuario() {
        return nameUsuario;
    }

    public void setNameUsuario(String nameUsuario) {
        this.nameUsuario = nameUsuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
