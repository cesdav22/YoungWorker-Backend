package pe.edu.upc.youngWorker.serviceimpls;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.youngWorker.entities.Beca;
import pe.edu.upc.youngWorker.repositories.IBecaRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IBecaService;

import java.util.List;

@Service
public class BecaServiceImpl implements IBecaService {
    @Autowired
    private IBecaRepository bR;
    @Override
    public void insertar(Beca beca) {
        bR.save(beca);
    }

    @Override
    public List<Beca> list() {
        return bR.findAll();
    }

    @Override
    public void delete(int idPropietario) {
        bR.deleteById(idPropietario);
    }

    @Override
    public List<Beca> search(String beneficioBeca) {
        return bR.buscarBeneficio(beneficioBeca);
    }
}
