package pe.edu.upc.youngWorker.serviceinterfaces;

import pe.edu.upc.youngWorker.entities.OfertaEmpleo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

public interface IOfertaEmpleoService {
    public boolean insertar(OfertaEmpleo oferta);

    @Transactional
    public void eliminar(int idEstudiante);

    public Optional<OfertaEmpleo> listarId(int idEstudiante);

    List<OfertaEmpleo> listar();

    List<OfertaEmpleo> buscarEmpleo(String infoEmpleo);

    List<OfertaEmpleo> buscarEncargado(String nombreEncargado);
}
