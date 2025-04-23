
package dao;


import java.util.List;
import model.ResidenteModel;

public interface ResidenteDao {
    void crear(ResidenteModel ResidenteModel);
    ResidenteModel leer (int id);
    void actualizar(ResidenteModel ResidenteModel);
    void eliminar(ResidenteModel ResidenteModel);
    List<ResidenteModel>listarTodos();  
}
