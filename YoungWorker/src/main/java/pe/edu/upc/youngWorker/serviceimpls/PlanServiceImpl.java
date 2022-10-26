package pe.edu.upc.youngWorker.serviceimpls;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.upc.youngWorker.entities.Plan;
import pe.edu.upc.youngWorker.repositories.IPlanRepository;
import pe.edu.upc.youngWorker.serviceinterfaces.IPlanService;

import java.util.List;

@Service
public class PlanServiceImpl implements IPlanService {
    @Autowired
    private IPlanRepository pR;
    @Override
    public void insertar(Plan plan) {
        pR.save(plan);
    }

    @Override
    public List<Plan> list() {
        return pR.findAll();
    }

    @Override
    public void delete(int idPlan) {
        pR.deleteById(idPlan);
    }

    @Override
    public List<Plan> search(String descripcion) {
        return pR.buscarDescripcion(descripcion);
    }
}
