package pe.edu.upc.youngWorker.serviceimpls;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.upc.youngWorker.entities.OfertaEmpleo;
import pe.edu.upc.youngWorker.repositories.IOfertaEmpleoRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IOfertaEmpleoService;

import javax.transaction.Transactional;


@RestController
public class OfertaEmpleoServiceImpl implements IOfertaEmpleoService {

    @Autowired
    private IOfertaEmpleoRepository oRepository;

    @Override
    public boolean insertar(OfertaEmpleo oferta) {
        OfertaEmpleo objOferta = oRepository.save(oferta);

        if(objOferta == null){
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    @Transactional
    public void eliminar(int idEstudiante) {
        oRepository.deleteById(idEstudiante);
    }

    @Override
    public Optional<OfertaEmpleo> listarId(int idEstudiante){
        return oRepository.findById(idEstudiante);
    }

    @Override
    public List<OfertaEmpleo> listar() {
        return oRepository.findAll();
    }

    @Override
    public List<OfertaEmpleo> buscarEmpleo(String infoEmpleo) {
        return oRepository.buscarOfertaEmpleo(infoEmpleo);
    }
    @Override
    public List<OfertaEmpleo> buscarEncargado(String nombreEncargado) {
        return oRepository.buscarEncargado(nombreEncargado) ;
    }
}
