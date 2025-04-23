
package dao;

import java.util.List;
import model.VisitaModel;

public interface VisitaDao {
     void crear(VisitaModel VisitaModel);
    VisitaModel leer (int id);
    void actualizar(VisitaModel VisitaModel);
    void eliminar(VisitaModel VisitaModel);
    List<VisitaModel>listarTodos(); 
    
}
