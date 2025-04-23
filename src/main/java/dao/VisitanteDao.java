
package dao;

import java.util.List;
import model.VisitanteModel;

public interface VisitanteDao {
    
     void crear(VisitanteModel VisitanteModel);
    VisitanteModel leer (int id);
    void actualizar(VisitanteModel VisitanteModel);
    void eliminar(VisitanteModel VisitanteModel);
    List<VisitanteModel>listarTodos(); 
    
}
