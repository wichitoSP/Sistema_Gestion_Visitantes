
package model;

import java.time.LocalDateTime;

public class VisitaModel {
    
    private String id;
    private VisitaModel visitante;
       private ResidenteModel residente;
       private LocalDateTime fechaHora;
       private String motivo;
       private boolean autorizada;

    public VisitaModel() {
    }

    public VisitaModel(String id, VisitaModel visitante, ResidenteModel residente, LocalDateTime fechaHora, String motivo, boolean autorizada) {
        this.id = id;
        this.visitante = visitante;
        this.residente = residente;
        this.fechaHora = fechaHora;
        this.motivo = motivo;
        this.autorizada = autorizada;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public VisitaModel getVisitante() {
        return visitante;
    }

    public void setVisitante(VisitaModel visitante) {
        this.visitante = visitante;
    }

    public ResidenteModel getResidente() {
        return residente;
    }

    public void setResidente(ResidenteModel residente) {
        this.residente = residente;
    }

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public boolean isAutorizada() {
        return autorizada;
    }

    public void setAutorizada(boolean autorizada) {
        this.autorizada = autorizada;
    }
    
    
       
       

    
    
    
}
