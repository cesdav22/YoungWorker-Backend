package pe.edu.upc.youngWorker.serviceinterfaces;
import pe.edu.upc.youngWorker.entities.Beca;


import java.util.List;

public interface IBecaService {
    public void insertar(Beca beca);
    List<Beca> list();
    public void delete (int idBeca);
    List<Beca>search(String beneficioBeca);

}
