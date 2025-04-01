/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servidor.DTO;

import java.io.Serializable;

/**
 *
 * @author Ashlee Campaz
 */
public class ModuloDTO implements Serializable {
    private int numeroModulo;
    private boolean ocupado;
    private int numeroTurno;
    private String identificacion; 

    public ModuloDTO(int numeroModulo, boolean ocupado, int numeroTurno, String identificacion) {
        this.numeroModulo = numeroModulo;
        this.ocupado = ocupado;
        this.numeroTurno = numeroTurno;
        this.identificacion = identificacion;
    }

    public int getNumeroModulo() {
        return numeroModulo;
    }

    public void setNumeroModulo(int numeroModulo) {
        this.numeroModulo = numeroModulo;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }
    
    
}
