package pe.edu.upc.youngWorker.serviceinterfaces;
import pe.edu.upc.youngWorker.entities.Plan;

import java.util.List;

public interface IPlanService {
    public void insertar(Plan plan);
    List<Plan> list();
    public void delete(int idPlan);
    List<Plan>search(String descripcion);

}
