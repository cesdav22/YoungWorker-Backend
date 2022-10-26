package pe.edu.upc.youngWorker.serviceinterfaces;
import pe.edu.upc.youngWorker.entities.Estudiante;

import java.util.List;

public interface IEstudianteService {
    public void insertar(Estudiante estudiante);
    List<Estudiante> list();
    public void delete(int idEstudiante);
    List<Estudiante>search(String nombreEstudiante);
}
