package pe.edu.upc.youngWorker.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.youngWorker.entities.Estudiante;
import pe.edu.upc.youngWorker.repositories.IEstudianteRepository;
import pe.edu.upc.youngWorker.repositories.IPlanRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IEstudianteService;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@RestController
public class EstudianteServiceImpl implements IEstudianteService {
    @Autowired
    private IEstudianteRepository eRepository;
    private IPlanRepository pRepository;
    @Override
    public boolean insertar(Estudiante estudiante) {
        Estudiante objEstudiante = eRepository.save(estudiante);

        if(objEstudiante == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idEstudiante) {
        eRepository.deleteById(idEstudiante);
    }

    @Override
    public List<Estudiante> listar() {
        return eRepository.findAll();
    }

    @Override
    public Optional<Estudiante> listarId(int idEstudiante){
        return eRepository.findById(idEstudiante);
    }

    @Override
    public List<Estudiante> buscarUsuario(String nombreEstudiante) {
        return eRepository.buscarUsuario(nombreEstudiante);
    }
    @Override
    public List<Estudiante> buscarEstudiante(String nombreEstudiante) {
        return eRepository.buscarEstudiante(nombreEstudiante);
    }
}