package pe.edu.upc.youngWorker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.edu.upc.youngWorker.entities.Estudiante;

import java.util.List;

@Repository
public interface IEstudianteRepository extends JpaRepository<Estudiante,Integer> {
    @Query("from Estudiante e "+ "where e.nombreEstudiante like %:nombreEstudiante")
    List<Estudiante> buscarNameEstudiante(@Param("nombreEstudiante") String nombreEstudiante);
}
