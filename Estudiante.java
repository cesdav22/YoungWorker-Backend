package pe.edu.upc.youngWorker.entities;


import javax.persistence.*;


@Entity
@Table(name = "Estudiante")
public class Estudiante {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idEstudiante;
    @Column(name = "nombreEstudiante",length = 45,nullable = false)
    private String nombreEstudiante;
    @Column(name = "nombreCarrera",length = 45,nullable = false)
    private String carreraEstudiante;
    @Column(name = "nombreUniversidad",length = 45,nullable = false)
    private String nombreUniversidad;

    @OneToOne
    @JoinColumn(name ="idUsuario ", nullable = false)
    private Usuario usuario;

    @ManyToOne
    @JoinColumn(name ="idPlan ", nullable = true)
    private Plan plan;






    public Estudiante(int idEstudiante, String nombreEstudiante, String carreraEstudiante, String nombreUniversidad, Usuario usuario, Plan plan) {
        this.idEstudiante = idEstudiante;
        this.nombreEstudiante = nombreEstudiante;
        this.carreraEstudiante = carreraEstudiante;
        this.nombreUniversidad = nombreUniversidad;
        this.usuario = usuario;
        this.plan = plan;
    }

    public Estudiante() {
        super();
    }



    public int getIdEstudiante() {
        return idEstudiante;
    }
    public void setIdEstudiante(int idEstudiante) {
        this.idEstudiante = idEstudiante;
    }

    public String getNombreEstudiante(){
        return nombreEstudiante;
    }
    public void setNombreEstudiante(String nombreEstudiante){
        this.nombreEstudiante = nombreEstudiante;
    }

    public String getCarreraEstudiante(){
        return carreraEstudiante;
    }
    public void setCarreraEstudiante(String carreraEstudiante){
        this.carreraEstudiante = carreraEstudiante;
    }

    public String getNombreUniversidad(){
        return nombreUniversidad;
    }
    public void setNombreUniversidad(String nombreUniversidad){
        this.nombreUniversidad = nombreUniversidad;
    }

    public Usuario getUsuario(){
        return usuario;
    }
    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }
}