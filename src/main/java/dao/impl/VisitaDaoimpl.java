
package dao.impl;

import dao.VisitaDao;
import java.util.ArrayList;
import java.util.List;
import model.VisitaModel;

public class VisitaDaoimpl implements VisitaDao {
    
    private List<VisitaModel> visita = new ArrayList<>();

    @Override
    public void crear(VisitaModel VisitaModel) {
        
        visita.add(VisitaModel);
        
    }

    @Override
    public VisitaModel leer(int id) {
       return visita.stream()
               .filter(visitaModel -> visitaModel.getId()==id)
               .findFirst()
                .orElse(null);
               
    }

    @Override
    public void actualizar(VisitaModel VisitaModel) {
        VisitaModel existente= leer(VisitaModel.getId());
        if (existente != null) {
            
            existente.setId(VisitaModel.getId());
            
            
        }
    }

    @Override
    public void eliminar(VisitaModel VisitaModel) {
       // visita.removeIf(VisitaModel -> VisitaModel.getId()== id);
        
    }

    @Override
    public List<VisitaModel> listarTodos() {
        return new ArrayList<>(visita);
    }
    
}
