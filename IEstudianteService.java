package pe.edu.upc.youngWorker.serviceinterfaces;

import pe.edu.upc.youngWorker.entities.Estudiante;
import pe.edu.upc.youngWorker.entities.Usuario;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface IEstudianteService {

    boolean insertar(Estudiante estudiante);

    @Transactional
    void eliminar(int idEstudiante);

    List<Estudiante> listar();

    Optional<Estudiante> listarId(int idEstudiante);

    List<Estudiante> buscarUsuario(String nombreEstudiante);

    List<Estudiante> buscarEstudiante(String nombreEstudiante);
}
