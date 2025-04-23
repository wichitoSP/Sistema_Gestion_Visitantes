
package dao.impl;

import dao.ResidenteDao;
import java.util.ArrayList;
import java.util.List;
import model.ResidenteModel;

public class ResidenteDaoImpl implements ResidenteDao {
    
    private List<ResidenteModel> residente = new ArrayList<>();

    @Override
    public void crear(ResidenteModel ResidenteModel) {
        
        residente.add(ResidenteModel);    
    }

    @Override
    public ResidenteModel leer(int id) {
        return residente.stream()
              .filter(residenteModel -> residenteModel.getId()== id)
                .findFirst()
                .orElse(null);
               
    }

    @Override
    public void actualizar(ResidenteModel ResidenteModel) {
        
        ResidenteModel existente = leer(ResidenteModel.getId());
        
        if (existente !=null) {
            
            existente.setNombre(ResidenteModel.getNombre());
            
            
        }
        
       
    }

    @Override
    public void eliminar(ResidenteModel ResidenteModel) {
        //residente.removeIf(residneteModel -> ResidenteModel.getId()==id);
        
    }

    @Override
    public List<ResidenteModel> listarTodos() {
        return new ArrayList<>(residente);
    }
    
}
