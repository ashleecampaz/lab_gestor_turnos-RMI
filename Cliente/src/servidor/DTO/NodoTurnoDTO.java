package servidor.DTO;

import java.io.Serializable;

public class NodoTurnoDTO implements Serializable
{	
    private int numeroTurno;
    private String cantidadUsuariosFilaVirtual;
    private String identificacion;

    public NodoTurnoDTO(int numeroTurno, String cantidadUsuariosFilaVirtual, String identificacion) {
        this.numeroTurno = numeroTurno;
        this.cantidadUsuariosFilaVirtual = cantidadUsuariosFilaVirtual;
        this.identificacion = identificacion;
    }

    public int getNumeroTurno() {
        return numeroTurno;
    }

    public void setNumeroTurno(int numeroTurno) {
        this.numeroTurno = numeroTurno;
    }

    public String getCantidadUsuariosFilaVirtual() {
        return cantidadUsuariosFilaVirtual;
    }

    public void setCantidadUsuariosFilaVirtual(String cantidadUsuariosFilaVirtual) {
        this.cantidadUsuariosFilaVirtual = cantidadUsuariosFilaVirtual;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

  
    
       
}
