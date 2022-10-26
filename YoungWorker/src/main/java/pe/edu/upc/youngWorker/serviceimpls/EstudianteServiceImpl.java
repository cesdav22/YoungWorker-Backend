package pe.edu.upc.youngWorker.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.youngWorker.entities.Estudiante;
import pe.edu.upc.youngWorker.repositories.IEstudianteRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IEstudianteService;

import java.util.List;

@Service
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eR;
    @Override
    public void insertar(Estudiante estudiante) {
        eR.save(estudiante);
    }

    @Override
    public List<Estudiante> list() {
        return eR.findAll();
    }

    @Override
    public void delete(int idEstudiante) {
        eR.deleteById(idEstudiante);
    }

    @Override
    public List<Estudiante> search(String nombreEstudiante) {
        return eR.buscarNameEstudiante(nombreEstudiante);
    }
}
