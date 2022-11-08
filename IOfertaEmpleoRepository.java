package pe.edu.upc.youngWorker.repositories;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import pe.edu.upc.youngWorker.entities.OfertaEmpleo;


@Repository
public interface IOfertaEmpleoRepository extends JpaRepository<OfertaEmpleo, Integer> {
    @Query("from OfertaEmpleo o where o.encargado.nombreEncargado like %:nombreEncargado%")
    List<OfertaEmpleo> buscarEncargado(@Param("nombreEncargado") String nombreEncargado);

    @Query("from OfertaEmpleo o where o.informaEmpleo like %:informaEmpleo")
    List<OfertaEmpleo> buscarOfertaEmpleo(@Param("informaEmpleo") String informaEmpleo);

}
