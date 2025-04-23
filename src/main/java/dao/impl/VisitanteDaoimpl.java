
package dao.impl;

import dao.VisitanteDao;
import java.util.ArrayList;
import java.util.List;
import model.VisitanteModel;

public class VisitanteDaoimpl implements VisitanteDao {
    
    private List<VisitanteModel> visitante = new ArrayList<>();

    @Override
    public void crear(VisitanteModel VisitanteModel) {
        
       visitante.add(VisitanteModel);
       
    }

    @Override
    public VisitanteModel leer(int id) {
       //return visitante filter(visitanteModel -> visitanteMdoel.getId()==id)
              // .findFirst()
               // .orElse(null);
               
               return null;
    }

    @Override
    public void actualizar(VisitanteModel VisitanteModel) {
        VisitanteModel existente = leer(VisitanteModel.getId());
        if (existente != null) {
            
            existente.setNombre(VisitanteModel.getNombre());
            
        }
    }

    @Override
    public void eliminar(VisitanteModel VisitanteModel) {
        //visitante.removeIf(visitanteModel -> visitanteModel.getId()== id);
    }

    @Override
    public List<VisitanteModel> listarTodos() {
        return new ArrayList<>(visitante);
    }
    
}
