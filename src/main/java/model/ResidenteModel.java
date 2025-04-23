
package model;
public class ResidenteModel {
    private int id;
    private String nombre;
    private String vivienda;
    private String telefono;

    public ResidenteModel() {
    }

    public ResidenteModel(int id, String nombre, String vivienda, String telefono) {
        this.id = id;
        this.nombre = nombre;
        this.vivienda = vivienda;
        this.telefono = telefono;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getVivienda() {
        return vivienda;
    }

    public void setVivienda(String vivienda) {
        this.vivienda = vivienda;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    
    
    
}
